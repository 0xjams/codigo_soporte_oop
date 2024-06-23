package me.jorgemoran.semana3.entity;

public class Dog extends Animal {

    // Constructor
    public Dog(String name, int age, boolean isDomestic) {
        super(name, age, isDomestic);
    }

    // Método para acceder a campos protected y default desde una subclase
    public void printDetails() {
        System.out.println("Perro - Nombre: " + name + ", Edad: " + age);
        displayInfo();
    }
}