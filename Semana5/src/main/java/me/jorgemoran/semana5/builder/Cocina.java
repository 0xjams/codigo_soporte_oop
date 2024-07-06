package me.jorgemoran.semana5.builder;

public class Cocina {
    private Pizza.PizzaBuilder builder;

    public void setBuilder(Pizza.PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza getPizza() {
        //builder.setMasa("suave").setSalsa("dulce");  // Si quisiéramos, la cocina podría tener valores por defecto
        return builder.build();
    }
}

