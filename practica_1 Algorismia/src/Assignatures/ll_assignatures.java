package Assignatures;

import Estudiants.Estudiants;
import Estudiants.ll_estudiants;
import Excepcions.ErrorAssigNoExistent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
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
    
    public Assignatures getAssig(String nom) throws ErrorAssigNoExistent{
        boolean trobat = false;
        Assignatures aux = new Assignatures("s",0);
        aux.setSeg(capçalera_assig);
        
        if (capçalera_assig == null) {
                throw new ErrorAssigNoExistent("No existeixen assignatures");
            }
        
        //System.out.println("entrada: " + nom);
        while(aux.getSeg() != null & !trobat){
            if(aux.getSeg().to_String().equals(nom)){
                trobat = true;
                break;
            }else{
                aux.setSeg(aux.getSeg().getSeg());
            }
        }

        if(trobat == false){
            return null;
        }else{
            return aux.getSeg();
        }
    }

    @Override
    public void insertar_element(int i, Element el) {
        Assignatures aux  = (Assignatures) el;
        aux.setSeg(capçalera_assig);
        capçalera_assig = aux;        
    }

    public ll_assignatures ordenar(){
 
        Assignatures aux = new Assignatures("s",0);
        aux.setSeg(capçalera_assig);
        
        ArrayList<Assignatures> ArrayAux = new ArrayList<Assignatures>();
        for(int i = 0; i<this.get_tamany();i++){
            ArrayAux.add(aux.getSeg());
            aux.setSeg(aux.getSeg().getSeg());
        }

        Collections.sort(ArrayAux);
        ll_assignatures llistaAux = new ll_assignatures();
        for(int i = 0; i<ArrayAux.size();i++){
            llistaAux.insertar_element(i, ArrayAux.get(i));
        }
        return llistaAux;
    }

    @Override
    public void eliminar_element(String nom){
        //eliminar primer node 
        try {
            if (capçalera_assig == null) {
                throw new ErrorAssigNoExistent("No existeixen assignatures");
            }

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
        } catch (ErrorAssigNoExistent exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

}
