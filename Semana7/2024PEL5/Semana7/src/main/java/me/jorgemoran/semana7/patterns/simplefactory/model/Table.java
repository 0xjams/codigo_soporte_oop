package me.jorgemoran.semana7.patterns.simplefactory.model;

import me.jorgemoran.semana7.patterns.simplefactory.Furniture;

public class Table implements Furniture {
    public void assemble() {
        System.out.println("Ensamblando mesa...");
    }
    public void deliver() {
        System.out.println("Entregando mesa...");
    }
}
