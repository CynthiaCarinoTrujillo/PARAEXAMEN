package Colas;

import java.util.Arrays;

/**
 *
 * @author cyn
 */
public class Lista {

    private Integer listanum[];
    int controlLista;

    public Lista() {
        this.listanum = new Integer[0];
        this.controlLista = 0;
    }

    //cantidad de elementos insertados en la lista
    public int getControlLista() {
        return controlLista;
    }

    //insertar un numero al inicio del array
    public void insercionInicio(Integer num) {
        //debemos crear un espacio en el array antes...
        listanum = Arrays.copyOf(listanum, listanum.length + 1); //ha creado un espacio a la derecha
        //ahora debemos desplazar todos los elementos registrados a la derecha...

        //el contador INICIA en la ultima posicion del array...5 y va disminuyendo...4..3..2 hasta > el 0    
        for (int contador = listanum.length - 1; contador > 0; contador--) {
            //los numeros del usuario se iran guardando en ese orden...4..3..2...
            listanum[contador] = listanum[contador - 1];
        }
        listanum[0] = num;
        controlLista++;
    }

    //insertar al final de la lista
    public void insertarFinal(Integer num) {
        //incrementamos la longitud del array
        listanum = Arrays.copyOf(listanum, listanum.length + 1);
        //debemos acceder al ultimo indice del array y rellenarlo
        listanum[listanum.length - 1] = num;
        controlLista++;
    }

    //metodo que inserta un numero, segun el lugar(indice) que indica el usuario
    public void insertarEnIndice(int lugar, Integer valor) {
        //tenemos que incrementar la longitud del array para generar un hueco
        //debemos crear un hueco en el lugar especificado por el usuario
        Integer aux[] = Arrays.copyOf(listanum, listanum.length + 1);

        //primero verificamos que el lugar se encuentre dentro del rango...
        if (lugar < aux.length && lugar >= 0) {
            //si el lugar indicado esta en este rango...podemos generar un hueco

            //hueco antes del lugar indicado
            System.arraycopy(listanum, 0, aux, 0, lugar - 1); //aqui se toma lugar como cantidad NO POSICION

            //hueco despues de el lugar indicado
            System.arraycopy(listanum, lugar - 1, aux, lugar, listanum.length - (lugar - 1));

            //se han copiado valores a aux
            aux[lugar - 1] = valor;
            //registramos toda la actualizacion en el array de lista
            listanum = Arrays.copyOf(aux, aux.length);
            controlLista++;

        } else {
            System.out.println("El lugar se encuentra fuera de rango");
        }

    }

    //metodo para añadir una lista(arrays) al final de esta lista
    public void insertarOtraLista(Integer listaRecibida[]) {
        //necesitamos la longitud de la otra lista... y con ella crearemos la longitud de la nuestra
        int longitudRecibida = listaRecibida.length; //representa la cantidad de elementos extra, de esa lista
        int longitudlistanum = listanum.length; //2
        listanum = Arrays.copyOf(listanum, listanum.length + longitudRecibida);

        //tenemos que copiar los elementos de la lista recibida
        System.arraycopy(listaRecibida, 0, listanum, longitudlistanum, longitudRecibida);
        //estamos copiando desde el indice 0 de la otra lista - el destino es listanum y debemos copiar en el indice

        controlLista += longitudRecibida;

    }

    //eliminar un elemento,se pasa como parametro el indice del usuario
    public void eliminarElemento(int indice) {
        indice = indice - 1; //si el usuario quiere eliminar la posicion 2, es el indice 1 el que debe borrarse

        if (indice >= listanum.length) {
            System.out.println("El indice no se encuentra dentro del rango...");
            return;
        }
        //eliminar el indice 1
        Integer tablaaux[] = new Integer[listanum.length - 1]; //nueva tabla con un indice menos
        //copiamos desde el 0 al indice del usuario que es 1
        System.arraycopy(listanum, 0, tablaaux, 0, indice); //indice vale como cantidad 

        //copiamos desde el indice 1 hacia la derecha
        //cantidad de elementos a copiar???
        System.arraycopy(listanum, indice + 1, tablaaux, indice, tablaaux.length - indice);

        //devolvemos el valor a nuestra tabla
        listanum = Arrays.copyOf(tablaaux, tablaaux.length);
        controlLista--;
    }

    //obtener el elemento del indice que se pasa como parametro
    public Integer obtenerElemento(int indice) {
        indice = indice - 1;
        //si me pasan el indice 2, se refiere al indice 1...quiere el indice 1

        if (indice >= listanum.length) {
            System.out.println("El indice no se encuentra dentro del rango...");
            return null;
        } else {
            return listanum[indice];
        }
    }
    
    //metodo para buscar un numero en la lista que devolvera -1 si el indice no esta
    public int devuelveIndice(Integer buscado){
        int indice=0;
        for (Integer valor: listanum){
            //buscar el valor ingresado por el usuario
            indice=Arrays.binarySearch(listanum, buscado);
        }
        return indice;
    }
        
    @Override
    public String toString() {
        return "LISTA{" + Arrays.toString(listanum) + ",\nELEMENTOS TOTALES = " + controlLista + '}';
    }

}
