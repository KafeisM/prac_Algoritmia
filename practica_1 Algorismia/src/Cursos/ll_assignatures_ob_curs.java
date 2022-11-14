
package Cursos;

import Assignatures.Assignatures;
import Assignatures.Obligatories;
import Estudiants.Estudiants;
import java.util.ArrayList;
import practica_1.algorismia.Element;
import practica_1.algorismia.ErrorElementExistent;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author jordi
 */
public class ll_assignatures_ob_curs implements Interficie_llistes {
    
    private final ArrayList <Obligatories> llista;

    public ll_assignatures_ob_curs(){
        llista = new ArrayList <Obligatories>();
    }
    
    
    public Obligatories getAssig(int pos){
        return llista.get(pos);
    }
    
    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return llista.size();
    }


    @Override
    public void insertar_element(int i, Element el) {
        llista.add(i, (Obligatories) el);
    }
    
    public void insertar_est_assig(Estudiants est, Assignatures assig) throws ErrorElementExistent{
        for (int i=0; i<llista.size() ;i++){
            if(llista.get(i).to_String() == assig.to_String()){
                llista.get(i).insertar_est(est);
            }
        }
    }

  
    
}
