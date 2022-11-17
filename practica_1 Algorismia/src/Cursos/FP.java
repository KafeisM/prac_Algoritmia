package Cursos;

/**
 *
 * @author Usuario
 */
public class FP extends Cursos{
    
    private Enum_Especialitats especialitat;

    
    public FP(String nom, int codi,Enum_Especialitats esp ) {
        super(nom, codi);
        this.especialitat = esp;
    }
    
    public String getEspecialitat(){
        return especialitat.toString();
    }
    
    @Override
     public String to_String(){
        return this.obtenir_nom();
  
    }
    
}
