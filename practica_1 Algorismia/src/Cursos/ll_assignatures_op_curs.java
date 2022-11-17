
package Cursos;

import Assignatures.Assignatures;
import Assignatures.Optatives;
import Assignatures.Perfil;
import Estudiants.Estudiants;
import Excepcions.ErrorAssigNoExistent;
import java.util.ArrayList;
import practica_1.algorismia.Element;
import Excepcions.ErrorElementExistent;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author jordi
 */
public class ll_assignatures_op_curs implements Interficie_llistes {

    private ArrayList <Optatives> llista;
    
    public ll_assignatures_op_curs(){
        llista = new ArrayList <Optatives>();
    }
    
    
    public Optatives getAssig(int pos){
        return llista.get(pos);
    }
    
    public Optatives getAssig(String nom_assig){
        boolean trobat = false;
        int i;
        for (i=0; (i<llista.size()) && (!trobat);i++){
            if (llista.get(i).to_String().compareTo(nom_assig) == 0){
                trobat = true;
            }
        }
        return llista.get(i-1);
    }
    
    public String getAssig_est(int dni){
        int i;
        String res = "";
        for (i = 0;(i < llista.size()); i++){
            if (llista.get(i).getll_Estudiants().cerca_est(dni)){
                res += llista.get(i).obtenir_nom() + " [ Codi: " +
                       llista.get(i).getCodi() + " [ Perfil: " +
                       llista.get(i).getPerfil() + " ]\n";
            }
        }
        if (res == ""){
            return null;
        }else{
            return res;
        }
    }
    
    @Override
    public String ll_toString() {
        String res = "";
        for (int i=0; i<llista.size();i++){
            res += "[" + llista.get(i).to_String() + "]\n";
        }
        return res;
    }

    @Override
    public int get_tamany() {
        return this.llista.size();
    }

    @Override
    public void insertar_element(int i, Element el) {
        llista.add(i,(Optatives) el);
    }

    public void insertar_est_assig(Estudiants est, Assignatures assig) throws ErrorElementExistent{
        if (!(llista.isEmpty())){
            for (int i=0; i<llista.size() ;i++){
                if(llista.get(i).to_String().compareTo(assig.to_String()) == 0){
                    llista.get(i).insertar_est(est);
                    //System.out.println(llista.get(i).ll_toString());
                }
            }
        }
    }
    
    public boolean cercaAssig(String nom_assig){
        boolean trobat = false;
        int i;
        for (i = 0;(i < llista.size()) && (!trobat); i++){
            if(llista.get(i).to_String().compareTo(nom_assig) == 0){
                trobat = true;
            }
        }
        return trobat;
    }

    @Override
    public void eliminar_element(String nom) {
        llista.remove(this.getAssig(nom));
    }

    
}
