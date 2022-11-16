
package Assignatures;

import Estudiants.Estudiants;
import Excepcions.ErrorElementExistent;

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
    
    public boolean cerca_est(int dni){
        if (llista_est.cerca_est(dni)){
            return true;
        }else{
            return false;
        }
    }
    
    public ll_estudiants_assigOP getll_Estudiants(){
        return llista_est;
    }
    
    public String ll_toString(){
        return llista_est.ll_toString();
    }
    
    public void insertar_est(Estudiants est) throws ErrorElementExistent{
        llista_est.insertar_element(0, est);
    }
    
}
