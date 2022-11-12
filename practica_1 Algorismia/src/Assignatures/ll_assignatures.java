/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    public void eliminar_Llista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ll_toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int get_tamany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertar_element(int i, Element el) {
        Assignatures input = (Assignatures) el;
        Assignatures aux = capçalera_assig;
        input.setSeg(capçalera_assig);
        capçalera_assig = input;

        while((aux.getSeg() != null) && (aux.to_String().compareTo(aux.getSeg().to_String()) < 0)){
            aux.setSeg(aux.getSeg().getSeg());
            capçalera_assig = aux;
            input.setSeg(input.getSeg().getSeg());
        }  
    }
    
}
