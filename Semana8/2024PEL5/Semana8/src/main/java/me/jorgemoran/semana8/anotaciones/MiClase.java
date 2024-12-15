package me.jorgemoran.semana8.anotaciones;

@MyCustomAnnotation(description = "Esta es una clase de ejemplo con anotación personalizada")
public class MiClase {
    // Método que queremos invocar usando reflection
    public void displayMessage() {
        System.out.println("Este es un mensaje desde MyClass!");
    }
}
