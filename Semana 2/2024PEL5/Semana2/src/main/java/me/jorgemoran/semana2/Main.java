package me.jorgemoran.semana2;

import me.jorgemoran.semana2.vehiculo.Carro;
public class Main {
    public static void main(String[] args){
        Carro carro;
        carro = new Carro();
        carro.setColor("azul");
        carro.setMarca("Nissan");
        System.out.println(carro.getMarca());
        System.out.println(carro);
        Carro carro2 = new Carro();
        System.out.println(carro2);
        Carro carro3=new Carro("Chevrolret","rojo");
        System.out.println(carro3);
        Carro carro4 = new Carro("Kia","Verde",140);
        System.out.println(carro4);
    }
}
