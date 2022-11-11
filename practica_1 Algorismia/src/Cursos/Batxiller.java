package Cursos;

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
    
    @Override
     public String to_String(){
        return this.obtenir_nom();
  
    }
    
    
}
