
package ejercicio7_10.Personal.Maquinaria;

import ejercicio7_10.Personal.Mecanico;
import java.time.LocalDateTime;

/**
 *
 * @author cyn
 */
public class Locomotora {
    
    private Mecanico mecanicoasignado;
    private String matriculaLocomotora;
    private double potenciaLocomotora;
    private LocalDateTime anioFabricacion;   

    public Locomotora(Mecanico mecanicoasignado, String matriculaLocomotora, double potenciaLocomotora, LocalDateTime anioFabricacion) {
        this.mecanicoasignado = mecanicoasignado;
        this.matriculaLocomotora = matriculaLocomotora;
        this.potenciaLocomotora = potenciaLocomotora;
        this.anioFabricacion = anioFabricacion;
    }

    public Mecanico getMecanicoasignado() {
        return mecanicoasignado;
    }

    public void setMecanicoasignado(Mecanico mecanicoasignado) {
        this.mecanicoasignado = mecanicoasignado;
    }

    public String getMatriculaLocomotora() {
        return matriculaLocomotora;
    }

    public void setMatriculaLocomotora(String matriculaLocomotora) {
        this.matriculaLocomotora = matriculaLocomotora;
    }

    public double getPotenciaLocomotora() {
        return potenciaLocomotora;
    }

    public void setPotenciaLocomotora(double potenciaLocomotora) {
        this.potenciaLocomotora = potenciaLocomotora;
    }

    public LocalDateTime getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDateTime anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Locomotora {"+ matriculaLocomotora + "\n potencia" + potenciaLocomotora + " caballos\n"+
                "Mecanico asignado "+ mecanicoasignado + '}';
    }
    
    
}
