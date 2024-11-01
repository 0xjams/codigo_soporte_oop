package me.jorgemoran.semana7.decorator;

public class Chocolate extends DecoradorCafe {
    public Chocolate(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion() + ", Chocolate";
    }

    @Override
    public double precio() {
        return cafeDecorado.precio() + 0.7;
    }
}
