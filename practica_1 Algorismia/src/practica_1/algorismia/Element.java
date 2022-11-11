package practica_1.algorismia;

/**
 *
 * @author Jordi
 */
public class Element implements Interficie_elements {
    String nom;
    
    public Element(String n){
        nom = n;
    }

    @Override
    public String obtenir_nom() {
        return nom;
    }
   
}
