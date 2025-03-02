package Canicas;

/**
 *
 * @author cyn
 */
public class PruebaCanicas {

    public static void main(String[] args) {
        //System.out.println(JugadorCanicas.getBolsacanicas());
        //crear objetos jugador
        JugadorCanicas uno = new JugadorCanicas("Joaquin");
        System.out.println(uno.toString());       
        JugadorCanicas dos = new JugadorCanicas("Carlos");
        System.out.println(dos.toString());  
        System.out.println("_____________________________________");
        //añade 10
        System.out.println(uno.getNombre() + " GANA 10 CANICAS");
        JugadorCanicas.anadeCanicas(10);
        System.out.println(uno.toString()); 
        System.out.println(dos.toString());
        System.out.println("_____________________________________");
        //el segundo jugador pierde 4 canicas
        System.out.println(dos.getNombre()+ " PIERDE 4 CANICAS");
        JugadorCanicas.eliminaCanicas(4);
        System.out.println(uno.toString());
    }
}
