package me.jorgemoran.semana5.builder;

public abstract class PizzaBuilder {
    protected String masa;
    protected String salsa;
    protected String topping;

    public abstract Pizza build();

    public PizzaBuilder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaBuilder setSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    public PizzaBuilder setTopping(String topping) {
        this.topping = topping;
        return this;
    }
}
