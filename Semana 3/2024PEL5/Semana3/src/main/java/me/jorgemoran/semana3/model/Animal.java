package me.jorgemoran.semana3.model;

public class Animal {
    protected boolean vertebrado;
    boolean mamifero;
    private boolean basadoEnCarbono;

    public Animal(boolean vertebrado, boolean mamifero) {
        this.vertebrado = vertebrado;
        this.mamifero = mamifero;
        basadoEnCarbono=true;
    }
}
