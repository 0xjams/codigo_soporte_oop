package me.jorgemoran.semana7.exceptions;

public class FondosInsuficientesException extends Exception {
    private double valorARetirar;
    private double saldoActual;

    public FondosInsuficientesException(double valorARetirar, double saldoActual) {
        super();
        this.valorARetirar = valorARetirar;
        this.saldoActual = saldoActual;
    }

    public double getValorARetirar() {
        return valorARetirar;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

}
