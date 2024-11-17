package me.jorgemoran.semana4;
import me.jorgemoran.semana4.enums.Color;
import me.jorgemoran.semana4.model.Animal;
import me.jorgemoran.semana4.model.*;

public class Main {

    public static void main(String[] args){
        Animal animal = new Animal();
        animal.comer();
        FiguraGeometrica cuadrado = new Cuadrado(4); // Usando la clase base como el tipo de dato de la referencia
        System.out.println("El area del cuadrado es " + cuadrado.calcularArea());
        cuadrado.setColor(Color.AZUL);
        Circulo circulo = new Circulo(5); // Usando la clase circulo como el tipo de dato de la referencia
        System.out.println("El area del circulo es " + circulo.calcularArea());
        Circulo circulo2;
        circulo2=new Circulo(2);
        System.out.println(circulo2.toString());
        System.out.println(cuadrado.toString());
    }
}
