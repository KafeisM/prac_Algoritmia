
package Cursos;

import practica_1.algorismia.Interficie_elements;

/**
 *
 * @author Jordi
 */
public class Cursos implements Interficie_elements {
    protected String nom_curs;
    protected int codi_curs;
    
    public Cursos(String nom, int codi){
        this.codi_curs = codi;
        this.nom_curs = nom;
    }

    @Override
    public void eliminar_Element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void donar_Alta() {
 
    }

    @Override
    public void donar_Baixa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
