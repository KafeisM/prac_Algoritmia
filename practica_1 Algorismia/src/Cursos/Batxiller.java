/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    
}
