package me.jorgemoran.semana8.decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Un cafe simple";
    }

    @Override
    public double getCost() {
        return 1.0;
    }


}
