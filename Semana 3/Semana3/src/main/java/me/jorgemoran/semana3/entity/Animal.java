package me.jorgemoran.semana3.entity;

public class Animal {
    // Campo con modificador default (visible solo dentro del paquete)
    String name;

    // Campo con modificador protected
    protected int age;

    // Campo con modificador public
    public boolean isDomestic;

    // Constructor
    public Animal(String name, int age, boolean isDomestic) {
        this.name = name;
        this.age = age;
        this.isDomestic = isDomestic;
    }

    // Método con modificador default
    void displayInfo() {
        System.out.println("Nombre: " + name + ", Edad: " + age + ", Doméstico: " + isDomestic);
    }
}
