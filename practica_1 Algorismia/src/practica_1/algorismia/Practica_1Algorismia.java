package practica_1.algorismia;
import Excepcions.ErrorElementExistent;
import Assignatures.Assignatures;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jordi
 */
public class Practica_1Algorismia {

    static private ll_cursos llista_cursos;
    static private ll_estudiants llista_estudiants;
    static private ll_assignatures llista_assignatures;
    
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
                    altaCurs();
                    System.out.println("Llista temporal de cursos:\n " + llista_cursos.ll_toString());
                    System.out.println("Llista temporal de assignatures:\n"  + llista_assignatures.ll_toString());
                    opcio = entrada_Int(menu);
                    break;
                case 2:
                    System.out.println("Abans Llista estudiants:\n " + llista_estudiants.ll_toString());
                    mat_estudiants();
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
                    est_assig_Curs();
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
    
    
    
    private static void altaCurs(){
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

        num_assig = entrada_Int("Quantes assignatures obligatories vols introduir? ");

        for (int j = 0; j < num_assig; j++) {
            nom = entrada_String("Introdueix el nom de la assignatura:");
            codi = entrada_Int("Introdueix el codi de la assignatura:");
            credits = entrada_Int("Introdueix els credits de la assignatura:");
            
            Obligatories ass_Ob = new Obligatories(nom, codi, credits);
            
            c.afegir_ass(ass_Ob, j); //afegir a la llista de obligatories del curs
            llista_assignatures.insertar_element(j, ass_Ob);
            
        }

        System.out.println("*********************");
    }

    private static void introduir_Optatives(Cursos c) {
        int num_assig, codi;
        String nom;
        Perfil per = null;

        num_assig = entrada_Int("Quantes assignatures optatives vols introduir? ");

        for (int j = 0; j < num_assig; j++) {
            nom = entrada_String("Introdueix el nom de la assignatura:");
            codi = entrada_Int("Introdueix el codi de la assignatura:");
            switch (entrada_Int("Tria quin perfil es: \n"
                    + "1. TEÒRIC\n"
                    + "2. PRÀCTIC")) {
                case 1:
                    per = TEÒRIC;
                    break;
                case 2:
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
    private static void mat_estudiants(){
        
        
        try{
            String nom_estudiant = entrada_String("Nom de l'estudiant: ");
            int DNI = entrada_Int("DNI de l'estudiant: ");
            String nom_assig = entrada_String("Nom assignatura: ");
            
            Estudiants est = new Estudiants(nom_estudiant,DNI);
            llista_cursos.insertar_est(est,llista_assignatures.getAssig(nom_assig));
            
            Estudiants est2 = new Estudiants(nom_estudiant,DNI);
            llista_estudiants.insertar_element(0, est2);
            
        }catch(ErrorElementExistent exc2){
            System.out.println("Error: "+exc2.getMessage());
        }
              
    }
    
    private static void est_assig_Curs(){

        try {
            String nom_curs = entrada_String("Nom del curs: ");
            Cursos curs = llista_cursos.getCurs(nom_curs);
            System.out.println("Nom curs: " + curs.obtenir_nom());
            if (curs.getassigOb().get_tamany() == 0){
                System.out.println("No hi ha assig. OB");
            }
            //System.out.println("5: " + curs.getassigOb().get_tamany());
            for (int i=0; i<curs.getassigOb().get_tamany(); i++){
                System.out.println("Assignatura Ob " + i + ": " + curs.getassigOb().getAssig(i).to_String());
                System.out.println(curs.getassigOb().getAssig(i).ll_toString());
            }
            if (curs.getassigOp().get_tamany() == 0){
                System.out.println("No hi ha assig. OP");
            }
            //System.out.println("5: " + curs.getassigOb().get_tamany());
            for (int i=0; i<curs.getassigOp().get_tamany(); i++){
                System.out.println("Assignatura Op " + i + ": " + curs.getassigOp().getAssig(i).to_String());
                System.out.println(curs.getassigOp().getAssig(i).ll_toString());
            }
        } catch (ErrorElementExistent ex) {
            System.out.println(ex.getMessage());    //error curs no existent
        }
        
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
                System.out.println(llista_cursos.getCurs(i).getAssig_est(dni));
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
        Practica_1Algorismia et = new Practica_1Algorismia();
        //et.setVisible(true);
    }


    
}
