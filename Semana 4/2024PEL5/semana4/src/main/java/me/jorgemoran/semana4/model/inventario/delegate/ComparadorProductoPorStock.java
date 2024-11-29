package me.jorgemoran.semana4.model.inventario.delegate;
import me.jorgemoran.semana4.model.inventario.Producto;
import java.util.Comparator;

public class ComparadorProductoPorStock implements Comparator<Producto>{
    @Override
    public int compare(Producto o1, Producto o2) {
        int respuesta;
        if(o1.getStock()==o2.getStock()){
            respuesta = 0;
        }else if(o1.getStock()>o2.getStock()){
            respuesta = 1;
        }else{
            respuesta=-1;
        }

        return respuesta;
    }
}
