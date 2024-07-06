package me.jorgemoran.semana3.entity;

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) throws Exception {
        if(!breed.equals("poodle")){
            throw new Exception("Solamente permitimos poodles");
        }
        this.breed = breed;
    }

    // Constructor
    public Dog(String name, int age, boolean isDomestic) {
        super(name, age, isDomestic);
    }

    // Método para acceder a campos protected y default desde una subclase
    public void printDetails() {
        System.out.println("Perro - Nombre: " + name + ", Edad: " + age);
        displayInfo();
    }

    @Override
    public void otraFuncion() {
        super.otraFuncion();
        System.out.println("Los perros funcionan distinto a los animales genericos");
    }
}