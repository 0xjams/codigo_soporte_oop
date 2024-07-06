package me.jorgemoran.semana3.entity;

public class Animal {
    // Campo con modificador default (visible solo dentro del paquete)
    String name;

    // Campo con modificador protected
    protected int age;

    // Campo con modificador public
    public boolean isDomestic;

    // Constructor
    public Animal(String mName, int age, boolean isDomestic) {
        name = mName;
        this.age = age;
        this.isDomestic = isDomestic;
    }

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    // Método con modificador default
    void displayInfo() {
        System.out.println("Nombre: " + this.name + ", Edad: " + this.age + ", Doméstico: " + this.isDomestic);
    }

    void displayInfo(String mensaje){
        this.displayInfo();
        System.out.println(mensaje);
    }

    public void otraFuncion(){
        this.displayInfo();
    }

}
