
package Assignatures;

import Estudiants.Estudiants;
import practica_1.algorismia.ErrorElementExistent;

/**
 *
 * @author Jordi
 */
public class Obligatories extends Assignatures{
    private int credits;
    protected ll_estudiants_assigOB llista_est;

    public Obligatories(String nom, int codi, int credits) {
        super(nom, codi);
        this.credits = credits;
        llista_est = new ll_estudiants_assigOB();
    }
   
    public ll_estudiants_assigOB getll_Estudiants(){
        return llista_est;
    }
    
    public String ll_toString(){
        return llista_est.ll_toString();
    }
    
    public void insertar_est(Estudiants est) throws ErrorElementExistent{
        llista_est.insertar_element(0, est);
    }
}
