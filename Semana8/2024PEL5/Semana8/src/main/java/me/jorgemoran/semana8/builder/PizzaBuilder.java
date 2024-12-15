package me.jorgemoran.semana8.builder;

import me.jorgemoran.semana8.model.Pizza;

public class PizzaBuilder {
    private Pizza pizza = new Pizza();

    public PizzaBuilder setMasa(String masa) {
        pizza.setMasa(masa);
        return this;
    }

    public PizzaBuilder setSalsa(String salsa) {
        pizza.setSalsa(salsa);
        return this;
    }

    public PizzaBuilder setQueso(String queso) {
        pizza.setQueso(queso);
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        pizza.addTopping(topping);
        return this;
    }

    public Pizza build() {
        return pizza;
    }

}
