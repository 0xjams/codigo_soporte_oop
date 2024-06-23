package me.jorgemoran.semana4.entity;

public class Deposito implements Transaccion {
    @Override
    public void ejecutar(double cantidad) {
        System.out.println("Depósito de: " + cantidad + " realizado");
    }
}
