package me.jorgemoran.semana4.entity;

public class Retiro implements Transaccion {
    @Override
    public void ejecutar(double cantidad) {
        System.out.println("Retiro de: " + cantidad + " realizado");
    }
}
