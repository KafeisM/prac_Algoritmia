
package Assignatures;

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
    
    public ll_estudiants_assigOP getll_Estudiants(){
        return llista_est;
    }
    
    public String ll_toString(){
        return llista_est.ll_toString();
    }
    
}
