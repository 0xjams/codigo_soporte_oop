package me.jorgemoran.semana8.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Definición de la anotación
@Retention(RetentionPolicy.RUNTIME)  // Esta anotación puede ser detectada en tiempo de ejecución
@Target(ElementType.TYPE)  // Esta anotación es aplicable a clases
public @interface MyCustomAnnotation {
    String description() default "No description";
}
