
package Ejercicioconinstance;
import java.util.Arrays;

/**
 *
 * @author cyn
 */
public class Mainanimales {
    public static void main(String[] args) {
        //array de animales
        Animal listaAnimales[]=new Animal[2];
        listaAnimales[0]=new Perro();
        listaAnimales[1]=new Gato();
        //listaAnimales[3]=new Gato();
        
//recorre la lista e indica si son perros o gatos.
    int contador=0;
    while (contador < listaAnimales.length){
        //recorrer el array e identifica si son perros o gatos
        boolean tipoAnimal= listaAnimales[contador] instanceof Perro; //true
        if (tipoAnimal==true){
            System.out.println("El animal es perro");
            System.out.println(listaAnimales[contador].hacerSonido()+ "\n");
            
        } else {
            System.out.println("El animal es gato");
            System.out.println(listaAnimales[contador].hacerSonido()+ "\n");
        }    
        contador++;
    }
    }
}
