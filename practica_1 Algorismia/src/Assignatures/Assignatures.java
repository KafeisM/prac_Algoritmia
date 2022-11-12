package Assignatures;

import practica_1.algorismia.Element;

/**
 *
 * @author jordi
 */
public class Assignatures extends Element{
   
    protected int codi_assignatura;
    protected Assignatures seg;

    public Assignatures(String n, int codi) {
        super(n);
        this.codi_assignatura = codi;
        seg = null;
    }
    
    public void setSeg(Assignatures assig){
        this.seg = assig;
    }
    
    public Assignatures getSeg(){
        return seg;
    }
    
     public String to_String(){
        return this.obtenir_nom();
    }
}
