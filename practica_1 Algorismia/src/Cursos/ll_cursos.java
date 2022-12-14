
package Cursos;

import Assignatures.Assignatures;
import Estudiants.Estudiants;
import Excepcions.ErrorAssigNoExistent;
import java.util.ArrayList;
import practica_1.algorismia.Element;
import Excepcions.ErrorElementExistent;
import javax.swing.JOptionPane;
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
    
    public Cursos getCurs(String nom) throws ErrorElementExistent{
        int i;
        boolean trobat = false;
        System.out.println("entrada: " + nom);
        
        if(llista_cursos.isEmpty()){
            System.out.println("LLISTA BUIDA");
        }
        
        for (i = 0; i < llista_cursos.size() & !trobat; i++) {
            if(llista_cursos.get(i).to_String().equals(nom)){
                trobat = true;
            }
        }
        System.out.println(i);
        
        if(trobat == false){
            throw new ErrorElementExistent("ERROR: CURS NO EXISTENT");
            
        }
        return llista_cursos.get(i-1);
    }
    
    public Cursos getCurs(int i){
        return llista_cursos.get(i);
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
        try {
            Cursos aux = getCurs(nom);
            System.out.println("debug: " + aux.to_String());
            llista_cursos.remove(aux);
        } catch (ErrorElementExistent ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Cursos getCurs_assig(String nom_assig) throws ErrorAssigNoExistent{
        boolean trobat = false;
        int i;
        if (llista_cursos.isEmpty()){
            System.out.println("LLISTA BUIDA");
        }
        for (i=0; (i<llista_cursos.size()) && !trobat; i++){
            trobat = llista_cursos.get(i).cercaAssig(nom_assig);
        }
        if (trobat == false){
            throw new ErrorAssigNoExistent("Assignatura no existent");
        }
        return llista_cursos.get(i-1);
    }

   
    
    
}
