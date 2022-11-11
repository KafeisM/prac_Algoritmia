
package Cursos;

import java.util.ArrayList;
import practica_1.algorismia.Element;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author Jordi
 */
public class ll_cursos implements Interficie_llistes {
    
    private final ArrayList <Cursos> llista_cursos ;
    private int longitud;
      
    public ll_cursos(int num_cursos){
        llista_cursos = new ArrayList <Cursos>();
        longitud = num_cursos;
    }

    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int get_tamany() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar_element(int i, Element el) {
        llista_cursos.add(i, (Cursos) el);
    }

    @Override
    public String ll_toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
