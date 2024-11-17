package me.jorgemoran.semana4.model.inventario;
import  java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Tienda {
    private List<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
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

    }
}
