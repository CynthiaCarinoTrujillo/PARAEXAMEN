
package ejercicio7_10.Personal.Maquinaria;

import ejercicio7_10.Personal.Maquinista;

/**
 *
 * @author cyn
 */
public class Tren {
    private Locomotora locomotoraDeTren;
    private Maquinista maquinistaResponsable;
    private Vagon vagonesEnganchados[]; //es el "almacen" del tren 5 vagones maximo
    int contadorVagones=0;

    public Tren(Locomotora locomotoraDeTren, Maquinista maquinistaResponsable) {
        this.locomotoraDeTren = locomotoraDeTren;
        this.maquinistaResponsable = maquinistaResponsable;
        this.vagonesEnganchados = new Vagon[5]; //cuando creemos un tren, inicializamos el array a 5
        contadorVagones=0;
    }

    public Locomotora getLocomotoraDeTren() {
        return locomotoraDeTren;
    }

    public void setLocomotoraDeTren(Locomotora locomotoraDeTren) {
        this.locomotoraDeTren = locomotoraDeTren;
    }

    public Maquinista getMaquinistaResponsable() {
        return maquinistaResponsable;
    }

    public void setMaquinistaResponsable(Maquinista maquinistaResponsable) {
        this.maquinistaResponsable = maquinistaResponsable;
    }

    public String getVagonesEnganchados() {
        String cadena="";
        
        for (int contador=0; contador < vagonesEnganchados.length; contador++){
            if (vagonesEnganchados[contador]!= null){ //ESTA LLENO
                cadena=("- Vagon "+ contador+ ": Carga maxima = "+ vagonesEnganchados[contador].getCargaMax() +
                        "Carga actual = "+ vagonesEnganchados[contador].getCargaActual() + ", Mercancia "+ vagonesEnganchados[contador].getTipoMercancia());    
            } 
            
        }
        return cadena;
        
    }
   
    public void enganchaVagon(String identificadorVagor, double cargaMax, double cargaActual, String tipoMercancia){
        //si queremos agregar un vagon con productos, debemos verificar si hay espacio
        if (contadorVagones<=5){
            //crearemos un vagon y lo guardaremos en el array
            //crear el vagon con los atributos
            Vagon v=new Vagon(identificadorVagor,cargaMax, cargaActual, tipoMercancia);
            //ahora debemos guardar el vagon en el array de tren
            vagonesEnganchados[contadorVagones]=v;
            //aumentamos el contador de vagones cada que agreguemos un vagon al tren
            contadorVagones++;
        } else {
            System.out.println("No se pueden añadir mas vagones");
        }
    }
}
