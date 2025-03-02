package Gestionvehiculos;

/**
 *
 * @author cyn
 */
public class Concesionario {

    String nombreConcesionario;
    String direccionConcesionario;
    Vehiculo arrayVehiculos[];
    int controladorArray;

    public Concesionario(String nombreConcesionario, String direccionConcesionario) {
        this.nombreConcesionario = nombreConcesionario;
        this.direccionConcesionario = direccionConcesionario;
        this.arrayVehiculos = new Vehiculo[10];
        controladorArray = 0;
    }

    //sera una metodo que agregue vehiculos al array
    public void agregarVehiculo(Vehiculo v) {
        //agregamos un vehiculo al array, pero comprobaremos que tenga espacio
        if (controladorArray < arrayVehiculos.length) {
            this.arrayVehiculos[controladorArray] = v;
            controladorArray++; //aumentacada que agregamos un vehiculo
        }
    }
    
    //muestra los vehiculos que tiene guardado el concesionario
    public String listarVehiculos(){
        String cadena="";
        //recorremos el array de concesionario
        for (int contador=0; contador < arrayVehiculos.length; contador++){
            if (arrayVehiculos[contador]!=null){
                cadena="Vehiculos en concesionario "+ arrayVehiculos[contador].toString();
            }
        }
        return cadena;
    }
    
    /* 
    public String listarVehiculos(){
        String cadena="";
        //recorremos el array de concesionario
        for (int contador=0; contador < controladorArray; contador++){ 
                cadena="Vehiculos en concesionario "+ arrayVehiculos[contador].toString();
        }
        return cadena;
    }
    
    */
}
