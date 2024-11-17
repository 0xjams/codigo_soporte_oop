package me.jorgemoran.semana4.model.recursoshumanos;

public class EmpleadoTiempoCompleto extends Empleado{
    protected double salarioMensual;

    public EmpleadoTiempoCompleto(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
