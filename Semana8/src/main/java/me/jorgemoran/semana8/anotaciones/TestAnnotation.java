package me.jorgemoran.semana8.anotaciones;


// Clase para probar la anotación
public class TestAnnotation {
    // Uso de la anotación en una clase
    @MyCustomAnnotation(description = "Esta es una clase de ejemplo con anotación personalizada")
    public class MyClass {
        // Implementación de la clase
    }
    public static void main(String[] args) {
        Class<?> cls = MyClass.class;

        // Verificar si 'MyClass' tiene la anotación 'MyCustomAnnotation'
        if (cls.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = cls.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Descripción: " + annotation.description());
        } else {
            System.out.println("MyClass no tiene la anotación 'MyCustomAnnotation'");
        }
    }
}
