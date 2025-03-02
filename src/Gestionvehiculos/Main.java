//package Gestionvehiculos;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author cyn
 */
/*public class Main {

    /*public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        //crear un array para almacenar vehiculos
        Vehiculo almacen[] = new Vehiculo[5];
        int conteoEspacio = 0; //contara los elementos que hay en el almacen

        int opcion = 0;
        int selecciones;
        String marca, modelo;
        int aux, anio;
        while (opcion != 3) { //mientras la opcion sea distinta a 3, salir del menu
            //dejaremos seleccionar el agregar un vehiculo, mientras no este lleno
            System.out.println("MENU");
            System.out.println("Introduzca 1 para agregar un vehiculo nuevo");
            System.out.println("Introduzca 2 para ver informacion");
            System.out.println("Introduzca 3 para salir del menu");
            opcion = entradaDatos.nextInt();
            switch (opcion) {
                case 1 -> {
                    if (conteoEspacio >= almacen.length) {
                        //si el conteoEspacio esta en el 5, no dejaremos introducir mas
                        System.out.println("El almacen de vehiculos esta lleno");
                    } else {
                        System.out.println("Seleccione 1 para agregar un AUTO. 2 para agregar un CAMION");
                        selecciones = entradaDatos.nextInt();
                        if (selecciones == 1) {
                            //si selecciona 1 creamos auto
                            entradaDatos.nextLine();
                            System.out.println("Introduzca la marca del auto:");
                            marca = entradaDatos.nextLine().trim();
                            System.out.println("Introduzca el modelo de auto");
                            modelo = entradaDatos.nextLine().trim();
                            System.out.println("Introduzca el año del auto");
                            anio = entradaDatos.nextInt();
                            System.out.println("Introduzca las puertas del auto");
                            aux = entradaDatos.nextInt();
                            //una vez obtenido los datos de AUTO, CREAREMOS EL OBJETO
                            Auto autouno = new Auto(marca, modelo, anio, aux);
                            //agregamos el objeto al array
                            almacen[conteoEspacio] = autouno;

                        } else if (selecciones == 2) {
                            entradaDatos.nextLine();
                            System.out.println("Introduzca la marca del camion:");
                            marca = entradaDatos.nextLine().trim();
                            System.out.println("Introduzca el modelo de camion");
                            modelo = entradaDatos.nextLine().trim();
                            System.out.println("Introduzca el año del camion");
                            anio = entradaDatos.nextInt();
                            System.out.println("Introduzca las toneladas del camion");
                            aux = entradaDatos.nextInt();
                            //creamos el objeto camion
                            Camion camionuno = new Camion(marca, modelo, anio, aux);
                            almacen[conteoEspacio] = camionuno;
                        }
                        //si se agrego uno de los objetos, se aumenta el contador
                        conteoEspacio++;
                    }

                }

                case 2 -> {

                    System.out.println("VEHICULOS QUE TIENE REGISTRADOS: ");
                    //recorrer el array, cuidado con los valores null
                    for (int contador = 0; contador < almacen.length; contador++) {
                        if (almacen[contador] != null) {
                            System.out.println(almacen[contador].toString());
                            System.out.println("IMPUESTO: "+ almacen[contador].calcularImpuesto());
                        }
                    } //termina de recorrer el array
                } //termina case 2

            }

        } //termina menu
    }
}
