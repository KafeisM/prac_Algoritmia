
package Estudiants;

import practica_1.algorismia.Element;

/**
 *
 * @author jordi
 */
public class Estudiants extends Element implements Comparable<Estudiants>{
    
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

    @Override
    public int compareTo(Estudiants o) {
        return this.to_String().compareTo(o.to_String());
    }
    
}
