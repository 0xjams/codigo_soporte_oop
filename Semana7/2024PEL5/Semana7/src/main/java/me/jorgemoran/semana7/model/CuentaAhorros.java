package me.jorgemoran.semana7.model;

import me.jorgemoran.semana7.exceptions.FondosInsuficientesException;

public class CuentaAhorros {
    protected double saldo;

    public CuentaAhorros(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retiro(double valorARetirar) throws FondosInsuficientesException {
        if(valorARetirar<=saldo) {
            saldo -= valorARetirar;
        }else{
            throw new FondosInsuficientesException(valorARetirar,saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaAhorros cuenta=new CuentaAhorros(500);
        try {
            cuenta.retiro(600);
            System.out.println(cuenta.getSaldo());
        }catch(FondosInsuficientesException fe){
            fe.printStackTrace();;
            System.err.println("Tu saldo actual es " + fe.getSaldoActual() + " no puedes retirar " + fe.getValorARetirar());
        }
    }
}
