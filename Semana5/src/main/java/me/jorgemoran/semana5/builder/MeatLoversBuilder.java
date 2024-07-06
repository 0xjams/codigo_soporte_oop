package me.jorgemoran.semana5.builder;

public class MeatLoversBuilder extends Pizza.PizzaBuilder {
    @Override
    public Pizza build() {
       super.setTopping("carne y pollo");
       super.setSalsa("BBQ");
       return pizza;
    }
}
