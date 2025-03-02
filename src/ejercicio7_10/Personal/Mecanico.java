
package ejercicio7_10.Personal;

/**
 *
 * @author cyn
 */
public class Mecanico {
    
    enum Especialidad{
        MOTOR, RUEDAS, VIAS, ELECTRICIDAD
    }
    
    private String nomMecanico;
    private String telMecanico;
    private Especialidad especialidad;

    public Mecanico(String nomMecanico, String telMecanico, String especialidad) {
        this.nomMecanico = nomMecanico;
        this.telMecanico = telMecanico;
        this.especialidad = Especialidad.valueOf(especialidad);
    }

    public String getNomMecanico() {
        return nomMecanico;
    }

    public void setNomMecanico(String nomMecanico) {
        this.nomMecanico = nomMecanico;
    }

    public String getTelMecanico() {
        return telMecanico;
    }

    public void setTelMecanico(String telMecanico) {
        this.telMecanico = telMecanico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" + "nomMecanico=" + nomMecanico + ", especialidad=" + especialidad + '}';
    }
    
    
    
    
}
