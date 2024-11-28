package me.jorgemoran.semana4.model.inventario;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.*;

public class CarritoCompras implements Iterable<Producto>{
    private List<Producto> items;
    private double totalCompra;

    public CarritoCompras() {
        this.items = new ArrayList<>();
        this.totalCompra = 0;
    }

    public void agregarProducto(Producto p) {
        items.add(p);
        totalCompra += p.getPrecio();
    }

    public void quitarProducto(Producto p) {
        if (items.remove(p)) {
            totalCompra -= p.getPrecio();
        }
    }

    public double getTotal() {
        return totalCompra;
    }

    @Override
    public void forEach(Consumer<? super Producto> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Producto> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public Iterator<Producto> iterator() {
        return items.iterator();
    }

    // Método main de ejemplo
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        // Agregar productos al carrito
        carrito.agregarProducto(new Producto("Laptop", 999.99, 1));
        carrito.agregarProducto(new Producto("Mouse", 19.99, 1));
        carrito.agregarProducto(new Producto("Teclado", 49.99, 1));

        // Usar el iterador para mostrar productos
        System.out.println("Productos en el carrito:");
        for (Producto item : carrito) {
            System.out.println(item);
        }

        System.out.printf("Total de la compra: $%.2f%n", carrito.getTotal());
    }
}
