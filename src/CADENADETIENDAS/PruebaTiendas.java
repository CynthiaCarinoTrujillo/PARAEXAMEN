
package CADENADETIENDAS;
import java.util.Random;

/**
 *
 * @author cyn
 */
public class PruebaTiendas {
    
    //metodo para crear numeros aleatorios, se declaro static para q no dependa de objetos
    public static int generacionAleatorios(){
        Random r=new Random();
        int numeros=r.nextInt(5)+1;
        return numeros;
    }
    
    public static void main(String[] args) {
//        generacionAleatorios();
//        System.out.println(generacionAleatorios());
    
        //creacion de objetos tiendas
        Tienda t1=new Tienda("Gran via");
        Tienda t2=new Tienda("El rocio");
        
       //simule ventas aleatorias en ambas tiendas para los tres productos.
       t1.comprarChicle(generacionAleatorios());
       t1.comprarCoca(generacionAleatorios());
       t1.comprarDonuts(generacionAleatorios());
       
       //ventas de tienda t2
       t2.comprarCoca(generacionAleatorios());
       t2.comprarChicle(generacionAleatorios());
       t2.comprarDonuts(generacionAleatorios());
           
       //informacion parcial de cada tienda
        System.out.println(t1.consultarVentasParciales());
        System.out.println("------------------------------");
       System.out.println(t2.consultarVentasParciales());
        System.out.println("-------------------------------");
       
       //informacion global
        System.out.println(Tienda.consultarVentasTotales());
       
        System.out.println("---------------------------------");
        System.out.println("Tienda uno "+ t1.toString());
        System.out.println("Tienda dos "+ t2.toString());
    }
}
