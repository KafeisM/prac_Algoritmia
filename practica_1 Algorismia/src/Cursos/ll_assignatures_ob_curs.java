
package Cursos;

import Assignatures.Assignatures;
import Assignatures.Obligatories;
import Estudiants.Estudiants;
import java.util.ArrayList;
import practica_1.algorismia.Element;
import Excepcions.ErrorElementExistent;
import practica_1.algorismia.Interficie_llistes;

/**
 *
 * @author jordi
 */
public class ll_assignatures_ob_curs implements Interficie_llistes {
    
    private final ArrayList <Obligatories> llista;

    public ll_assignatures_ob_curs(){
        llista = new ArrayList <Obligatories>();
    }
    
    
    public Obligatories getAssig(int pos){
        return llista.get(pos);
    }
    
    public Obligatories getAssig(String nom_assig){
        boolean trobat = false;
        int i;
        for (i=0; (i<llista.size()) && (!trobat);i++){
            if (llista.get(i).to_String().compareTo(nom_assig) == 0){
                trobat = true;
            }
        }
        return llista.get(i-1);
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
    
    public Obligatories getAssig_est(int dni){
        int i;
        boolean trobat = false;
        for (i = 0;(i < llista.size()) && (!trobat); i++){
            //System.out.println("entro");
            if (llista.get(i).getll_Estudiants().cerca_est(dni)){
                trobat = true;
            }
        }
        if (trobat){
            //System.out.println("ll_ass_ob: " + llista.get(i-1));
            return llista.get(i-1);
        }else{
            return new Obligatories("",0,0);
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
        return llista.size();
    }


    @Override
    public void insertar_element(int i, Element el) {
        llista.add(i, (Obligatories) el);
    }
    
    public void insertar_est_assig(Estudiants est, Assignatures assig) throws ErrorElementExistent{
        
        if (!(llista.isEmpty())){
            for (int i=0; i<llista.size() ;i++){
                //System.out.println(llista.get(i).obtenir_nom());
                //System.out.println("ass.ob.curs: " + assig.obtenir_nom() + " " +llista.get(i).obtenir_nom());
                if(llista.get(i).obtenir_nom().compareTo(assig.obtenir_nom()) == 0){
                    llista.get(i).insertar_est(est);
                    System.out.println("ass.ob.curs dedins: " + llista.get(i).obtenir_nom());
                }
            }
        }
        
    }

    @Override
    public void eliminar_element(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
