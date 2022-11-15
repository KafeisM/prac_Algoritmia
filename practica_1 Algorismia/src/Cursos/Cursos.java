

package Cursos;

import Assignatures.Assignatures;
import Assignatures.Obligatories;
import Estudiants.Estudiants;
import practica_1.algorismia.Element;
import practica_1.algorismia.ErrorElementExistent;

/**
 *
 * @author Jordi
 */
public class Cursos extends Element {

    protected int codi_curs;
    protected ll_assignatures_ob_curs ll_assigOb;
    protected ll_assignatures_op_curs ll_assigOp;

    public Cursos(String n, int cod) {
        super(n);
        codi_curs = cod;    
        ll_assigOb = new ll_assignatures_ob_curs();
        ll_assigOp = new ll_assignatures_op_curs();
    }
    
       public void afegir_ass(Assignatures a, int i){
       if(a instanceof Obligatories){
           ll_assigOb.insertar_element(i, a);
       }else{
           ll_assigOp.insertar_element(i, a);
       }   
    }
       
    public void insertar_estudiant(Estudiants est, Assignatures assig) throws ErrorElementExistent{
        ll_assigOb.insertar_est_assig(est,assig);
        ll_assigOp.insertar_est_assig(est,assig);
    }
    
    public ll_assignatures_ob_curs getassigOb(){
        return ll_assigOb;
    }
    
    public ll_assignatures_op_curs getassigOp(){
        return ll_assigOp;
    }
    
    public String to_String(){
        return this.obtenir_nom();
  
    }

}
