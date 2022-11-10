
package Cursos;

import Assignatures.Assignatures;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author jordi
 */
public class ll_assignatures_ob_curs implements Interficie_llistes {

    protected Assignatures [] llista;

    public ll_assignatures_ob_curs(int longitud){
        llista = new Assignatures[longitud];
    }

    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ll_toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
