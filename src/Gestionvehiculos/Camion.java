
package Gestionvehiculos;

/**
 *
 * @author cyn
 */
public class Camion extends Vehiculo{
    
    int toneladas;

    public Camion(String marca, String modelo, int anio, int toneladas) {
        super(marca, modelo, anio);
        this.toneladas = toneladas;
    }

    public Camion(String marca, String modelo, int anio, int toneladas, Propietario propietarioVehiculo) {
        super(marca, modelo, anio, propietarioVehiculo);
        this.toneladas = toneladas;
    }

    public Camion(Propietario propietarioVehiculo) {
        super(propietarioVehiculo);
    }
    
    
    @Override
    public double calcularImpuesto() {
        return (0.10*anio)*200;
    }

    @Override
    public double calcularImpuestosconInterfaz() {
        return (0.10*anio)*200;
    }
    
}
