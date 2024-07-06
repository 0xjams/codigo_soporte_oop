package me.jorgemoran.semana5.estatico;

public class Contador {
    private static int contador = 0;

    public Contador() {
        contador++;
    }

    public int getContadorDesdeObjeto(){
        return Contador.getContador();
    }

    public static int getContador() {
        return contador;
    }
}
