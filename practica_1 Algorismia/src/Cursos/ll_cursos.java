
package Cursos;

import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author Jordi
 */
public class ll_cursos implements Interficie_llistes {
    
    private final Cursos [] llista_cursos ;
    private int longitud;
      
    public ll_cursos(int num_cursos){
        llista_cursos = new Cursos[num_cursos];
        longitud = num_cursos;
    }
    
    public Cursos getCurs(int pos){
        return llista_cursos[pos];
    }
    
    public void inserirCurs(int ind, Cursos c){
        llista_cursos[ind] = c;
    }
    
    @Override
    public String ll_toString() {
        String res = "";
        for (int i=0; i<longitud; i++){
            res += " [" + llista_cursos[i].toString() + "] |";
        }
        return res;
    }


    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
