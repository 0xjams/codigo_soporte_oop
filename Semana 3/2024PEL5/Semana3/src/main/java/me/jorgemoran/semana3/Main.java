package me.jorgemoran.semana3;
import me.jorgemoran.semana3.enums.EstadoCarro;
import me.jorgemoran.semana3.model.*;

public class Main {
    public static void main(String[] args){
        Carro c1=new Carro("Nissan","Kicks","gris");
        Carro c2=new Carro("Nissan","Kicks","verde");
        Carro c3=new Carro("Toyota","Corolla","verde");
        Carro c4=new Carro("Nissan","Kicks","verde");
        c4.setEstado(EstadoCarro.ENCENDIDO);
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        System.out.println(c2==c4);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c4)); // Es el unico que debe retornar true
        System.out.println(c4);
    }
}
