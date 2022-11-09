package Cursos;

import practica_1.algorismia.Interficie_elements;

/**
 *
 * @author Jordi
 */

public class Batxiller extends Cursos implements Interficie_elements{
    private Enum_Cursos curs;

    public Batxiller(String nom, int codi, Enum_Cursos curs) {
        super(nom, codi);
        this.curs = curs;
    }
    
    
}
