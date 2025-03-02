
package ejercicio7_12;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author cyn
 */
public class Prueba {
        
    /*
    Método muestraSolucion(): recibe las soluciones de la ecuación y las muestra, teniendo en cuenta que
pueden darse tres situaciones, según el valor del discriminante: la ecuación puede tener dos soluciones
(discriminante positivo), una solución (discriminante 0) o ninguna solución (discriminante negativo).
    */
    public static void muestraSolucion(double [] array){
        //debe imprimir el array de 
        System.out.println("Soluciones: "+ Arrays.toString(array));
    }
    
    public static void main(String[]args){
        Scanner datos=new Scanner(System.in);
        
        System.out.println("Ingrese un valor A para resolver la ecuacion de segundo grado");
        int a=datos.nextInt();
        System.out.println("Ingrese un valor B para resolver la ecuacion de segundo grado");
        int b=datos.nextInt();
        System.out.println("Ingrese un valor C para resolver la ecuacion de segundo grado");
        int c=datos.nextInt();
        //crear objeto con estos valores pasados por el usuario
        Ecuacion2grado primera=new Ecuacion2grado(a,b,c);
        
        System.out.println("Discriminante es: "+ primera.espositivoDiscriminante());
        System.out.println("Ecuacion con coeficientes; "+ a +","+ b + ","+ c);
        
        System.out.println("SOLUCION DE LA ECUACION");
        
        //crear un array donde se guardaran las soluciones
        double resultantes[]=primera.solucion();
        //ahora imprimiremos la informacion del array
        muestraSolucion(resultantes);
    }
}
