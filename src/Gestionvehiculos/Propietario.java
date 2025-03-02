
package Gestionvehiculos;

/**
 *
 * @author cyn
 */
public class Propietario {
    String nombrePropietario;
    String apellido;
    String dniPropietario;
    String direccionPropietario;

    public Propietario(String nombrePropietario, String apellido, String dniPropietario, String direccionPropietario) {
        this.nombrePropietario = nombrePropietario;
        this.apellido = apellido;
        this.dniPropietario = dniPropietario;
        this.direccionPropietario = direccionPropietario;
    }

    @Override
    public String toString() {
        return "Propietario: " + nombrePropietario + ", Apellidos: " + apellido + ", DNI: " + dniPropietario + ", Direccion: " + direccionPropietario ;
    }
        
}
