
package Assignatures;

import Estudiants.Estudiants;
import Excepcions.ErrorElementExistent;

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
    
    public boolean cerca_est(int dni){
        if (llista_est.cerca_est(dni)){
            return true;
        }else{
            return false;
        }
    }
    
    public int getCredits(){
        return credits;
    }
    
    public String ll_toString(){
        return llista_est.ll_toString();
    }
    
    public void insertar_est(Estudiants est) throws ErrorElementExistent{
        llista_est.insertar_element(0, est);
        llista_est = llista_est.ordenar();
    }
}
