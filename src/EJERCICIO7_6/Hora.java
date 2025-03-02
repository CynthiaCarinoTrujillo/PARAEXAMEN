package EJERCICIO7_6;

/**
 *
 * @author cyn
 */
public class Hora {

    private byte hora;
    private byte minuto;
    private byte segundo;

    public Hora(byte hora, byte minuto, byte segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    
    public void setHora(byte hora) { //rango de 0 a 23.
        //si hora es mas grande que 23 y mas pequeña que 0 se sale de rango
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora=0;
            System.out.println("La hora que introdujo no es valida, se reinicia a 0");
        }

    }

    //verificar rangos en los metodos set
    public void setMinuto(byte minuto) { //rango de 0 a 59
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;
            System.out.println("Los minutos que introdujo no son validos, se reinicia a 0");
        }

    }

    public void setSegundo(byte segundo) { //rango de 0 a 59
        if (segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
        } else {
            this.segundo = 0;
            System.out.println("Los segundos que introdujo no son validos, se reinicia a 0");
        }
        
    }

    //regresan el valor del atributo
    public byte getHora() {
        return hora;
    }

    public byte getMinuto() {
        return minuto;
    }

    public byte getSegundo() {
        return segundo;
    }

    public void informacion(){
        System.out.println("Hora "+ hora + ":"+ minuto + ":" + segundo);
    }
    
    //metodo que incremnta el segundo en 1, si al incrementar a 60, se inicia a 0 y se incrementa el minuto
    public void incrementaSegundo(){
        //incrementar el segundo
        this.segundo++;
        if (segundo >= 60){ //si segundo es mayor o igual a 60, se reinicia a 0 y se incrementa el minuto
            segundo=0;
            //se incrementa el minuto
            minuto++;
            if (minuto>=60){ //si minuto es mayor o igual a 60, se reinicia a 0 y se incrementa la hora
                minuto=0;
                hora++;
                if (hora>=24){ //si la hora es mayor o igual a 24, se reinicia la hora a 0
                    hora=0;
                }
            }
        }
    }

    

}
