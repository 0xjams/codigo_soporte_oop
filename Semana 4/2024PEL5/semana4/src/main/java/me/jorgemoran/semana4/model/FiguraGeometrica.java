package me.jorgemoran.semana4.model;

import me.jorgemoran.semana4.enums.Color;
public abstract class FiguraGeometrica {
    protected Color color;

    // Método abstracto - sin implementación
    public abstract double calcularArea();

    // Método concreto - con implementación
    public void setColor(Color color) {
        this.color = color;
    }
}
