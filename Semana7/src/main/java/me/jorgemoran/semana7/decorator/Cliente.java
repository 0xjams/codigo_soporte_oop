import me.jorgemoran.semana7.decorator.*;

public class Cliente {
    public static void main(String[] args) {
        // Café simple
        Cafe cafeSimple = new CafeSimple();
        System.out.println("Descripción: " + cafeSimple.descripcion());
        System.out.println("Precio: $" + cafeSimple.precio());

        // Café con leche
        Cafe cafeConLeche = new Leche(new CafeSimple());
        System.out.println("Descripción: " + cafeConLeche.descripcion());
        System.out.println("Precio: $" + cafeConLeche.precio());

        // Café con leche y chocolate
        Cafe cafeConLecheYChocolate = new Chocolate(new Leche(new CafeSimple()));
        System.out.println("Descripción: " + cafeConLecheYChocolate.descripcion());
        System.out.println("Precio: $" + cafeConLecheYChocolate.precio());
    }
}