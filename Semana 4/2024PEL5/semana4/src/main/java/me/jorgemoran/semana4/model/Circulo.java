package me.jorgemoran.semana4.model;

public class Circulo extends FiguraGeometrica{
    protected int radio;

    public Circulo(int radio){
        this.radio=radio;
    }

    @Override
    public double calcularArea() {
        return 3.14*radio*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
