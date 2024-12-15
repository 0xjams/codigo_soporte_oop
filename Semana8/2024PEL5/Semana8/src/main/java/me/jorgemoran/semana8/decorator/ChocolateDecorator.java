package me.jorgemoran.semana8.decorator;

public class ChocolateDecorator extends AbstractCoffeeDecorator{

    public ChocolateDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con chocolate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}
