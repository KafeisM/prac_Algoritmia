
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
            //System.out.println(llista_cursos.get(cont).to_String());
            cont++;
        }
        return llista_cursos.get(cont-1);
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

   
    
    
}
