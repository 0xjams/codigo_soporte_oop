package me.jorgemoran.semana7.decorator;

public class CafeSimple implements Cafe {
    @Override
    public String descripcion() {
        return "Café simple";
    }

    @Override
    public double precio() {
        return 1.0;
    }
}


