package me.jorgemoran.semana2.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Ana");
        Persona persona3 = new Persona("Carlos", 25);

        persona1.mostrarInfo();
        persona2.mostrarInfo();
        persona3.mostrarInfo();
    }
}