package me.jorgemoran.semana4.entity;

public class Deposito implements Transaccion, MultiMoneda {
    @Override
    public void ejecutar(double cantidad) {
        System.out.println("Depósito de: " + cantidad + " realizado");
    }

    @Override
    public String getMonedaBase() {
        return "USD";
    }

    @Override
    public double convertirA(int tipo,double cantidad) {
        if(tipo == 1 ){
            return cantidad * 0.98;
        }
        if(tipo ==  2){
            return cantidad*0.9;
        }
        return cantidad;
    }
}
