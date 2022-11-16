
package Estudiants;

import practica_1.algorismia.Element;

/**
 *
 * @author jordi
 */
public class Estudiants extends Element{
    
    int DNI;
    Estudiants seg;

    public Estudiants(String n, int num) {
        super(n);
        DNI = num;
        seg = null;
    }
    
    public int getDNI(){
        return DNI;
    }
    
    public String to_String(){
        return super.obtenir_nom();
    }
    
    public void setSeg(Estudiants est){
        seg = est;
    }
    
    public Estudiants getSeg(){
        return seg;
    }
    
}
