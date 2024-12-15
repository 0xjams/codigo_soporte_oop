package me.jorgemoran.semana7.patterns.simplefactory;

import me.jorgemoran.semana7.patterns.simplefactory.model.Chair;
import me.jorgemoran.semana7.patterns.simplefactory.model.Table;

public class FurnitureFactory {
    public static Furniture createFurniture(String type) {
        if (type == null) {
            throw new IllegalArgumentException("El tipo no puede ser null");
        }

        switch (type.toLowerCase()) {
            case "chair":
                return new Chair();
            case "table":
                return new Table();
            default:
                throw new IllegalArgumentException(
                        "Tipo de mueble no soportado: " + type
                );
        }
    }
    public static void main(String[] args){
        Furniture table = FurnitureFactory.createFurniture("table");
        table.assemble();
        Furniture chair = FurnitureFactory.createFurniture("chair");
        chair.assemble();
        Furniture sofa = FurnitureFactory.createFurniture("sofa");
    }
}
