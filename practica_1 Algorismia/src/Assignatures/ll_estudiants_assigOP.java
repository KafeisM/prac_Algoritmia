
package Assignatures;

import Estudiants.Estudiants;
import practica_1.algorismia.Element;
import Excepcions.ErrorElementExistent;
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
    
    public boolean cerca_est(int dni){
        boolean trobat = false;
        Estudiants aux = new Estudiants("zzz",0);
        aux.setSeg(capçalera_est);
        while ((aux.getSeg() != null) && (!trobat)){
            //System.out.println("ll_est_assigOb: "+dni);
            if (aux.getSeg().getDNI() == dni){
                trobat = true;
            }
            aux.setSeg(aux.getSeg().getSeg());
        }
        return trobat;
    }

    @Override
    public void insertar_element(int i, Element el) throws ErrorElementExistent{
        if(est_existent((Estudiants)el)){
            throw new ErrorElementExistent("L'estudiant ja existeix");
        }else{
            Estudiants aux  = (Estudiants) el;
            aux.setSeg(capçalera_est);
            capçalera_est = aux;
            //ordenar();
        }
        
    }
    
    private boolean est_existent(Estudiants est){
        boolean existeix = false;
        Estudiants aux = new Estudiants("s",0);
        aux.setSeg(capçalera_est);
        while((aux.getSeg() != null)&& (!existeix)){
            if(aux.getSeg().to_String().compareTo(est.obtenir_nom()) == 0){
                existeix = true;
            }
            aux.setSeg(aux.getSeg().getSeg());
        }
        return existeix;
    }
    
    private void ordenar(){
        Estudiants aux = new Estudiants("s",0);
        aux.setSeg(capçalera_est);
        
        while((aux.getSeg() != null) && (aux.getSeg().getSeg()!=null)){
            if(aux.getSeg().to_String().compareTo(aux.getSeg().getSeg().to_String()) > 0){
                capçalera_est = aux.getSeg().getSeg();
                aux.getSeg().setSeg(capçalera_est.getSeg());
                capçalera_est.setSeg(aux.getSeg());
            }
            aux.setSeg(aux.getSeg().getSeg());
        }
    }

    @Override
    public void eliminar_element(String nom) {
        if (capçalera_est.to_String().equals(nom)) {
            capçalera_est = capçalera_est.getSeg();
        } else {
            Estudiants node_actual = new Estudiants("aux", 0);
            Estudiants node_anterior = new Estudiants("aux", 1);

            node_actual.setSeg(capçalera_est);
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
