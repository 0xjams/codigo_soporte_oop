package me.jorgemoran.semana4;
import me.jorgemoran.semana4.entity.*;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria miCuentaAhorros = new CuentaAhorros(1000, 0.05);
        CuentaBancaria miCuentaCorriente = new CuentaCorriente(500, 300);

        miCuentaAhorros.depositar(200);
        miCuentaCorriente.retirar(600);
        if(miCuentaAhorros instanceof CuentaAhorros){
            System.out.println(miCuentaAhorros.toString() + " es de ahorros");
        }
        if(miCuentaAhorros instanceof CuentaCorriente){
            System.out.println(miCuentaAhorros + " es corriente");
        }
        System.out.println("Saldo cuenta de ahorros: " + miCuentaAhorros.consultarSaldo());
        System.out.println("Saldo cuenta corriente: " + miCuentaCorriente.consultarSaldo());
    }
}
