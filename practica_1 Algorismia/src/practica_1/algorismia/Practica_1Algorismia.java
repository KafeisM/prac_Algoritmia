package practica_1.algorismia;
import Excepcions.ErrorElementExistent;
import Excepcions.ErrorAssigNoExistent;
import Assignatures.Obligatories;
import Assignatures.Optatives;
import Assignatures.Perfil;
import static Assignatures.Perfil.PRÀCTIC;
import static Assignatures.Perfil.TEÒRIC;
import Assignatures.ll_assignatures;
import Cursos.Batxiller;
import Cursos.Cursos;
import Cursos.Enum_Cursos;
import Cursos.Enum_Especialitats;
import Cursos.FP;
import Cursos.ll_cursos;
import Estudiants.Estudiants;
import Estudiants.ll_estudiants;
import Vista.Pantalla;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordi
 */
public class Practica_1Algorismia {

    static private ll_cursos llista_cursos;
    static private ll_estudiants llista_estudiants;
    static private ll_assignatures llista_assignatures;
    static private int indexCursos = 0;
 
    public static void altaCurs(String nom, int codi, Enum_Especialitats esp, Enum_Cursos c, boolean esFP) {

        if (esFP) {
            //crear curs de FP
            FP curs_FP = new FP(nom, codi, esp);
            introduir_Obligatories(curs_FP);
            introduir_Optatives(curs_FP);
            llista_cursos.insertar_element(indexCursos, curs_FP);
            indexCursos++;

        } else {
            //crear curs de batxiller
            Batxiller curs_batx = new Batxiller(nom, codi, c);
            introduir_Obligatories(curs_batx);
            introduir_Optatives(curs_batx);
            llista_cursos.insertar_element(indexCursos, curs_batx);
            indexCursos++;
        }

        System.out.println(llista_cursos.ll_toString());

    }

    public static void baixacurs(String nom_curs) {
        try {
            llista_cursos.getCurs(nom_curs).eliminar_Assignatures_Curs(llista_assignatures);
            llista_cursos.eliminar_element(nom_curs);
            indexCursos--;
        } catch (ErrorElementExistent ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void baixaAssig(String nom_assig) {
        try {
            
            //donar baixa de la llista obligatoria o optativa
            llista_cursos.getCurs_assig(nom_assig).elimiar_ass(nom_assig,llista_assignatures.getAssig(nom_assig));
            //donar baixa llista general
            llista_assignatures.eliminar_element(nom_assig);
            llista_assignatures = llista_assignatures.ordenar();
            
        } catch (ErrorAssigNoExistent ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }

    private static void introduir_Obligatories(Cursos c) {
        int num_assig, codi, credits;
        String nom;

        num_assig = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantes assignatures OBLIGATORIES vols introduir?"));

        for (int j = 0; j < num_assig; j++) {
            nom = JOptionPane.showInputDialog(null, "Introdueix el nom de la assignatura");
            codi = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdueix el codi de la assignatura"));
            credits = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdueix els crèdits de la assignatura"));

            Obligatories ass_Ob = new Obligatories(nom, codi, credits);
            c.afegir_ass(ass_Ob, j); //afegir a la llista de obligatories del curs
            llista_assignatures.insertar_element(j, ass_Ob);
            llista_assignatures = llista_assignatures.ordenar();

        }

        System.out.println("*********************");
    }

    private static void introduir_Optatives(Cursos c) {
        int num_assig, codi;
        String nom;
        String[] options = {"TEÒRIC", "PRÀCTIC"};
        Perfil per = null;

        num_assig = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantes assignatures OPTATIVES vols introduir?"));

        for (int j = 0; j < num_assig; j++) {
            nom = JOptionPane.showInputDialog(null, "Introdueix el nom de la assignatura");
            codi = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdueix el codi de la assignatura"));

            switch (JOptionPane.showOptionDialog(null, "Selecciona el perfil de la assignatura",
                    "Perfil Assignatures",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0])) {
                case 0:
                    per = TEÒRIC;
                    break;
                case 1:
                    per = PRÀCTIC;
                    break;
            }
            Optatives ass_Op = new Optatives(nom, codi, per);
            c.afegir_ass(ass_Op, j); //afegir a la llista de optatives del curs

            llista_assignatures.insertar_element(j, ass_Op);
            llista_assignatures = llista_assignatures.ordenar();

        }
        System.out.println("*********************");

    }

    //inserir estudiant a un curs i assignatura
    //inserir el mateix estudiant a la llista d'estudiants
    public static void mat_estudiants(String nom_estudiant, int DNI, String nom_assig) {

        try {
            if (llista_assignatures.getAssig(nom_assig) == null) {
                JOptionPane.showMessageDialog(null, "ERROR ASSIGNATURA NO TROBADA", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                Estudiants est = new Estudiants(nom_estudiant, DNI);
                llista_cursos.insertar_est(est, llista_assignatures.getAssig(nom_assig));

                Estudiants est2 = new Estudiants(nom_estudiant, DNI);
                llista_estudiants.insertar_element(0, est2);
                llista_estudiants = llista_estudiants.ordenar();
                
                //eliminar
                System.out.println(llista_estudiants.ll_toString());
            }

        } catch (ErrorElementExistent exc2) {
            JOptionPane.showMessageDialog(null, exc2.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ErrorAssigNoExistent ex) {
            JOptionPane.showMessageDialog(null, "Error Llista buida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static String est_assig_Curs(String nom_curs) {
        String res = "";
        try {
            Cursos curs = llista_cursos.getCurs(nom_curs);
            if (curs.getassigOb().get_tamany() == 0) {
                res += "No hi ha assig. OBLIGATORIES";
            }
            //System.out.println("5: " + curs.getassigOb().get_tamany());
            for (int i = 0; i < curs.getassigOb().get_tamany(); i++) {

                res += "Assignatura Obligatoria " + i + ": " + curs.getassigOb().getAssig(i).to_String()
                        + " [ Codi: " + curs.getassigOb().getAssig(i).getCodi() + " | Credits: "
                        + curs.getassigOb().getAssig(i).getCredits() + " ]" + "\n";
                res += "Estudiants: " + curs.getassigOb().getAssig(i).ll_toString() + "\n";
            }
            res += "\n";
            if (curs.getassigOp().get_tamany() == 0) {
                res += "No hi ha assig. OPTATIVES";
            }
            //System.out.println("5: " + curs.getassigOb().get_tamany());
            for (int i = 0; i < curs.getassigOp().get_tamany(); i++) {

                res += "Assignatura Optativa " + i + ": " + curs.getassigOp().getAssig(i).to_String()
                        + " [ Codi: " + curs.getassigOp().getAssig(i).getCodi() + " | Perfil: "
                        + curs.getassigOp().getAssig(i).getPerfil() + " ]" + "\n";
                res += "Estudiants: " + curs.getassigOp().getAssig(i).ll_toString() + "\n";
            }
            res += "\n";
        } catch (ErrorElementExistent ex) {
            res += ex.getMessage();    //error curs no existent
        }

        return res;

    }

    public static String est_curs_assig(String nom_assig) {
        String res = "";
        try {
            Cursos aux = llista_cursos.getCurs_assig(nom_assig);
            res += ("Curs: " + aux.to_String()) + " [ Tipus: " + aux.getTipus() + " | Especialitat: "
                    + aux.getEspecialitat() + " ]\n";
            res += (aux.getll_est_Assig(nom_assig));
        } catch (ErrorAssigNoExistent e) {
            res += "Error: " + e.getMessage();
        }
        return res;

    }

    public static String assigsicurs_est2(int dni) {
        String res = "";
        int cont = 0;
        for (int i = 0; i < llista_cursos.get_tamany(); i++) {
            //System.out.println("main: |" + llista_cursos.getCurs(i).getAssig_est(dni));
            if (llista_cursos.getCurs(i).getAssig_est(dni).compareTo("") == 0) {
                cont++;
            } else {
                Cursos aux = llista_cursos.getCurs(i);
                res += "Curs: " + (aux.to_String()) + " [ Tipus: " + aux.getTipus() + " | Especialitat: "
                        + aux.getEspecialitat() + " ] \n";
                res += "Assignatures: " + (aux.getAssig_est(dni) + "| \n");
            }
        }
        if (cont == llista_cursos.get_tamany()) {
            res += "No existeix l'estudiant";
        }
        return res;
    }
    
    public static String assigsicurs_est(int dni) {
        
 
        String res = "";
        boolean existeix = false;
        int i;

        for(i = 0; i < llista_cursos.get_tamany(); i++){
            if (!"".equals(llista_cursos.getCurs(i).getAssig_est(dni))){
                res += llista_cursos.getCurs(i).getAssig_est(dni) 
                        + "Curs: " + llista_cursos.getCurs(i).to_String() + "\n";
                existeix = true;  
            }
        }
        
        if(existeix == false){
            res += "Error, no es posible realitzar la cerca";
        }
        
        return res;
    }


    public static void main(String[] args) {
        Pantalla pant = new Pantalla();
        pant.setVisible(true);
        pant.setTitle("GESTOR COL·LEGI");
        pant.setLocationRelativeTo(null);
        llista_cursos = new ll_cursos();
        llista_assignatures = new ll_assignatures();
        llista_estudiants = new ll_estudiants();
    }

}
