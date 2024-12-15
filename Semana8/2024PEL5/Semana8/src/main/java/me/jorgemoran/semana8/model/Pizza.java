package me.jorgemoran.semana8.model;

import java.util.*;

public class Pizza {
    protected String masa;
    protected String salsa;
    protected String queso;
    protected List<String> toppings = new ArrayList<>();

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza con masa " + masa + ", salsa " + salsa +
                ", queso " + queso + " y toppings: " + toppings;
    }
}
