package Cursos;

import Assignatures.Assignatures;
import Assignatures.Obligatories;

/**
 *
 * @author Jordi
 */

public class Batxiller extends Cursos{
    private Enum_Cursos curs;


    public Batxiller(String nom, int codi, Enum_Cursos curs) {
        super(nom, codi);
        this.curs = curs;
    }
    
    public String getEspecialitat(){
        return curs.toString();
    }
    
    @Override
     public String to_String(){
        return this.obtenir_nom();
  
    }
    
    
}
