package me.jorgemoran.semana5.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        // No se puede crear una instancia directamente
        // Singleton s = new Singleton(); // Esto daría un error

        // Se obtiene la instancia única a través del método estático getInstance()
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // s1 y s2 son la misma instancia
        System.out.println(s1 == s2); // Debería imprimir true

        // Uso de métodos de la instancia Singleton
        s1.realizarAccion();
        s2.realizarAccion();
    }
}
