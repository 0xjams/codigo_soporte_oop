package me.jorgemoran.semana4.entity;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
