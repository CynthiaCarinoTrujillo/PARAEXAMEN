
package Dispositivoselectronicos;
import java.util.Scanner;
/**
 *
 * @author cyn
 */
public class prueba {
    public static void main(String[] args) {
        //llamar al menu
         //esto regresa un objeto de dispositivo
        
        Dispositivo dispositivo=menu();
        
        dispositivo.encender();
        dispositivo.apagar();
        dispositivo.reiniciar();
        
        
        
    }
    
     
    
    
    
    
    
    
    //metodo de menu
    public static Dispositivo menu(){
        Scanner entradaDatos=new Scanner(System.in);
        System.out.println("Ingrese 1. para crear un telefono. 2 para crear una computadora");
        int datos=entradaDatos.nextInt();
        switch (datos){
            case 1->{
                System.out.println("Telefono agregado");
                return new Telefono();
            }
            case 2 -> {
                System.out.println("Computadora agregada");
                return new Computadora();
            }
            default -> {
                System.out.println("Opcion invalida");
                return null;
            }
        }       
        
    }
}
