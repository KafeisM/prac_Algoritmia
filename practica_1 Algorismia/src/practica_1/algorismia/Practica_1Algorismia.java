package practica_1.algorismia;

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


    public Practica_1Algorismia(){
        this.setTitle("GESTOR COL·LEGI");
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(Practica_1Algorismia.EXIT_ON_CLOSE);
        
        boolean sortir = false;
        int opcio = entrada_Int("1. Alta curs\n"
                + "2. Matricular estudiant\n"
                + "3. Baixa curs\n"
                + "4. Baixa assignatura\n"
                + "5. Llistar assignatures d'un curs\n"
                + "6. Curs al que pertany una assignatura\n"
                + "7. Assignatures d'un estudiant\n"
                + "Opcio: ");
        while (!sortir){
            switch(opcio){
                case 1:
                    altaCurs();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    assignaturesCurs();
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                default:
                    sortir = true;
            }
        }
    }
    
    private static void altaCurs(){
        ll_cursos llista_cursos = new ll_cursos(entrada_Int("Quants de cursos vols introduir? "));
    }
    
    private static void assignaturesCurs(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nom del curs: ");
        String nom_curs = sc.nextLine();
        
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
            
            return sortida;
        } catch (IOException ex) {
            Logger.getLogger(Practica_1Algorismia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sortida;
    }
    
    public static void main(String[] args) {
        Practica_1Algorismia et = new Practica_1Algorismia();
        et.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
