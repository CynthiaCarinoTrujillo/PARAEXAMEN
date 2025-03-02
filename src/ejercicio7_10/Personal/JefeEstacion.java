
package ejercicio7_10.Personal;

import java.time.LocalDateTime;

/**
 *
 * @author cyn
 */
public class JefeEstacion {
    private String nombreJefe;
    private String DNIjefe;
    private LocalDateTime fechaNombramiento;

    public JefeEstacion(String nombreJefe, String DNIjefe, LocalDateTime fechaNombramiento) {
        this.nombreJefe = nombreJefe;
        this.DNIjefe = DNIjefe;
        this.fechaNombramiento = fechaNombramiento;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public String getDNIjefe() {
        return DNIjefe;
    }

    public void setDNIjefe(String DNIjefe) {
        this.DNIjefe = DNIjefe;
    }

    public LocalDateTime getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(LocalDateTime fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    @Override
    public String toString() {
        return "{" + "Jefe de estacion=" + nombreJefe + ", DNIjefe=" + DNIjefe + ", Nombramiento=" + fechaNombramiento + '}';
    }
    
    
    
}
