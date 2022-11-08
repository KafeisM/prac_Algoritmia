/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cursos;

/**
 *
 * @author Usuario
 */
public class FP extends Cursos {
    private Enum_Especialitats especialitat;
    
    public FP(String nom, int codi,Enum_Especialitats esp ) {
        super(nom, codi);
        this.especialitat = esp;
    }
    
}
