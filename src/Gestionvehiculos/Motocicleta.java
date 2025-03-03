
package Gestionvehiculos;

/**
 *
 * @author cyn
 */
public class Motocicleta extends Vehiculo{
    int cilindrada;

    public Motocicleta(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada=cilindrada;
    }

    public Motocicleta(String marca, String modelo, int anio,int cilindrada, Propietario propietarioVehiculo) {
        super(marca, modelo, anio, propietarioVehiculo);
    }

    public Motocicleta(Propietario propietarioVehiculo) {
        super(propietarioVehiculo);
        this.cilindrada=cilindrada;
    }
     
    
    @Override
    public double calcularImpuesto() {
        return (0.03*anio)*50;
    }

    /*@Override
    public String toString() {
        return "Motocicleta{" + "cilindrada=" + cilindrada + '}';
    }*/

    @Override
    public double calcularImpuestosconInterfaz() {
        return (0.03*anio)*50;
    }
    
    
}
