

package Cursos;

import Assignatures.Assignatures;
import Assignatures.Obligatories;
import Assignatures.ll_assignatures;
import Estudiants.Estudiants;
import Excepcions.ErrorAssigNoExistent;
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
    
    public void eliminar_Assignatures_Curs(ll_assignatures llista_assignatures){
        //eliminar assignatures de la llista general donat un curs
        for(int i = 0; i<ll_assigOb.get_tamany();i++){
            llista_assignatures.eliminar_element(ll_assigOb.getAssig(i).to_String());
        }
        for(int j = 0; j<ll_assigOp.get_tamany();j++){
            llista_assignatures.eliminar_element(ll_assigOp.getAssig(j).to_String());
        }
    }
    
    //eliminar assignatures de la llista propia donat el seu nom
    public void elimiar_ass(String nom, Assignatures a){
         if(a instanceof Obligatories){
           ll_assigOb.eliminar_element(nom);
       }else{
           ll_assigOp.eliminar_element(nom);
       }       
    }

    
    public String getAssig_est(int dni){
        String res = "";
        if (ll_assigOb.getAssig_est(dni) != null) {
            res += ll_assigOb.getAssig_est(dni) + "\n";
        }

        if (ll_assigOp.getAssig_est(dni) != null) {
            res += ll_assigOp.getAssig_est(dni) + "\n";
        }

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
    
    public String getTipus(){
        if(this instanceof FP){
            return "FP";
        }else{
            return "Batxiller";
        }
    }
    
    public String getEspecialitat(){
        if(this instanceof FP){
            FP aux = (FP)this;
            return (aux.getEspecialitat());
        }else{
            Batxiller aux = (Batxiller)this;
            return (aux.getEspecialitat());
        }
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
