package me.jorgemoran.semana8.decorator;

public class AbstractCoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public AbstractCoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
