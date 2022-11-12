
package Assignatures;

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
    
   
    
    public String getll_Estudiants(){
        return llista_est.toString();
    }
}
