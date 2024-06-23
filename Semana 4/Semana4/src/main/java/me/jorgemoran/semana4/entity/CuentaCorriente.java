package me.jorgemoran.semana4.entity;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo + limiteSobregiro) {
            saldo -= cantidad;
        } else {
            System.out.println("Límite de sobregiro excedido");
        }
    }
}
