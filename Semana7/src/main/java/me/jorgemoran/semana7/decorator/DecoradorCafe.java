package me.jorgemoran.semana7.decorator;

// Decorador abstracto
public abstract class DecoradorCafe implements Cafe {
    protected Cafe cafeDecorado;

    public DecoradorCafe(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion();
    }

    @Override
    public double precio() {
        return cafeDecorado.precio();
    }
}
