
package Assignatures;

import practica_1.algorismia.Interficie_elements;

/**
 *
 * @author Jordi
 */
public class Optatives extends Assignatures{
    
    private Perfil perfil;
    protected ll_estudiants_assigOP llista_est;
    
    public Optatives(String nom, int codi, Perfil per) {
        super(nom, codi);
        this.perfil = per;
        this.llista_est = new ll_estudiants_assigOP();
    }
    
    public String getll_Estudiants(){
        return llista_est.toString();
    }
    
}
