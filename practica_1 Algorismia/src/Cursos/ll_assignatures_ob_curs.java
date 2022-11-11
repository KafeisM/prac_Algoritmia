
package Cursos;

import Assignatures.Obligatories;
import java.util.ArrayList;
import practica_1.algorismia.Element;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author jordi
 */
public class ll_assignatures_ob_curs implements Interficie_llistes {
    
    private final ArrayList <Obligatories> llista;
    private int longitud;

    public ll_assignatures_ob_curs(){
        llista = new ArrayList <Obligatories>();
        this.longitud = 0;
    }
    
    public ll_assignatures_ob_curs(int longitud){
        llista = new ArrayList <Obligatories>();
        this.longitud = longitud;
    }
    
    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ll_toString() {
        String res = "";
        for (int i=0; i<llista.size();i++){
            res += " [" + llista.get(i).toString() + "] ";
        }
        return res;
    }

    @Override
    public int get_tamany() {
        return longitud;
    }


    @Override
    public void insertar_element(int i, Element el) {
        llista.add(i, (Obligatories) el);
        longitud++;
    }

  
    
}
