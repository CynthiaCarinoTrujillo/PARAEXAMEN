//package Gestionvehiculos;
//
//import java.util.Scanner;
//import java.util.Arrays;

/**
 *
 * @author cyn
 */
//public class Gestionvehiculos {

    /*public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        //crear un array para almacenar vehiculos
        Vehiculo almacen[] = new Vehiculo[5];
        int conteoEspacio = 0; //contara los elementos que hay en el almacen
        Auto autouno = null; Camion camionuno=null; Motocicleta motouno=null;
        int opcion = 0;
        int selecciones;
        String marca, modelo;
        int aux, anio;
        String nompro,apepro,dnipro,direcpro;
        Concesionario concesionario = null; //con null esta "esperando" que le des una informacion
        while (opcion != 7) { //mientras la opcion sea distinta a 3, salir del menu
            //dejaremos seleccionar el agregar un vehiculo, mientras no este lleno
            System.out.println("MENU");
            System.out.println("Introduzca 1 para agregar un vehiculo nuevo");
            System.out.println("Introduzca 2 para ver informacion de los vehiculos e impuestos");           
            System.out.println("Introduzca 3 para agregar un propietario");
            System.out.println("Introduzca 4 para crear un concesionario");
            System.out.println("Introduzca 5 para listar los vehiculos de un concesionario");
            System.out.println("Introduzca 6 para añadir un vehiculo al concesionario");
            System.out.println("Introduzca 7 para salir del menu");
            opcion = entradaDatos.nextInt();
            switch (opcion) {
                case 1 -> {
                    if (conteoEspacio >= almacen.length) {
                        //si el conteoEspacio esta en el 5, no dejaremos introducir mas
                        System.out.println("El almacen de vehiculos esta lleno");
                    } else {
                        System.out.println("Seleccione 1 para agregar un AUTO. 2 para agregar un CAMION. 3 para agregar una moto");
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
                            
                            //agregar un propietario al auto
                            System.out.println("Ingrese el nombre del propietario");
                            nompro=entradaDatos.nextLine().trim();
                            System.out.println("Ingrese los apellidos del propietario");
                            apepro=entradaDatos.nextLine().trim();
                            System.out.println("DNI del propietario");
                            dnipro=entradaDatos.nextLine().trim();
                            System.out.println("Direccion del propietario");
                            direcpro=entradaDatos.nextLine().trim();
                            
                            //una vez obtenido los datos de AUTO, CREAREMOS EL OBJETO
                            Propietario propietario=new Propietario(nompro,apepro,dnipro,direcpro);
                            autouno = new Auto(marca, modelo, anio, aux, propietario);
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
                            
                            //agregar un propietario al camion
                            System.out.println("Ingrese el nombre del propietario");
                            nompro=entradaDatos.nextLine().trim();
                            System.out.println("Ingrese los apellidos del propietario");
                            apepro=entradaDatos.nextLine().trim();
                            System.out.println("DNI del propietario");
                            dnipro=entradaDatos.nextLine().trim();
                            System.out.println("Direccion del propietario");
                            direcpro=entradaDatos.nextLine().trim();
                            //una vez obtenidos los datos...creamos el propietario de camion
                            Propietario propietariocam=new Propietario(nompro,apepro,dnipro,direcpro);
                            //creamos el objeto camion
                            camionuno = new Camion(marca, modelo, anio, aux, propietariocam);
                            almacen[conteoEspacio] = camionuno;
                        } else if (selecciones==3){
                            //pedimos los datos para CREAR UNA MOTO
                            entradaDatos.nextLine();
                            System.out.println("Introduzca la marca de la moto:");
                            marca = entradaDatos.nextLine().trim();
                            System.out.println("Introduzca el modelo de la moto");
                            modelo = entradaDatos.nextLine().trim();
                            System.out.println("Introduzca el año de la moto");
                            anio = entradaDatos.nextInt();
                            System.out.println("Introduzca las cilindradas de la moto");
                            aux = entradaDatos.nextInt();
                            //pedimos los datos del propietario de la moto
                            entradaDatos.nextLine();
                            System.out.println("Ingrese el nombre del propietario");
                            nompro=entradaDatos.nextLine().trim();
                            System.out.println("Ingrese los apellidos del propietario");
                            apepro=entradaDatos.nextLine().trim();
                            System.out.println("DNI del propietario");
                            dnipro=entradaDatos.nextLine().trim();
                            System.out.println("Direccion del propietario");
                            direcpro=entradaDatos.nextLine().trim();
                            
                            //creamos el propietario de la moto
                            Propietario propieMoto=new Propietario(nompro,apepro,dnipro,direcpro);
                            //creamos la moto
                            motouno=new Motocicleta(marca,modelo,anio,aux,propieMoto);
                            //agregamos la motocicleta al array
                            almacen[conteoEspacio] = motouno;
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
                            System.out.println("IMPUESTO: " + almacen[contador].calcularImpuesto());
                        }
                    } //termina de recorrer el array
                } //termina case 2
                
                case 3 -> {
                    //agregamos un propietario
                            System.out.println("Ingrese el nombre del propietario que quiere agregar");
                            nompro=entradaDatos.nextLine().trim();
                            System.out.println("Ingrese los apellidos del propietario");
                            apepro=entradaDatos.nextLine().trim();
                            System.out.println("DNI del propietario");
                            dnipro=entradaDatos.nextLine().trim();
                            System.out.println("Direccion del propietario");
                            direcpro=entradaDatos.nextLine().trim();
                            
                            //creamos el propietario de un vehiculo... (no especifica que vehiculo)
                            Propietario propieagregado=new Propietario(nompro,apepro,dnipro,direcpro);
                            System.out.println("Propietario agregado");
                }
                
                case 4 -> {
                    //crear el concerionario, este contiene un array de vehiculos
                    System.out.println("Ingrese el nombre del concesionario");
                    nompro=entradaDatos.nextLine().trim();
                    System.out.println("Ingrese la direccion del concesionario");
                    direcpro=entradaDatos.nextLine().trim();
                    concesionario=new Concesionario(nompro, direcpro);
                    System.out.println("Concesionario creado");
                    //una vez se ha creado el concesionario, se ha creado un array para guardar vehiculos...
                }
                
                case 5 -> {
                    //imprime la informacion del array del concesionario..
                    System.out.println("Lista de los vehiculos en el concesionario: ");                            
                    concesionario.listarVehiculos();
                }
                
                case 6 -> {
                    //añadir un vehiculo al concesionario
                    System.out.println("¿Que vehiculo registrara en el concesionario?");
                    System.out.println("1. AUTO | 2. CAMION | 3. MOTOCICLETA");
                    selecciones=entradaDatos.nextInt();
                    if (selecciones==1){
                        concesionario.agregarVehiculo(autouno);
                    } else if (selecciones==2){
                        concesionario.agregarVehiculo(camionuno);
                    } else if (selecciones==3)
                        concesionario.agregarVehiculo(motouno);                
                }
            }

        } //termina menu
    }*/ //termina main
//}
