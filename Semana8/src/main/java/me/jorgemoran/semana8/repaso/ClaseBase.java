package me.jorgemoran.semana8.repaso;

public class ClaseBase {

    public void metodoASobreescribir(){
        System.out.println("Estoy en ClaseBase");
    }

    public void metodoASobreescribir(String s)/*Esto es la sobrecarga del metodo de arriba*/{
        System.out.println("Desde ClaseBase imprimo " + s);
    }
}
