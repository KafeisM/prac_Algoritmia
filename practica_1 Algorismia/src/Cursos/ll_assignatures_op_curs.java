
package Cursos;

import Assignatures.Assignatures;
import Assignatures.Optatives;
import Estudiants.Estudiants;
import java.util.ArrayList;
import practica_1.algorismia.Element;
import Excepcions.ErrorElementExistent;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author jordi
 */
public class ll_assignatures_op_curs implements Interficie_llistes {

    private ArrayList <Optatives> llista;
    
    public ll_assignatures_op_curs(){
        llista = new ArrayList <Optatives>();
    }
    
   
    
    public Optatives getAssig(int pos){
        return llista.get(pos);
    }
    

    @Override
    public String ll_toString() {
        String res = "";
        for (int i=0; i<llista.size();i++){
            res += "[" + llista.get(i).to_String() + "]\n";
        }
        return res;
    }

    @Override
    public int get_tamany() {
        return this.llista.size();
    }

    @Override
    public void insertar_element(int i, Element el) {
        llista.add(i,(Optatives) el);
    }

    public void insertar_est_assig(Estudiants est, Assignatures assig) throws ErrorElementExistent{
        if (llista.isEmpty()){
            llista.get(0).insertar_est(est);
        }else{
            for (int i=0; i<llista.size() ;i++){
                if(llista.get(i).to_String().compareTo(assig.to_String()) == 0){
                    llista.get(i).insertar_est(est);
                    //System.out.println(llista.get(i).ll_toString());
                }
            }
        }
    }

    @Override
    public void eliminar_element(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
