package me.jorgemoran.semana4.entity;

public interface MultiMoneda {
    String getMonedaBase();
    double convertirA(int tipo, double cantidad); // 1 -> EUR, 2-> GBP
}
