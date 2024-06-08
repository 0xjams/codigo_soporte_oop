package me.jorgemoran.semana2.sobrecarga;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor sin parámetros
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor con un parámetro
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    // Constructor con dos parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar datos de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}