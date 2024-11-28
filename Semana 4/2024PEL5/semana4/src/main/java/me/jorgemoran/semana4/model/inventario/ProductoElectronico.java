package me.jorgemoran.semana4.model.inventario;

public class ProductoElectronico extends Producto {
    protected String marca;
    public ProductoElectronico(String nombre, String marca, double precio, int stock) {
        super(nombre, precio, stock);
        this.marca=marca;
    }

}
