
package Cursos;

import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author Jordi
 */
public class ll_cursos implements Interficie_llistes {
    private Cursos [] llista_cursos ;
    
    public ll_cursos(int num_cursos){
        llista_cursos = new Cursos[num_cursos];
    }
    
    public void inserirCurs(int ind, Cursos c){
        llista_cursos[ind] = c;
    }
    
    @Override
    public String ll_toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
