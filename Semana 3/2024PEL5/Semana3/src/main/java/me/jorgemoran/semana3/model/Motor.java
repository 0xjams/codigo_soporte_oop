package me.jorgemoran.semana3.model;
import me.jorgemoran.semana3.enums.TiposCombustible;
public class Motor {
    TiposCombustible combustible;
    private int nivel_combustible;
    public Motor(TiposCombustible combustible) {
        this.combustible = combustible;
        this.nivel_combustible=100;
    }

    public void activar(){
        this.nivel_combustible--;
    }
}
