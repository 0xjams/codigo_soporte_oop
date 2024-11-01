package me.jorgemoran.semana7.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Crear observadores
        WeatherObserver observer1 = new WeatherObserver("Observer 1");
        WeatherObserver observer2 = new WeatherObserver("Observer 2");

        // Agregar observadores a la estación meteorológica
        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);

        // Cambiar el estado del tiempo y notificar a los observadores
        weatherStation.setWeatherMessage("Hoy será un día soleado.");

        // Remover un observador (observer2)
        weatherStation.removeObserver(observer2);

        // Cambiar el estado del tiempo nuevamente
        weatherStation.setWeatherMessage("Se esperan lluvias mañana.");
    }
}
