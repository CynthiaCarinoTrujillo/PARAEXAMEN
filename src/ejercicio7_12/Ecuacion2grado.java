package ejercicio7_12;

/**
 *
 * @author cyn
 */
public class Ecuacion2grado {

    private int a;
    private int b;
    private int c;

    //constructor
    public Ecuacion2grado(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

//Método espositivoDiscriminante() 
    public boolean espositivoDiscriminante() {
        //si el discriminante es mayor o igual a cero es true
        boolean resultado = true;
        int discriminante = (b * b) - (4 * a * c);
        if (discriminante >= 0) {
            resultado = true;
        } else {
            //si el discriminante es menor a cero es negativo
            resultado = false;
        }
        return resultado;
    }

    //Método discriminante(), que devuelve el valor del discriminante de la ecuación
    //b²-4ac el discriminando indica si hay 2 soluciones
    public double discriminante() {
        double discriminante =((b * b) -(4 *a) *c);
        return discriminante;
    }

    /*  Método solución: calcula y devuelve el resultado de la ecuación. Como hay que devolver dos valores, este
método devolverá un array de dos elementos que contiene las soluciones reales de la ecuación. Si el
discriminante es negativo (es decir, no hay soluciones reales), debe devolver `Double.NaN` en ambas
posiciones **.*/
    public double[] solucion() {
        //crear array que guardar 2 soluciones...
        double resultados[] = new double[2];
        ///esto devolvera el valor del discriminante, una vez teniendolo se debe calcular el resto de la ecuacion
        double discriminante = discriminante();
        if (discriminante > 0) { //Y si es mayor que zero, la ecuación tendrá dos soluciones.
            resultados[0] = ((-b + Math.sqrt(discriminante)) / (2 * a));
            resultados[1] = ((-b - Math.sqrt(discriminante)) / (2 * a));
        } else if (discriminante < 0) { ////Si es menor que cero,la ecuación no tendrá soluciones. 
            resultados[0] = Double.NaN;
            resultados[1] = Double.NaN;
        } else if (discriminante == 0) { ////el discriminante vale cero la ecuación tendrá una solución única 
            resultados[0] = -b / (2 * a);
            resultados[1] = Double.NaN;
        }
        return resultados;
    }

}
