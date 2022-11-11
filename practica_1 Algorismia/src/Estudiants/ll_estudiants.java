package Estudiants;

import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author Jordi
 */
public class ll_estudiants implements Interficie_llistes {
    private Estudiants capçalera_estudiant;

    @Override
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
}
