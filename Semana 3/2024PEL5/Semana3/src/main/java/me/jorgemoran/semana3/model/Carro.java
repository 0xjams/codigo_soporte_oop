package me.jorgemoran.semana3.model;

import java.util.Objects;
import me.jorgemoran.semana3.enums.EstadoCarro;
import me.jorgemoran.semana3.enums.TiposCombustible;

public class Carro extends Vehiculo{

    private String marca;
    private String modelo;
    private String color;
    private EstadoCarro estado;
    private Motor motor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Carro(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor=new Motor(TiposCombustible.GASOLINA);
    }

    public void acelerar(){
        this.motor.activar();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro carro)) return false;
        return Objects.equals(getMarca(), carro.getMarca()) && Objects.equals(getModelo(), carro.getModelo()) && Objects.equals(getColor(), carro.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca(), getModelo(), getColor());
    }

    /*
    * Si quisieramos que la igualdad se cumpla solamente con marca y color
    *
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }
    * */

    public EstadoCarro getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarro estado) {
        this.estado = estado;
    }
}
