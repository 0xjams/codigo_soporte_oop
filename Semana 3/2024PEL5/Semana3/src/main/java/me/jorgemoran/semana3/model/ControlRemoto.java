package me.jorgemoran.semana3.model;

public class ControlRemoto {

    private int canal;
    private int volumen;
    private boolean encendido;

    // Métodos públicos simples que ocultan la complejidad
    public void encender() {
        // Oculta toda la complejidad de encender el TV
        inicializarSistema();
        cargarConfiguracion();
        encendido = true;
    }

    public void cambiarCanal(int nuevoCanal) {
        if (encendido && nuevoCanal > 0) {
            this.canal = nuevoCanal;
            sintonizarSenal();
            ajustarAntena();
        }
    }

    // Métodos privados que contienen la complejidad
    private void inicializarSistema() { /* ... */ }
    private void cargarConfiguracion() { /* ... */ }
    private void sintonizarSenal() { /* ... */ }
    private void ajustarAntena() { /* ... */ }
}
