package Assignatures;

import java.util.logging.Level;
import java.util.logging.Logger;
import practica_1.algorismia.Element;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author pgrod
 */
public class ll_assignatures implements Interficie_llistes{
    
    protected Assignatures capçalera_assig;
    
    public ll_assignatures(){
        capçalera_assig = null;
    }

    @Override
    public String ll_toString() {
        String llista = "";
        Assignatures aux = new Assignatures("s",0);
        aux.setSeg(capçalera_assig);
        
        while(aux.getSeg() != null){
            llista += (aux.getSeg()).to_String() + " codi: " + (aux.getSeg()).getCodi() + "\t" ;
            aux.setSeg(aux.getSeg().getSeg());
        }
        
        return llista;
    }

    @Override
    public int get_tamany() {
        int tam = 0;
        Assignatures aux = new Assignatures("s",0);
        aux.setSeg(capçalera_assig);
        
        while(aux.getSeg() != null){
            tam++;
            aux.setSeg(aux.getSeg().getSeg());
        }
        
        return tam;
    }
    
    public Assignatures getAssig(String nom){
        boolean trobat = false;
        
        Assignatures aux = new Assignatures("s",0);
        aux.setSeg(capçalera_assig);
        
        System.out.println("entrada: " + nom);
        while(aux.getSeg() != null & !trobat){
            if(aux.getSeg().to_String().equals(nom)){
                trobat = true;
                break;
            }else{
                aux.setSeg(aux.getSeg().getSeg());
            }
        }
        
        return aux.getSeg();
    }

    @Override
    public void insertar_element(int i, Element el) {
        Assignatures aux  = (Assignatures) el;
        aux.setSeg(capçalera_assig);
        capçalera_assig = aux;
        
    }

    private void ordenar(){
 
        Assignatures aux = new Assignatures("s",0);
        aux.setSeg(capçalera_assig);
        
        while(aux.getSeg() != null){
            if(aux.getCodi() > aux.getSeg().getCodi()){
                aux.getSeg().setSeg(aux.getSeg().getSeg());
                aux.getSeg().getSeg().setSeg(aux);
                capçalera_assig = aux.getSeg().getSeg();
            }
            aux.setSeg(aux.getSeg().getSeg());
        }
    }

    @Override
    public void eliminar_element(String nom) {
        //eliminar primer node 
        if (capçalera_assig.to_String().equals(nom)) {
            capçalera_assig = capçalera_assig.getSeg();
        } else {
            Assignatures node_actual = new Assignatures("aux", 0);
            Assignatures node_anterior = new Assignatures("aux", 1);

            node_actual.setSeg(capçalera_assig);
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
