package me.jorgemoran.semana4.model.inventario;
import me.jorgemoran.semana4.model.inventario.delegate.ComparadorProductoPorStock;

import java.util.Comparator;
import  java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Tienda {
    class ComparadorAlfabeticoProductos implements Comparator<Producto> {
        @Override
        public int compare(Producto o1, Producto o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    }
    private List<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }
    public void mostrarCatalogoOrdenado() {
        // Ordenar por nombre
        List<Producto> porNombre = new ArrayList<>(productos);
        Collections.sort(porNombre, new ComparadorAlfabeticoProductos());

        System.out.println("Catálogo ordenado por nombre:");
        for (Producto p : porNombre) {
            System.out.println(p);
        }

        // Ordenar por stock
        List<Producto> porStock = new ArrayList<>(productos);
        Collections.sort(porStock, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return Integer.compare(o1.getStock(), o2.getStock());
            }
        });

        System.out.println("\nProductos ordenados por stock:");
        for (Producto p : porStock) {
            System.out.println(p);
        }
    }
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> obtenerProductosMasBaratos(int cantidad) {
        // Creamos una copia para no modificar la lista original
        List<Producto> ordenados = new ArrayList<>(productos);
        Collections.sort(ordenados);

        // Devolvemos los primeros 'cantidad' productos
        List<Producto> resultado = new ArrayList<>();
        for (int i = 0; i < Math.min(cantidad, ordenados.size()); i++) {
            resultado.add(ordenados.get(i));
        }
        return resultado;
    }
    public List<Producto> obtenerProductosConMenorStock(int cantidad) {
        // Creamos una copia para no modificar la lista original
        List<Producto> ordenados = new ArrayList<>(productos);
        Collections.sort(ordenados, new ComparadorProductoPorStock());

        // Devolvemos los primeros 'cantidad' productos
        List<Producto> resultado = new ArrayList<>();
        for (int i = 0; i < Math.min(cantidad, ordenados.size()); i++) {
            resultado.add(ordenados.get(i));
        }
        return resultado;
    }
    public static void main(String [] args){
        Tienda t = new Tienda();
        t.agregarProducto(new Producto("Coca Cola",0.8,20));
        t.agregarProducto(new Producto("Leche La Lechera",1.2,20));
        t.agregarProducto(new Producto("Chicle Agogo",0.15,50));
        t.agregarProducto(new Producto("Salsa de tomate",3.15,50));
        List<Producto> ordenados = t.obtenerProductosMasBaratos(3);
        System.out.println(ordenados.size());
        for(Producto p: ordenados){
            System.out.println(p);
        }
        t.mostrarCatalogoOrdenado();
        List<Producto> ordenados2 = t.obtenerProductosConMenorStock(3);
        System.out.println("----- Productos con menor stock: ----");
        for(Producto p: ordenados2){
            System.out.println(p);
        }

    }
}
