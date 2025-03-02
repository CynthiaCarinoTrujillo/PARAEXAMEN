package CADENADETIENDAS;

/**
 *
 * @author cyn
 */
public class Tienda {

    private final String direccion; 
    int contadorchicles, contadorcocacolas,contadordonuts=0;
    
    //variables estaticas para el conteo total de todas las tiendas
    static int totalchicles,totalcocas,totaldonuts=0;

    public Tienda(String direccion) {
        this.direccion = direccion;
    }
    
    public Tienda(String direccion, int contadorchicles, int contadorcocacolas) {
        this.direccion = direccion;
        this.contadorchicles = contadorchicles;
        this.contadorcocacolas = contadorcocacolas;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getContadorchicles() {
        return contadorchicles;
    }

    public int getContadorcocacolas() {
        return contadorcocacolas;
    }

    public int getContadordonuts() {
        return contadordonuts;
    }
    
    //metodos que Permiten agregar ventas para cada producto.
    public void comprarChicle(int cantidad){
        contadorchicles+=cantidad;
    //al aumentar la venta de una tienda, se tiene que agregar a la variable statica
        totalchicles+=contadorchicles;
    } 
    
    public void comprarCoca(int cantidad){
        contadorcocacolas+=cantidad;
        totalcocas+=contadorcocacolas;
    }
    
    public void comprarDonuts(int cantidad){
        contadordonuts+=cantidad;
        totaldonuts+=contadordonuts;
    }
    
    //metodo consultar ventas, que devuelve la cantidad de productos vendidos de una tienda
    public String consultarVentasParciales(){
        return "En la tienda de " + direccion+ " las ventas son \n[Cocacolas:"+ contadorcocacolas+ " chicles:"
                + ""+ contadorchicles+ " donuts:"+ contadordonuts + "]";
    }
    
    //metodo static que devolvera la cantidad de ventas de todas las tiendas
    public static String consultarVentasTotales() {
        return "EN TOTAL LAS TIENDAS HAN VENDIDO:\nCoca-cola:"+ totalcocas+ 
                " Chicles:"+ totalchicles + " Donuts:"+ totaldonuts;
    }

    @Override
    public String toString() {
        return "Tienda{" + "direccion=" + direccion + ", contadorchicles=" + contadorchicles + ", contadorcocacolas=" + contadorcocacolas + ", contadordonuts=" + contadordonuts + '}';
    }
    
    
    
    
}
