package me.jorgemoran.semana4;

import me.jorgemoran.semana4.model.inventario.Producto;
import me.jorgemoran.semana4.model.inventario.ClonableProduct;
public class MainCloneable {


    public static void main(String[] args){
        try{
        ClonableProduct p = new ClonableProduct("Coca Cola",0.85,1);
        ClonableProduct p2=(ClonableProduct) p.clone();
        System.out.println(p);
        System.out.println(p2);
        ClonableProduct p3 = p2;
        p3.setStock(0);
        // P2 fue afectado porque p3 no es un clon, es una referencia que apunta al mismo objeto
        System.out.println(p2);
        // P sigue como si nada porque p2 es un clon
        System.out.println(p);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
