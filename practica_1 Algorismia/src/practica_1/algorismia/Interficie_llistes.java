package practica_1.algorismia;

import Excepcions.ErrorElementExistent;
import Cursos.Cursos;

/**
 *
 * @author jordi
 */
public interface Interficie_llistes {
    public abstract void eliminar_element(String nom);
    public abstract String ll_toString();
    public abstract int get_tamany();
    public abstract void insertar_element(int i, Element el) throws ErrorElementExistent;
}
