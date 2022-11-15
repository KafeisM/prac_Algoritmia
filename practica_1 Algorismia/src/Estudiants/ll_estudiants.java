package Estudiants;

import practica_1.algorismia.Element;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author Jordi
 */
public class ll_estudiants implements Interficie_llistes {
    private Estudiants capçalera_estudiant;
    
    public ll_estudiants(){
        capçalera_estudiant = null;
    }

    @Override
    public String ll_toString() {
        String res = "";
        Estudiants aux = new Estudiants("zzz",0);
        aux.setSeg(capçalera_estudiant);
        while (aux.getSeg()!=null){
            res += "| [" + aux.getSeg().toString() + "] ";
            aux.setSeg(aux.getSeg().getSeg());
        }
        return res;
    }

    @Override
    public int get_tamany() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar_element(int i, Element el) {
        Estudiants input = (Estudiants) el;
        Estudiants aux = capçalera_estudiant;
        input.setSeg(capçalera_estudiant);
        capçalera_estudiant = input;

        while((input.getSeg() != null) && (input.to_String().compareTo(input.getSeg().to_String()) < 0)){
            capçalera_estudiant = aux;
            input.setSeg(input.getSeg().getSeg());
        }  
    }

    @Override
    public void eliminar_element(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
