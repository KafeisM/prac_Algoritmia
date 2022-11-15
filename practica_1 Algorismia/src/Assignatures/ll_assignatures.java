package Assignatures;

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
        Assignatures aux = capçalera_assig;
        while((aux.getSeg() != null) && (aux.to_String()!= nom)){
            //System.out.println(aux.to_String());
            //System.out.println(aux.getSeg().to_String());
            aux = aux.getSeg();
        }
        if((aux.getSeg() == null) && (aux.to_String().compareTo(nom) != 0)){
            throw new ErrorAssigNoExistent("No existeix l'assignatura");
        }else{
            return aux;
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
