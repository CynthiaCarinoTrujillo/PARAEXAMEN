
package Gestionvehiculos;
import java.util.Scanner;
import java.util.Arrays;

/**Despues de diseñar las interfaces se realizaran pruebas en este main
 *
 * @author cyn
 */
public class ManiPruebaconInterfaces {
    public static void main(String[] args) {
        
        Scanner entradaDatos=new Scanner(System.in);
        //array de 5 elementos
        Vehiculo arrayVehiculos[]=new Vehiculo[5];
        
        arrayVehiculos[0]=new Auto("Toyota","Corolla",2015,4);
        arrayVehiculos[1]=new Auto("Honda", "Civic", 2018, 4);
        arrayVehiculos[2]=new Camion("Volvo", "FH16", 2012, 20);
        arrayVehiculos[3]=new Auto ("Ford", "Focus", 2015, 4);
        arrayVehiculos[4]=new Camion("Scania", "R500", 2019, 25);     
        
        System.out.println("Lista de vehiculos: "+ Arrays.deepToString(arrayVehiculos));
        System.out.println("----------------------\n");
        //orden por anio
        ordenXanio ordenanio=new ordenXanio();
        //ordena en base al año
        Arrays.sort(arrayVehiculos, ordenanio);
        //imprimir el orden por año
        System.out.println("Orden por año en decreciente: "+ Arrays.deepToString(arrayVehiculos)+"\n");
    }   
}
