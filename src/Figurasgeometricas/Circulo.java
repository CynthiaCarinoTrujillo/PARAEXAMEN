
package Figurasgeometricas;

/**
 *
 * @author cyn
 */
public class Circulo extends Forma{
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }
    
    
}
