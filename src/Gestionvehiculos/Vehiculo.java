
package Gestionvehiculos;

/**
 *
 * @author cyn
 */
abstract class Vehiculo implements Impuestos{
    String marca;
    String modelo;
    int anio;
    Propietario propietarioVehiculo;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public Vehiculo(String marca, String modelo, int anio, Propietario propietarioVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.propietarioVehiculo = propietarioVehiculo;
    }
    
    //se usara en caso de añadir el propietario
    public Vehiculo(Propietario propietarioVehiculo) {
        this.propietarioVehiculo = propietarioVehiculo;
    }
    
    @Override
    public String toString() {
        return "{" + "\nMARCA=" + marca + ", MODELO=" + modelo + ", AÑO=" + anio + 
                '}';
    }
    
    //metodo que calcula impuestos
    public abstract double calcularImpuesto();

    @Override
    public abstract double calcularImpuestosconInterfaz();

    
}
