
package Gestionvehiculos;
import java.util.Comparator;

/**
 *
 * @author cyn
 */
public class ordenXmarca implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        //recibe 2 objetos que deben convertirse a Vehiculos...
        Vehiculo uno=(Vehiculo)t;
        Vehiculo dos=(Vehiculo)t1;
        //tenemos los objetos convertidos...ahora debemos acceder a las marcas
        int resultado=uno.marca.compareToIgnoreCase(dos.marca);
        return resultado;
    }

    /*@Override
    public Comparator reversed() {
        return Comparator.super.reversed(); 
    }*/
    
}
