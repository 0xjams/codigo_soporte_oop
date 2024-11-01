package me.jorgemoran.semana8.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;



// Uso de la anotación en una clase


// Clase para probar la anotación con reflection y llamar a un método indirectamente
public class TestReflection {
    // Definición de la anotación
    @Retention(RetentionPolicy.RUNTIME)  // Esta anotación puede ser detectada en tiempo de ejecución
    @Target(ElementType.TYPE)  // Esta anotación es aplicable a clases
    public @interface MyCustomAnnotation2 {
        String description() default "No description";
    }

    @MyCustomAnnotation2(description = "Esta es una clase de ejemplo con anotación personalizada")
    public class MyClass2 {
        // Método que queremos invocar usando reflection
        public void displayMessage() {
            System.out.println("Este es un mensaje desde MyClass!");
        }
        public MyClass2(){
            super();
        }
    }

    public static void main(String[] args) {
        try {
            Class<?> cls = MyClass2.class;

            // Verificar si 'MyClass' tiene la anotación 'MyCustomAnnotation'
            if (cls.isAnnotationPresent(MyCustomAnnotation2.class)) {
                // Obtener la instancia de la anotación
                MyCustomAnnotation2 annotation = cls.getAnnotation(MyCustomAnnotation2.class);
                // Imprimir la descripción proporcionada en la anotación
                System.out.println("Descripción: " + annotation.description());
            } else {
                System.out.println("MyClass no tiene la anotación 'MyCustomAnnotation'");
            }

            // Crear una instancia de MyClass
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Obtener el método 'displayMessage' de MyClass
            Method method = cls.getMethod("displayMessage");

            // Invocar el método 'displayMessage' en la instancia de MyClass
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}