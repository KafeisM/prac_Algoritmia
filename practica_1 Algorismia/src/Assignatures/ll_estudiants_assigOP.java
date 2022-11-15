
package Assignatures;

import Cursos.Cursos;
import Estudiants.Estudiants;
import practica_1.algorismia.Element;
import practica_1.algorismia.ErrorElementExistent;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author jordi
 */
public class ll_estudiants_assigOP implements Interficie_llistes {

    private Estudiants capçalera_est;
    
    public ll_estudiants_assigOP(){
        capçalera_est = null;
    }

    @Override
    public String ll_toString() {
        String res = "";
        Estudiants aux = new Estudiants("zzz",0);
        aux.setSeg(capçalera_est);
        while (aux.getSeg()!=null){
            res += "| [" + aux.getSeg().to_String() + "] ";
            aux.setSeg(aux.getSeg().getSeg());
        }
        return res;
    }

    @Override
    public int get_tamany() {
        int res = 0;
        Estudiants aux = new Estudiants("zzz",0);
        aux.setSeg(capçalera_est);
        while(aux.getSeg()!=null){
            aux.setSeg(aux.getSeg().getSeg());
            res++;
        }
        return res;
    }

    @Override
    public void insertar_element(int i, Element el) throws ErrorElementExistent{
        Estudiants input = (Estudiants) el;
        Estudiants aux = capçalera_est;
        input.setSeg(capçalera_est);
        capçalera_est = input;

        while((input.getSeg() != null) && (input.to_String().compareTo(input.getSeg().to_String()) < 0)){
            if(input.to_String().compareTo(input.getSeg().to_String()) != 0){
                input.setSeg(input.getSeg().getSeg());
                capçalera_est = aux;
            }else{
                throw new ErrorElementExistent("L'estudiant ja existeix");
            }
        } 
    }

    @Override
    public void eliminar_element(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
