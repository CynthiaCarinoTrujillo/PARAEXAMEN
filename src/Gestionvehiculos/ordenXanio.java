
package Gestionvehiculos;

import java.util.Comparator;

/**
 *
 * @author cyn
 */
public class ordenXanio implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        //en orden decreciente..
        Vehiculo uno=(Vehiculo)t;
        Vehiculo dos=(Vehiculo)t1;
        int resultado=-(uno.anio-dos.anio);
        if (resultado==0){
            resultado=uno.marca.compareToIgnoreCase(dos.marca); 
        }
        return resultado;
    }

   /* @Override
    public Comparator reversed() {
        return Comparator.super.reversed(); 
    }*/
    
}
