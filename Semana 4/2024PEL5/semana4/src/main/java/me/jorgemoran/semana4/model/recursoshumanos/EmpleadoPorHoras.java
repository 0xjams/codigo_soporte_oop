package me.jorgemoran.semana4.model.recursoshumanos;

public class EmpleadoPorHoras extends Empleado{
    protected double tarifaPorHora;
    protected int horasTrabajadas;

    public EmpleadoPorHoras(int horasTrabajadas, double tarifaPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora*horasTrabajadas;
    }
}
