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
        String llista = "";
        Estudiants aux = new Estudiants("s",0);
        aux.setSeg(capçalera_estudiant);
        
        while(aux.getSeg() != null){
            System.out.println(aux.getSeg().to_String());
            llista += (aux.getSeg()).to_String() + " DNI: " + (aux.getSeg()).getDNI() + "\t" ;
            aux.setSeg(aux.getSeg().getSeg());
        }
        
        return llista;
    }

    @Override
    public int get_tamany() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar_element(int i, Element el) {
        Estudiants aux  = (Estudiants) el;
        aux.setSeg(capçalera_estudiant);
        capçalera_estudiant = aux;
    }
    
    private void ordenar(){
        Estudiants aux = new Estudiants("s",0);
        aux.setSeg(capçalera_estudiant);
        
        while(aux.getSeg() != null){
            if(aux.to_String().compareTo(aux.getSeg().to_String()) > 0){
                aux.getSeg().setSeg(aux.getSeg().getSeg());
                aux.getSeg().getSeg().setSeg(aux);
                capçalera_estudiant = aux.getSeg().getSeg();
            }
            aux.setSeg(aux.getSeg().getSeg());
        }
    }

    @Override
    public void eliminar_element(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
