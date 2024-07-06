package me.jorgemoran.semana5;
import me.jorgemoran.semana5.estatico.*;

public class Main {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println("Número de instancias creadas: " + Contador.getContador());
    }
}
