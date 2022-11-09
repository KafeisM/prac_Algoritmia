
package Assignatures;

import practica_1.algorismia.Interficie_elements;

/**
 *
 * @author Jordi
 */
public class Obligatories extends Assignatures implements Interficie_elements {
    private int credits;

    public Obligatories(String nom, int codi, int credits) {
        super(nom, codi);
        this.credits = credits;
    }
}
