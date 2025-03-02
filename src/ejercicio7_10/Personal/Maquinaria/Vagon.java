
package ejercicio7_10.Personal.Maquinaria;

/**
 *
 * @author cyn
 */
public class Vagon {
    private String identificadorVagon;
    private double cargaMax;
    private double cargaActual;
    private String tipoMercancia;

    public Vagon(String identificadorVagor, double cargaMax, double cargaActual, String tipoMercancia) {
        this.identificadorVagon=identificadorVagon;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    public String getIdentificadorVagon() {
        return identificadorVagon;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    @Override
    public String toString() {
        return "Vagon{" + "identificadorVagon=" + identificadorVagon + ", cargaMax=" + cargaMax + ", cargaActual=" + cargaActual + ", tipoMercancia=" + tipoMercancia + '}';
    }
    
    
    
}
