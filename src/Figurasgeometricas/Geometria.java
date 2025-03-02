
package Figurasgeometricas;
import java.util.Arrays;

/**
 *
 * @author cyn
 */
public class Geometria {
    public static void main(String[] args) {
        Forma forma[]=new Forma[3];
        
        //objetos
        Triangulo tri=new Triangulo(10,3);
        Rectangulo recto=new Rectangulo(5,5);
        Forma cir=new Circulo(34.6);
        
        forma[0]=tri;
        forma[1]=recto;
        forma[2]=cir;
        
        for (Forma valor: forma){
            System.out.println(valor.mostrarTipo());
            System.out.println("Area de la figura: "+ valor.calcularArea());
        }
    }
}
