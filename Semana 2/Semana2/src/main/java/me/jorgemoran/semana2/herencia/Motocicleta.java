package me.jorgemoran.semana2.herencia;

class Motocicleta extends Vehiculo {
    public Motocicleta(String marca) {
        super(marca);
    }

    // Implementación del método abstracto, mostrando Polimorfismo
    @Override
    public void mover() {
        System.out.println("La motocicleta " + getMarca() + " está en movimiento.");
    }
}
