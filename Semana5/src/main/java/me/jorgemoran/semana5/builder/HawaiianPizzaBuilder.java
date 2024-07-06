package me.jorgemoran.semana5.builder;

public class HawaiianPizzaBuilder extends Pizza.PizzaBuilder {
    @Override
    public Pizza build() {
        super.setTopping("Jamón y piña");  // Asegura que la pizza hawaiana tenga su topping característico
        return pizza;
    }
}