
package Estudiants;

import practica_1.algorismia.Interficie_elements;

/**
 *
 * @author jordi
 */
public class Estudiants implements Interficie_elements{
    
    String nom;
    int DNI;
    Estudiants seg;

    public Estudiants(String nom, int DNI){
        this.nom = nom;
        this.DNI = DNI;
        seg = null;
    }
    
    public void setSeg(Estudiants est){
        seg = est;
    }
    
    public Estudiants getSeg(){
        return seg;
    }
    
    public String toString(){
        return nom;
    }
    
    @Override
    public void donar_Alta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void donar_Baixa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
