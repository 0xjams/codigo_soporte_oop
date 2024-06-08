package me.jorgemoran.semana2.herencia;

public class Coche extends Vehiculo {
    private int numeroDePuertas;
    private final int llantas = 4;
    public Coche(String marca, int numeroDePuertas) {
        super(marca);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Implementación del método abstracto, mostrando Polimorfismo
    @Override
    public void mover() {
        System.out.println("El coche de " + llantas + " llantas y de marca " + getMarca() + " está en movimiento.");
    }
}