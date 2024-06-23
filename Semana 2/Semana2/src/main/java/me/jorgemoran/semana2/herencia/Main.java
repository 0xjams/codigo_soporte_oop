package me.jorgemoran.semana2.herencia;

public class Main {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche("Toyota", 4);
        Vehiculo miMoto = new Motocicleta("Harley Davidson");
        Coche carro = (Coche)miCoche;
        carro.parquearParalelo();

        miCoche.mover(); // Polimorfismo en acción
        miMoto.mover(); // Polimorfismo en acción
    }
}
