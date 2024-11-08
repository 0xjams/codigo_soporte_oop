package me.jorgemoran.semana3.model;

public class CuentaBancaria {
    private double saldo;
    private String pin;

    public CuentaBancaria(String pin, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial no puede ser negativo");
        }
        this.pin = pin;
        this.saldo = saldoInicial;
    }

    public boolean retirar(double monto, String pinIngresado) {
        if (!validarPin(pinIngresado)) return false;
        if (monto <= saldo && monto > 0) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    private boolean validarPin(String pinIngresado) {
        return this.pin.equals(pinIngresado);
    }

    public double consultarSaldo(String pinIngresado) {
        if (validarPin(pinIngresado)) {
            return saldo;
        }
        throw new SecurityException("PIN inválido");
    }
}
