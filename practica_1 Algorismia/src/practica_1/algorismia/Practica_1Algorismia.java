package practica_1.algorismia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Jordi
 */
public class Practica_1Algorismia extends JFrame implements ActionListener{


    public Practica_1Algorismia(){
        this.setTitle("Gestor col·legi");
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(Practica_1Algorismia.EXIT_ON_CLOSE);
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
