
package Gestionvehiculos;

import java.util.logging.Logger;

/**
 *
 * @author cyn
 */
abstract public class Vehiculo {
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
        return "{" + "MARCA=" + marca + ", MODELO=" + modelo + ", AÑO=" + anio + 
                " PROPIETARIO "+ propietarioVehiculo +'}';
    }
    
    //metodo que calcula impuestos
    public abstract double calcularImpuesto();
    
}
