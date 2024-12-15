package me.jorgemoran.semana8.builder;
import me.jorgemoran.semana8.model.Pizza;

public class Main {

    public static void main(String[] args){
        PizzaBuilder builder = new PizzaBuilder();
        builder.setMasa("fina").setQueso("mozzarela").setSalsa("BBQ").addTopping("carne");
        Pizza pizzaPersonalizada = builder.build();
        System.out.println(pizzaPersonalizada);
        PizzaBuilder b2 = new PizzaBuilder();
        b2.setMasa("gruesa");
        b2.setQueso("mozzarela");
        b2.setSalsa("Preggo");
        Pizza p2 = b2.build();
        System.out.println(p2);

    }
}
