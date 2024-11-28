package me.jorgemoran.semana4.generics;

import me.jorgemoran.semana4.model.inventario.Producto;

public class Contenedor<T> {
    private T valor;
    public T obtener() { return valor; }
    public void guardar(T valor) { this.valor = valor; }
    public void mostrar(){ System.out.println(valor.toString()); }
    public static void main(String[] args){
        Contenedor<String> contenedor = new Contenedor<String>();
        contenedor.guardar("Hola");
        contenedor.mostrar();
        Contenedor<Producto> c2 = new Contenedor<>();
        c2.guardar(new Producto("Coca Cola",0.8,1));
        c2.mostrar();
    }
}
