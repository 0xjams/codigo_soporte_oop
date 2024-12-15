package me.jorgemoran.semana8.decorator;

public class Cafeteria {

    public static void main(String[] args){
        Coffee c = new SimpleCoffee();
        System.out.println(c.getDescription() + " " + c.getCost());
        Coffee cafeDecorado = new CappuccinoDecorator(c);
        System.out.println(cafeDecorado.getDescription() + " " + cafeDecorado.getCost());
        Coffee c2 = new SimpleCoffee();
        c2 = new ChocolateDecorator(new CappuccinoDecorator(c2));
        System.out.println(c2.getDescription() + " " + c2.getCost());
    }
}
