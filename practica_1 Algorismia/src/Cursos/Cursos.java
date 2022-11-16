

package Cursos;

import Assignatures.Assignatures;
import Assignatures.Obligatories;
import Estudiants.Estudiants;
import practica_1.algorismia.Element;
import Excepcions.ErrorElementExistent;

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
    
    public String getAssig_est(int dni){
        String res = "";
        res += ll_assigOb.getAssig_est(dni).to_String() + "";
        res += ll_assigOp.getAssig_est(dni).to_String() + "";
        //System.out.println("Cursos:" + res + "|");
        return res;
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
    
    private boolean cercaAssigOb(String nom_assig){
        return ll_assigOb.cercaAssig(nom_assig);
    }
    
    private boolean cercaAssigOp(String nom_assig){
        return ll_assigOp.cercaAssig(nom_assig);
    }

    boolean cercaAssig(String nom_assig) {
        if (cercaAssigOb(nom_assig) || cercaAssigOp(nom_assig)){
            return true;
        }else{
            return false;
        }
    }

    public String getll_est_Assig(String nom_assig) {
        if(cercaAssigOb(nom_assig)){
            return ll_assigOb.getAssig(nom_assig).ll_toString();
        }else{
            return ll_assigOp.getAssig(nom_assig).ll_toString();
        }
    }

}
