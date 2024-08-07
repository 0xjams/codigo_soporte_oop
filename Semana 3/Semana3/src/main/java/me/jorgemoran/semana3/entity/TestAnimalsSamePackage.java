package me.jorgemoran.semana3.entity;


public class TestAnimalsSamePackage {
    public static void main(String[] args) {
        /*En este caso Animal no es abstract como en ejemplos anteriores*/
        Animal myAnimal;
        myAnimal = new Animal("Leo", 3, true);
        Dog myDog = new Dog("Rex", 5, true);

        // Acceso directo a miembros public
        // System.out.println("Es doméstico: " + myDog.isDomestic);

        // Acceso a métodos default
        // myAnimal.displayInfo(); // Esto no funciona aqui
        // myAnimal.otraFuncion();
        // Acceso a métodos y campos a través de la subclase
        // myDog.printDetails();
        // myDog.otraFuncion();

        Animal reference = (Animal) myDog;
        reference.displayInfo();
        //reference.printDetails();
        myDog.printDetails();
        Animal anotherAnimal = new Animal();


    }
}

