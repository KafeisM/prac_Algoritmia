package Cursos;

import practica_1.algorismia.Interficie_elements;

/**
 *
 * @author Usuario
 */
public class FP extends Cursos implements Interficie_elements {
    private Enum_Especialitats especialitat;
    
    public FP(String nom, int codi,Enum_Especialitats esp ) {
        super(nom, codi);
        this.especialitat = esp;
    }
    
}
