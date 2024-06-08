package me.jorgemoran.semana2.herencia;

abstract class Vehiculo {
    private String marca; // Encapsulación: campo privado

    public Vehiculo(String marca) { // Constructor
        this.marca = marca;
    }

    public String getMarca() { // Encapsulación: método público para acceder a la marca
        return marca;
    }

    // Método abstracto que deben implementar las subclases
    public abstract void mover();
}
