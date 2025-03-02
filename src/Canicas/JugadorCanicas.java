package Canicas;

/**
 *
 * @author cyn
 */
public class JugadorCanicas {

    private static int bolsacanicas = 0; //total de canicas compartidas por los jugadores en cada momento.
    private String nombre; //almacenará el nombre de cada jugador.

    //constructor
    public JugadorCanicas(String nombre) {
        this.nombre = nombre;
    }

    //metodo static añadir numero de canicas
    public static void anadeCanicas(int cantidad) {
        JugadorCanicas.bolsacanicas += cantidad;
    }

    //metodo static que quita numero de canicas
    public static void eliminaCanicas(int cantidad) {
        JugadorCanicas.bolsacanicas -= cantidad;
    }
    
    //metodo static que consultara el numero de canicas existentes
    public static int getBolsacanicas() {
        return bolsacanicas;
    }

    public String getNombre() {
        return nombre;
    }
    
    //metodo que imprime la informacion
    @Override
    public String toString() {
        return '{'+ nombre + " MIRA LA BOLSA Y VE " + getBolsacanicas() + " CANICAS" + '}';
    }
    
    
}
