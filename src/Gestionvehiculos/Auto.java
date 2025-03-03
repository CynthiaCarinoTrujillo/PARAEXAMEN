
package Gestionvehiculos;

/**
 *
 * @author cyn
 */
public class Auto extends Vehiculo {
    int numPuertas;

    public Auto(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas=numPuertas;
    }


    public Auto(String marca, String modelo, int anio,int numPuertas, Propietario propietarioVehiculo) {
        super(marca, modelo, anio, propietarioVehiculo);
        this.numPuertas=numPuertas;
    }

    public Auto(Propietario propietarioVehiculo) {
        super(propietarioVehiculo);
    }
    
    @Override
    public double calcularImpuesto() {
        return (0.05*anio)*100;
    }

    @Override
    public double calcularImpuestosconInterfaz() {
        return (0.05*anio)*100;
    }
    
}
