package practica_1.algorismia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
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
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Alta curs\n"
                + "2. Matricular estudiant\n"
                + "3. Baixa curs\n"
                + "4. Baixa assignatura\n"
                + "5. Llistar assignatures d'un curs\n"
                + "6. Curs al que pertany una assignatura\n"
                + "7. Assignatures d'un estudiant\n"
                + "Opcio: ");
        boolean sortir = false;
        int opcio = sc.nextInt();
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
    
    private static void assignaturesCurs(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nom del curs: ");
        String nom_curs = sc.nextLine();
        
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
