package me.jorgemoran.semana4;
import me.jorgemoran.semana4.entity.*;
public class InterfacesMain {

    public static void ejecutarTransaccion(Transaccion t, double c){
        t.ejecutar(c);
        if(t instanceof Deposito){
            System.out.println("Estamos ejecutando un deposito");
        }
        if(t instanceof Retiro){
            System.out.println("Estamos ejecutando un retiro");
        }
    }
    public static void accionMultimoneda(MultiMoneda m){
        System.out.println("Estoy haciendo una transaccion multimoneda");
    }
    public static void main(String[] args) {
        Deposito miDeposito = new Deposito();
        Retiro miRetiro = new Retiro();

        //miDeposito.ejecutar(1000); // Salida: Depósito de: 1000 realizado
        //miRetiro.ejecutar(500);    // Salida: Retiro de: 500 realizado
        InterfacesMain.ejecutarTransaccion(miDeposito, 1000);
        InterfacesMain.ejecutarTransaccion(miRetiro, 500);
        InterfacesMain.accionMultimoneda(miDeposito);
    }
}
