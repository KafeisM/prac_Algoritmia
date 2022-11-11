
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
      
    public ll_cursos(){
        llista_cursos = new ArrayList <Cursos>();
    }

    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int get_tamany() {
        return llista_cursos.size();
    }
    
    public Cursos getCurs(String nom){
        int cont = 0;
        while ((cont < llista_cursos.size())&&(llista_cursos.get(cont).to_String() != nom)){
            cont++;
        }
        return llista_cursos.get(cont);
    }

    @Override
    public void insertar_element(int i, Element el) {
        llista_cursos.add(i, (Cursos) el);
    }

    @Override
    public String ll_toString() {
        String res = "";
        for (int i=0; i<llista_cursos.size();i++){
            res += " [" + llista_cursos.get(i).toString() + "] ";
        }
        return res;
    }

   
    
    
}
