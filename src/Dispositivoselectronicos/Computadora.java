
package Dispositivoselectronicos;

/**
 *
 * @author cyn
 */
public class Computadora implements Dispositivo{

    @Override
    public void encender() {
        System.out.println("Computadora encendiendose");
    }

    @Override
    public void apagar() {
        System.out.println("Computadora apagandose");
    }

    @Override
    public void reiniciar() {
        System.out.println("Computadora reiniciandose");
    }
    
}
