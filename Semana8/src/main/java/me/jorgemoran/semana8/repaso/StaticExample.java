package me.jorgemoran.semana8.repaso;

public class StaticExample {
    private String dato;
    private int dato2;

    public StaticExample(int dato2, String dato) {
        this.dato2 = dato2;
        this.dato = dato;
    }

    public void mostrarPropiedades(){
        System.out.println("Dato: " + dato + " dato2: " + dato2);
    }
    public static void mostrarDatos(int dato2, String dato){
        System.out.println("Dato: " + dato + " dato2: " + dato2);
    }
    public static void main(String[] args){
        StaticExample obj = new StaticExample(1, "Hola");
        obj.mostrarPropiedades();
        StaticExample.mostrarDatos(2,"Adios");
    }
}
