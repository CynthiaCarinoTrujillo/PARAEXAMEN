
package EJERCICIO7_6;
import java.util.Scanner;

/**
 *
 * @author cyn
 */
public class prueba {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        
        //crear objeto
        System.out.println("Ingrese la hora...");
        byte hora=user.nextByte();
        //para la comprobacion...vamos mandando estos datos a set y que verifique...
                
        System.out.println("Ingrese los minutos...");
        byte minutos=user.nextByte();
        
        System.out.println("Ingrese los segundos...");
        byte segundos=user.nextByte();
        
        //crear objeto...
        Hora primerahora=new Hora(hora,minutos,segundos);
        
//      System.out.println(primerahora);
        primerahora.informacion();
        
        //aumento de segundos...
        System.out.println("Cuantos segundos quiere aumentar?" );
        byte aumentosegundos=user.nextByte();
        int contador=0;
        while (contador < aumentosegundos){
            //llama al metodo que incrementa segundos
            primerahora.incrementaSegundo();
            primerahora.informacion();
            contador++;
        }
        
        
        
    }
}
