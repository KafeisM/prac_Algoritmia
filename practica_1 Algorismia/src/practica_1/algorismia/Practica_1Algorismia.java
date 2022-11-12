package practica_1.algorismia;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Jordi
 */
public class Practica_1Algorismia extends JFrame implements ActionListener{

    static private ll_cursos llista_cursos;
    
    public Practica_1Algorismia(){
        this.setTitle("GESTOR COL·LEGI");
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(Practica_1Algorismia.EXIT_ON_CLOSE);
        
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
        while (!sortir){
            switch(opcio){
                case 1:
                    altaCurs();
                    opcio = entrada_Int(menu);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    est_assig_Curs();
                    opcio = entrada_Int(menu);
                    break;
                case 6:
                    est_curs_assig();
                    break;
                case 7:
                    
                    break;
                default:
                    sortir = true;
            }
        }
    }
    
    private static void altaCurs(){
        int num_curs = entrada_Int("Quants de cursos vols introduir? ");
        String nom;
        int codi;
        
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
                llista_cursos.insertar_element(i, curs_batx);
                
                System.out.println("*********************");
                
            }
        }
        
        
    }
    
    private static void est_assig_Curs(){

        String nom_curs = entrada_String("Nom del curs: ");
        Cursos curs = llista_cursos.getCurs(nom_curs);
        for (int i=0; i<curs.getassigOb().get_tamany(); i++){
            System.out.println("Assignatura Ob " + i + ": " + curs.getassigOb().getAssig(i).to_String());
            System.out.println(curs.getassigOb().getAssig(i).getll_Estudiants().toString());
        }
        
        for (int i=0; i<curs.getassigOp().get_tamany(); i++){
            System.out.println("Assignatura Op " + i + ": " + curs.getassigOp().getAssig(i).to_String());
            System.out.println(curs.getassigOp().getAssig(i).getll_Estudiants().toString());
        }
        
    } 
    
    private static void est_curs_assig(){
        String nom_assig = entrada_String("Nom de l'assignatura: ");
        Assignatura assig;
    }
    
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
        llista_cursos = new ll_cursos();
        et.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
