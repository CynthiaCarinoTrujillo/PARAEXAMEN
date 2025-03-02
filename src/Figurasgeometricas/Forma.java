
package Figurasgeometricas;

/**
 *
 * @author cyn
 */
abstract class Forma {
    
    //calcular area
    public abstract double calcularArea();
    
    //mostrar tipo, metodo comun
    public String mostrarTipo(){
        String nombre=this.getClass().getSimpleName();
        return nombre;
    }
}
