package Cursos;

/**
 *
 * @author Usuario
 */
public class FP extends Cursos{
    
    private Enum_Especialitats especialitat;
    private ll_assignatures_ob_curs assignaturesOB;
    private ll_assignatures_op_curs assignaturesOP;
    
    public FP(String nom, int codi,Enum_Especialitats esp ) {
        super(nom, codi);
        this.especialitat = esp;
        assignaturesOB = new ll_assignatures_ob_curs();
        assignaturesOP = new ll_assignatures_op_curs();
    }
    
    @Override
     public String to_String(){
        return this.obtenir_nom();
  
    }
    
}
