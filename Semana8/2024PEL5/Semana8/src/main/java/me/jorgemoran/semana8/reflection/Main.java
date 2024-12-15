package me.jorgemoran.semana8.reflection;

import me.jorgemoran.semana8.anotaciones.MiClase;
import me.jorgemoran.semana8.anotaciones.MyCustomAnnotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            Class<?> cls = MiClase.class;

            // Verificar si 'MyClass' tiene la anotación 'MyCustomAnnotation'
            if (cls.isAnnotationPresent(MyCustomAnnotation.class)) {
                // Obtener la instancia de la anotación
                MyCustomAnnotation annotation = cls.getAnnotation(MyCustomAnnotation.class);
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
