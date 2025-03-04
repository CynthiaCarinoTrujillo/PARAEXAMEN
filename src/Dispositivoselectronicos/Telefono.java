
package Dispositivoselectronicos;

/**
 *
 * @author cyn
 */
public class Telefono implements Dispositivo{

    @Override
    public void encender() {
        System.out.println("Telefono encendiendose");
    }

    @Override
    public void apagar() {
        System.out.println("Telefono apagandose");
    }

    @Override
    public void reiniciar() {
        System.out.println("Telefono reiniciandose");
    }
    
}
