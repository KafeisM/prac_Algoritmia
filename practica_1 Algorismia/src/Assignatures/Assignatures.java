package Assignatures;

import practica_1.algorismia.Element;

/**
 *
 * @author jordi
 */
public class Assignatures extends Element{
   
    protected int codi_assignatura;

    public Assignatures(String n, int codi) {
        super(n);
        this.codi_assignatura = codi;
    }
    
     public String to_String(){
        return this.obtenir_nom();
    }
}
