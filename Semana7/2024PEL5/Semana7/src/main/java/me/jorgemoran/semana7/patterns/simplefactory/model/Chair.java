package me.jorgemoran.semana7.patterns.simplefactory.model;

import me.jorgemoran.semana7.patterns.simplefactory.Furniture;

public class Chair implements Furniture {
    public void assemble() {
        System.out.println("Ensamblando silla...");
    }
    public void deliver() {
        System.out.println("Entregando silla...");
    }
}
