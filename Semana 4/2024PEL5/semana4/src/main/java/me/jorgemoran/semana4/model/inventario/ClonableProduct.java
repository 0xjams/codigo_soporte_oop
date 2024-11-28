package me.jorgemoran.semana4.model.inventario;

public class ClonableProduct extends Producto implements Cloneable {

    public ClonableProduct(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ClonableProduct p = (ClonableProduct) super.clone();
        p.setStock(p.getStock()*10);
        return p;
    }
}
