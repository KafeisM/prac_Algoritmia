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
import static Cursos.Enum_Cursos.PRIMER;
import static Cursos.Enum_Cursos.SEGON;
import Cursos.Enum_Especialitats;
import static Cursos.Enum_Especialitats.ELECTRÓNICA;
import static Cursos.Enum_Especialitats.INFORMÀTICA;
import static Cursos.Enum_Especialitats.MECÀNICA;
import Cursos.FP;
import Cursos.ll_cursos;
import Estudiants.Estudiants;
import Estudiants.ll_estudiants;
import Vista.Pantalla;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public Practica_1Algorismia(){
       /* this.setTitle("GESTOR COL·LEGI");
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(Practica_1Algorismia.EXIT_ON_CLOSE); */
        
        boolean sortir = false;
        String menu = "1. Alta curs\n"
                + "2. Matricular estudiant\n"
                + "3. Baixa curs\n"
                + "4. Baixa assignatura\n"
                + "5. Llistar assignatures d'un curs\n"
                + "6. Curs al que pertany una assignatura\n"
                + "7. Assignatures d'un estudiant\n"
                + "Opcio: ";
        
        int opcio = entrada_Int(menu);
        llista_cursos = new ll_cursos();
        llista_assignatures = new ll_assignatures();
        llista_estudiants = new ll_estudiants();
        while (!sortir){
            switch(opcio){
                case 1:
                    //altaCurs();
                    System.out.println("Llista temporal de cursos:\n " + llista_cursos.ll_toString());
                    System.out.println("Llista temporal de assignatures:\n"  + llista_assignatures.ll_toString());
                    opcio = entrada_Int(menu);
                    break;
                case 2:
                    System.out.println("Abans Llista estudiants:\n " + llista_estudiants.ll_toString());
                    System.out.println("Llista estudiants:\n " + llista_estudiants.ll_toString());
                    opcio = entrada_Int(menu);
                    break;
                case 3:
                    baixacurs();
                    System.out.println("Llista temporal de cursos actuals:\n " + llista_cursos.ll_toString());
                    opcio = entrada_Int(menu);
                    break;
                case 4:
                    baixaAssig();
                    System.out.println("Llista temporal de assignatures actuals:\n " + llista_assignatures.ll_toString());
                    opcio = entrada_Int(menu);
                    break;
                case 5:
                    opcio = entrada_Int(menu);
                    break;
                case 6:
                    est_curs_assig();
                    opcio = entrada_Int(menu);
                    break;
                case 7:
                    assigsicurs_est();
                    opcio = entrada_Int(menu);
                    break;
                default:
                    sortir = true;
                    break;
            }
        }
    }
    
    public static void altaCurs2(String nom, int codi, Enum_Especialitats esp, Enum_Cursos c, boolean esFP){

            if(esFP){
                //crear curs de FP
                FP curs_FP = new FP(nom,codi,esp);        
                introduir_Obligatories(curs_FP);
                introduir_Optatives(curs_FP);
                llista_cursos.insertar_element(indexCursos, curs_FP);
                indexCursos++;
                
            }else{
                //crear curs de batxiller
                Batxiller curs_batx = new Batxiller(nom,codi,c);   
                introduir_Obligatories(curs_batx);
                introduir_Optatives(curs_batx);
                llista_cursos.insertar_element(indexCursos, curs_batx);
                indexCursos++;
            }
        
        System.out.println(llista_cursos.ll_toString());
        
    }
    
    
    public static void altaCurs(){
        int num_curs = entrada_Int("Quants de cursos vols introduir? ");
        int codi;
        String nom;
        

        for(int i = 0; i < num_curs; i++){
            if(entrada_Int("Introduix quin tipus de curs es\n"
                    + "1. Formació professional\n"
                    + "2. Batxiller") == 1){
                //crear curs de FP
                Enum_Especialitats esp = null;
                nom = entrada_String("Introdueix el nom del curs");
                codi = entrada_Int("Introdueix el codi del curs");
                
                switch (entrada_Int("Tria una especialitat del FP\n"
                        + "1. Mecànica\n"
                        + "2. Electrònica\n"
                        + "3. Informàtica")){
                    case 1:
                        esp = MECÀNICA;
                        break;
                    case 2:
                        esp = ELECTRÓNICA;
                        break;
                    case 3:
                        esp = INFORMÀTICA;
                        
                }
                
                FP curs_FP = new FP(nom,codi,esp);        
                
                introduir_Obligatories(curs_FP);
                introduir_Optatives(curs_FP);
                llista_cursos.insertar_element(i, curs_FP);
                
                System.out.println("*********************");
                
            }else{
                //crear curs de batxiller
                Enum_Cursos c = null;
                nom = entrada_String("Introdueix el nom del curs");
                codi = entrada_Int("Introdueix el codi del curs");
                
                switch (entrada_Int("Tria quin any es de Batxiller\n"
                        + "1. Primer\n"
                        + "2. Segon")){
                    case 1:
                        c = PRIMER;
                        break;
                    case 2:
                        c = SEGON;
                        break;
                    
                }
                
                Batxiller curs_batx = new Batxiller(nom,codi,c);   
                introduir_Obligatories(curs_batx);
                introduir_Optatives(curs_batx);
                llista_cursos.insertar_element(i, curs_batx);
                System.out.println("*********************");
                
            }
        }
        
        
    }
    
    private static void baixacurs(){
        String nom_curs = entrada_String("Nom del curs: ");
        llista_cursos.eliminar_element(nom_curs);
    }
    
    private static void baixaAssig(){
        String nom_assig = entrada_String("Nom de la assignatura: ");
        llista_assignatures.eliminar_element(nom_assig);
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
            
        }

        System.out.println("*********************");
    }

    private static void introduir_Optatives(Cursos c) {
        int num_assig, codi;
        String nom;
        String[] options = {"TEÒRIC","PRÀCTIC"};
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

        }
        System.out.println("*********************");

    }
    
    //inserir estudiant a un curs i assignatura
    //inserir el mateix estudiant a la llista d'estudiants
    public static void mat_estudiants(String nom_estudiant, int DNI, String nom_assig){
        
        
        try{
            
            Estudiants est = new Estudiants(nom_estudiant,DNI);
            llista_cursos.insertar_est(est,llista_assignatures.getAssig(nom_assig));
            
            Estudiants est2 = new Estudiants(nom_estudiant,DNI);
            llista_estudiants.insertar_element(0, est2);
            
        }catch(ErrorElementExistent exc2){
            JOptionPane.showMessageDialog(null, exc2.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
              
    }
    
    public static String est_assig_Curs(String nom_curs){
        String res="";
        try {
            Cursos curs = llista_cursos.getCurs(nom_curs);
            if (curs.getassigOb().get_tamany() == 0){
                res+= "No hi ha assig. OB";
            }
            //System.out.println("5: " + curs.getassigOb().get_tamany());
            for (int i=0; i<curs.getassigOb().get_tamany(); i++){
                res += "Assignatura Obligatoria " + i + ": " + curs.getassigOb().getAssig(i).to_String() +"\n";
                res += " " + curs.getassigOb().getAssig(i).ll_toString();
            }
            res+="\n";
            if (curs.getassigOp().get_tamany() == 0){
                res += "No hi ha assig. OP";
            }
            //System.out.println("5: " + curs.getassigOb().get_tamany());
            for (int i=0; i<curs.getassigOp().get_tamany(); i++){
                res += "Assignatura Optativa " + i + ": " + curs.getassigOp().getAssig(i).to_String() +"\n";
                res += " " + curs.getassigOp().getAssig(i).ll_toString();
            }
            res+="\n";
        } catch (ErrorElementExistent ex) {
            res += ex.getMessage();    //error curs no existent
        }
        
        return res;
        
    } 
    
    private static void est_curs_assig(){
         
        try{
            String nom_assig = entrada_String("Nom assignatura: ");
            Cursos aux = llista_cursos.getCurs_assig(nom_assig);
            System.out.println("Curs: " + aux.to_String());
            System.out.println("Llista estudiants: " + aux.getll_est_Assig(nom_assig));
        }catch(ErrorAssigNoExistent e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void assigsicurs_est(){
        
        int dni = entrada_Int("DNI de l'estudiant: ");
        String assigs;
        int cont = 0;
        for (int i=0;i < llista_cursos.get_tamany(); i++){
            //System.out.println("main: |" + llista_cursos.getCurs(i).getAssig_est(dni));
            if(llista_cursos.getCurs(i).getAssig_est(dni).compareTo("") == 0){
                cont++;
            }else{
                System.out.println("Curs :" + llista_cursos.getCurs(i).to_String());
                System.out.println(llista_cursos.getCurs(i).getAssig_est(dni) + "|");
            }
        }
        if(cont == llista_cursos.get_tamany()){
            System.out.println("No existeix l'estudiant");
        }
        
    }
    
    //METODES PER ENTRADA DADES
    
    private static String entrada_String(String entrada){
        String sortida = null;
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(entrada);
            sortida = br.readLine();  
        } catch (IOException ex) {
            Logger.getLogger(Practica_1Algorismia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortida;
    }

    private static int entrada_Int(String entrada){
        int sortida = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(entrada);
            sortida = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Practica_1Algorismia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortida;
    }
    
    public static void main(String[] args) {
        Pantalla pant = new Pantalla();
        pant.setVisible(true);
        llista_cursos = new ll_cursos();
        llista_assignatures = new ll_assignatures();
        llista_estudiants = new ll_estudiants();
    }


    
}
