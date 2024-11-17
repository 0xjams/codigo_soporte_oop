package me.jorgemoran.semana4.model;

public class Cuadrado extends FiguraGeometrica{
    protected int lado;

    public Cuadrado(int lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
