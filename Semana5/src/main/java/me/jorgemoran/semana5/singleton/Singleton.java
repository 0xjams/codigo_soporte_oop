package me.jorgemoran.semana5.singleton;

public class Singleton {
    private static Singleton instance;

    // Constructor privado para evitar instanciación directa
    private Singleton() {
    }

    // Método estático para obtener la única instancia de Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos adicionales de la instancia Singleton (opcional)
    public void realizarAccion() {
        System.out.println("Realizando acción en Singleton");
    }
}
