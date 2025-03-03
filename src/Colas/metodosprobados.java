
package Colas;
import java.util.Arrays;
/**
 *
 * @author cyn
 */
public class metodosprobados {
    public static void main(String[] args) {
        //crear lista
        Lista listanum=new Lista();
        Integer numero=1;
        
        listanum.insercionInicio(numero); //agregamos un numero al array creado
        
        System.out.println(listanum.toString());
        
        Integer numerodos=2;
        Integer numerofinal=34;
        listanum.insercionInicio(numerodos);
        System.out.println(listanum.toString());
        listanum.insertarFinal(numerofinal);
        System.out.println(listanum.toString());
        Integer indiceseleccionado=563;
        
        int seleccion=2;
        listanum.insertarEnIndice(seleccion, indiceseleccionado);
        System.out.println(listanum.toString());
        Integer otra[]=new Integer [4];
        otra[0]=78;
        otra[1]=90;
        otra[2]=90;
        otra[3]=78;
        
        System.out.println("---");
        
        
        //listanum.eliminarElemento(3);
        
        //listanum.obtenerElemento(4);
        System.out.println(listanum.obtenerElemento(1));
        System.out.println("indice encontrado o no..."+ listanum.devuelveIndice(4));
        
        System.out.println("informacion completa: "+ listanum.toString());
        
    }
}
