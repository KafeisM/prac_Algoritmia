package Assignatures;

import practica_1.algorismia.Interficie_elements;

/**
 *
 * @author jordi
 */
public class Assignatures implements Interficie_elements {
    protected String nom_assignatura;
    protected int codi_assignatura;
    
    public Assignatures(String nom, int codi){
        this.nom_assignatura = nom;
        this.codi_assignatura = codi;
    }
    
    public String toString(){
        return nom_assignatura;
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
