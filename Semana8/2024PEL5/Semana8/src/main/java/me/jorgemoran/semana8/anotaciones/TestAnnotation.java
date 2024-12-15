package me.jorgemoran.semana8.anotaciones;

import me.jorgemoran.semana8.model.Pizza;

public class TestAnnotation {
    public static void main(String[] args){
        Class<?> cls = MiClase.class;
        if (cls.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = cls.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Descripción: " + annotation.description());
        } else {
            System.out.println("MyClass no tiene la anotación 'MyCustomAnnotation'");
        }
        cls = Pizza.class;
        if (cls.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = cls.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Descripción: " + annotation.description());
        } else {
            System.out.println("Pizza no tiene la anotación 'MyCustomAnnotation'");
        }
    }
}
