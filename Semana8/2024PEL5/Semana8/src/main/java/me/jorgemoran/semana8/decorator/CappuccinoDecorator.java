package me.jorgemoran.semana8.decorator;

public class CappuccinoDecorator extends AbstractCoffeeDecorator {
    public CappuccinoDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con leche";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
