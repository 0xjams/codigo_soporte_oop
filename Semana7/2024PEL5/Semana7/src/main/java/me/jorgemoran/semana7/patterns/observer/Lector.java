package me.jorgemoran.semana7.patterns.observer;

public class Lector implements Observer {
    String nombreLector;

    public Lector(String nombreLector) {
        this.nombreLector = nombreLector;
    }

    @Override
    public void update(String message) {
        System.out.println(nombreLector  +  " esta leyendo: \n");
        System.out.println(message);
    }
}
