package me.jorgemoran.semana5.builder;

public class Pizza {
    private String masa;
    private String salsa;
    private String topping;

    // Constructor privado para forzar el uso del Builder
    private Pizza() {}

    @Override
    public String toString() {
        return "Pizza: Masa=" + masa + ", Salsa=" + salsa + ", Topping=" + topping;
    }

    // Builder abstracto
    public static abstract class PizzaBuilder {
        protected Pizza pizza = new Pizza();

        public abstract Pizza build();

        public PizzaBuilder setMasa(String masa) {
            pizza.masa = masa;
            return this;
        }

        public PizzaBuilder setSalsa(String salsa) {
            pizza.salsa = salsa;
            return this;
        }

        public PizzaBuilder setTopping(String topping) {
            pizza.topping = topping;
            return this;
        }
    }
}