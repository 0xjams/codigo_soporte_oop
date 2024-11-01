package me.jorgemoran.semana7.decorator;

// Decoradores concretos
public class Leche extends DecoradorCafe {
    public Leche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion() + ", Leche";
    }

    @Override
    public double precio() {
        return cafeDecorado.precio() + 0.5;
    }
}
