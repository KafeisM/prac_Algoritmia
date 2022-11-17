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
            llista += (aux.getSeg()).to_String() + " | DNI: " + (aux.getSeg()).getDNI() + "\t" ;
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
        ordenar();
    }
    
    private void ordenar(){
        Estudiants aux = new Estudiants("s",0);
        aux.setSeg(capçalera_estudiant);
        
        while((aux.getSeg() != null) && (aux.getSeg().getSeg()!=null)){
            if(aux.getSeg().to_String().compareTo(aux.getSeg().getSeg().to_String()) > 0){
                capçalera_estudiant = aux.getSeg().getSeg();
                aux.getSeg().setSeg(capçalera_estudiant.getSeg());
                capçalera_estudiant.setSeg(aux.getSeg());
            }else if(aux.getSeg().to_String().compareTo(aux.getSeg().getSeg().to_String()) == 0){
                eliminar_element(aux.getSeg().obtenir_nom());
            }
            aux.setSeg(aux.getSeg().getSeg());
        }
    }

    @Override
    public void eliminar_element(String nom) {
        if (capçalera_estudiant.to_String().equals(nom)) {
            capçalera_estudiant = capçalera_estudiant.getSeg();
        } else {
            Estudiants node_actual = new Estudiants("aux", 0);
            Estudiants node_anterior = new Estudiants("aux", 1);

            node_actual.setSeg(capçalera_estudiant);
            node_anterior.setSeg(null);

            while (node_actual.getSeg() != null) {
                if (node_actual.getSeg().to_String().equals(nom)) {
                    node_anterior.getSeg().setSeg(node_actual.getSeg().getSeg());
                }
                node_anterior.setSeg(node_actual.getSeg());
                node_actual.setSeg(node_actual.getSeg().getSeg());
            }
        }
    }

    
}
