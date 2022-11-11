
package Cursos;

import Assignatures.Optatives;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author jordi
 */
public class ll_assignatures_op_curs implements Interficie_llistes {

    private Optatives[] llista;
    private int longitud;
    
    public ll_assignatures_op_curs(){
        llista = new Optatives[0];
        this.longitud = 0;
    }
    
    public ll_assignatures_op_curs(int longitud){
        llista = new Optatives[longitud];
        this.longitud = longitud;
    }
    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ll_toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int get_tamany() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar_elementCurs(int i, Cursos c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
