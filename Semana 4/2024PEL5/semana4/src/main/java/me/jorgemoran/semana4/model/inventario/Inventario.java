package me.jorgemoran.semana4.model.inventario;
import java.util.*;
public class Inventario <T extends Producto>{
    ArrayList<T> productos;
    public Inventario(){
        productos = new ArrayList<T>();

    }
    public void agregarProducto(T producto){
        productos.add(producto);
    }

    public ArrayList<T> getProductos(){
        return productos;
    }

    public void mostrar(){
        mostrarProductos();
    }
    public void mostar(int indice){
        try {
            System.out.println(productos.get(indice));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void mostrarProductos(){
        for(T p: productos){
            System.out.println(p);
        }
    }

    public static void main(String[] args){
            Inventario<ProductoElectronico> inventario=new Inventario<>();
            inventario.agregarProducto(new ProductoElectronico("Galaxy S22","Samsung",500,3));
            inventario.agregarProducto(new ProductoElectronico("Galaxy S24","Samsung",800,3));
            inventario.mostrarProductos();

    }
}
