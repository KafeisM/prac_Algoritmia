
package Cursos;

import practica_1.algorismia.Element;

/**
 *
 * @author Jordi
 */
public class Cursos extends Element {
    
   
    protected int codi_curs;
    protected ll_assignatures_ob_curs assigOb;
    protected ll_assignatures_op_curs assigOp;

    public Cursos(String n, int cod) {
        super(n);
        codi_curs = cod;    
    }
    
    public ll_assignatures_ob_curs getassigOb(){
        return assigOb;
    }
    
    public ll_assignatures_op_curs getassigOp(){
        return assigOp;
    }
    
    public String to_String(){
        return this.obtenir_nom();
  
    }

}
