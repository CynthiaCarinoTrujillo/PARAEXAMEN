
package ejercicio7_10.Personal;
import ejercicio7_10.Personal.Maquinaria.Locomotora;
import ejercicio7_10.Personal.Maquinaria.Tren;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author cyn
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        
        LocalDateTime fechas=LocalDateTime.of(1995,3,1,10,40);
        //crear jefe de estacion
        JefeEstacion jefe=new JefeEstacion("Sebas Luch","3435JKA",fechas);
        System.out.println(jefe.toString());
        
        System.out.println("Ingrese el nombre del mecanico");
        String cadena=datos.nextLine().trim();
        
        System.out.println("Ingrese el telefono del mecanico");
        String numericos=datos.nextLine().trim();
        
        System.out.println("Especifique la especialidad: MOTOR | RUEDAS | VIAS | ELECTRICIDAD");
        String especialidad=datos.nextLine().trim().toUpperCase();
        
        //crear mecanico
        Mecanico meca=new Mecanico(cadena, numericos,especialidad);
        System.out.println("MECANICO CREADO");
        
        //locomotora
        System.out.println("Ingrese la matricula de la locomotora: ");
        cadena=datos.nextLine().trim();
        System.out.println("Ingrese la potencia de la locomotora");
        double reales=datos.nextDouble();
        fechas=LocalDateTime.of(1750,6,2,6,30);
        Locomotora locomo=new Locomotora(meca,cadena, reales,fechas);
        System.out.println(locomo.toString());
        
        //crear maquinista
        cadena="Jose Lopez";
        String dni="2343251";
        reales=453667.32;
        String rango="SEGUNDO";
        
        Maquinista maqui=new Maquinista(cadena, dni, reales, rango);
        
        //crear tren
        Tren trenuno=new Tren(locomo,maqui);
        //en este punto, se ha creado el espacio del array pero esta vacio
        
        //podemos llamar a la funcion para añadir vagones
        datos.nextLine();
        System.out.println("Ingrese el identificador del vagon");
        cadena=datos.nextLine().trim();
        System.out.println("Carga maxima del vagon");
        double numuno=datos.nextDouble();
        System.out.println("Carga actual del vagon");
        double numdos=datos.nextDouble();
        datos.nextLine();
        System.out.println("Mercancia del vagon");
        String mercancia=datos.nextLine().trim();
        //enviamos el vagon al array del tren
        trenuno.enganchaVagon(cadena, numuno, numdos, mercancia);
        
        //ahora imprimiremos el array...los elementos que tenga
        System.out.println(trenuno.getVagonesEnganchados());
        
    }
}
