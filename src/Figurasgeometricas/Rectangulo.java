
package Figurasgeometricas;

/**
 *
 * @author cyn
 */
public class Rectangulo extends Forma {
    double baser;
    double alturar;

    public Rectangulo(double baser, double alturar) {
        this.baser = baser;
        this.alturar = alturar;
    }
    
    @Override
    public double calcularArea() {
        return baser*alturar;
    }
    
    
}
