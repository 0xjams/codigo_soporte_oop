package me.jorgemoran.semana4;
import me.jorgemoran.semana4.entity.*;
public class InterfacesMain {

    public static void main(String[] args) {
        Transaccion miDeposito = new Deposito();
        Transaccion miRetiro = new Retiro();

        miDeposito.ejecutar(1000); // Salida: Depósito de: 1000 realizado
        miRetiro.ejecutar(500);    // Salida: Retiro de: 500 realizado
    }
}
