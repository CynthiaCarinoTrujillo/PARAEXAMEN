
package ejercicio7_10.Personal;

/**
 *
 * @author cyn
 */
public class Maquinista {
    
    enum Rango{ PRIMER, SEGUNDO, TERCERO }
    private String nombreMaquinista;
    private String DNImaquinista;
    private double sueldoMaquinista;
    private Rango rangoMaquinista;

    public Maquinista(String nombreMaquinista, String DNImaquinista, double sueldoMaquinista, String rangoMaquinista) {
        this.nombreMaquinista = nombreMaquinista;
        this.DNImaquinista = DNImaquinista;
        this.sueldoMaquinista = sueldoMaquinista;
        this.rangoMaquinista = Rango.valueOf(rangoMaquinista);
    }

    public String getNombreMaquinista() {
        return nombreMaquinista;
    }

    public void setNombreMaquinista(String nombreMaquinista) {
        this.nombreMaquinista = nombreMaquinista;
    }

    public String getDNImaquinista() {
        return DNImaquinista;
    }

    public void setDNImaquinista(String DNImaquinista) {
        this.DNImaquinista = DNImaquinista;
    }

    public double getSueldoMaquinista() {
        return sueldoMaquinista;
    }

    public void setSueldoMaquinista(double sueldoMaquinista) {
        this.sueldoMaquinista = sueldoMaquinista;
    }

    public Rango getRangoMaquinista() {
        return rangoMaquinista;
    }

    public void setRangoMaquinista(Rango rangoMaquinista) {
        this.rangoMaquinista = rangoMaquinista;
    }
    
    
}
