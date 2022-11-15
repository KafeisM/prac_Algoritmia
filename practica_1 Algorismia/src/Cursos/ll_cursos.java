
package Cursos;

import Assignatures.Assignatures;
import Estudiants.Estudiants;
import java.util.ArrayList;
import practica_1.algorismia.Element;
import practica_1.algorismia.ErrorElementExistent;
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
    public int get_tamany() {
        return llista_cursos.size();
    }
    
    public Cursos getCurs(String nom){
        int i;
        boolean trobat = false;
        for (i = 0; i < llista_cursos.size() & !trobat; i++) {
            if(llista_cursos.get(i).equals(nom)){
                trobat = true;
            }
        }
        System.out.println(i);
        return llista_cursos.get(i-1);
    }
    

    @Override
    public void insertar_element(int i, Element el) {
        llista_cursos.add(i, (Cursos) el);
    }
    
    public void insertar_est(Estudiants est, Assignatures assig) throws ErrorElementExistent{
        for (int i=0; i<llista_cursos.size(); i++){
            llista_cursos.get(i).insertar_estudiant(est,assig);
        }
    }

    @Override
    public String ll_toString() {
        String res = "";
        for (int i=0; i<llista_cursos.size();i++){
            res += "[" + llista_cursos.get(i).to_String() + "]\n";
        }
        return res;
    }

    @Override
    public void eliminar_element(String nom) {
        Cursos aux = getCurs(nom);
        System.out.println("debug: " + aux.to_String());
        llista_cursos.remove(aux);
    }

   
    
    
}
