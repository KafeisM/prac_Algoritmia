
package Cursos;

import Assignatures.Optatives;
import java.util.ArrayList;
import practica_1.algorismia.Element;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar_element(int i, Element el) {
        llista.add(i,(Optatives) el);
    }

 

    
}
