package me.jorgemoran.semana3.model;

public class Perro extends Animal{

    private String raza;

    public Perro(String raza) {
        super(true,true);
        this.raza = raza;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
