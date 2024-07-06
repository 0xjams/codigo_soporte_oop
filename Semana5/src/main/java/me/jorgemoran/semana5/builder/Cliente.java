package me.jorgemoran.semana5.builder;

public class Cliente {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        Pizza.PizzaBuilder builder = new HawaiianPizzaBuilder();

        cocina.setBuilder(builder);
        cocina.setBuilder(builder.setMasa("crispy").setSalsa("ligera")); // Estableciendo propiedades
        Pizza pizza = cocina.getPizza();

        System.out.println(pizza);
    }
}
