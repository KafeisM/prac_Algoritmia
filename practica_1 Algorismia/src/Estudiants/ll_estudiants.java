package Estudiants;

import Assignatures.Assignatures;
import java.util.ArrayList;
import java.util.Collections;
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
        int tam = 0;
        Estudiants aux = new Estudiants("s",0);
        aux.setSeg(capçalera_estudiant);
        
        while(aux.getSeg() != null){
            tam++;
            aux.setSeg(aux.getSeg().getSeg());
        }
        
        return tam;
    }

    @Override
    public void insertar_element(int i, Element el) {
        Estudiants aux  = (Estudiants) el;
        aux.setSeg(capçalera_estudiant);
        capçalera_estudiant = aux;
        
    }
    
    public ll_estudiants ordenar(){
        
        Estudiants aux = new Estudiants("s",0);
        aux.setSeg(capçalera_estudiant);
        ArrayList<Estudiants> ArrayAux = new ArrayList<Estudiants>();
        for(int i = 0; i<this.get_tamany();i++){
            ArrayAux.add(aux.getSeg());
            aux.setSeg(aux.getSeg().getSeg());
        }

        Collections.sort(ArrayAux, Collections.reverseOrder());
        ll_estudiants llistaAux = new ll_estudiants();
        for(int i = 0; i<ArrayAux.size();i++){
            llistaAux.insertar_element(i, ArrayAux.get(i));
        }
        return llistaAux;
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
