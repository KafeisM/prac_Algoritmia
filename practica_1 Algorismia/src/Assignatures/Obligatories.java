
package Assignatures;

/**
 *
 * @author Jordi
 */
public class Obligatories extends Assignatures{
    private int credits;

    public Obligatories(String nom, int codi, int credits) {
        super(nom, codi);
        this.credits = credits;
    }
}
