package me.jorgemoran.semana7.observer;

class WeatherObserver implements Observer {
    private String observerName;

    public WeatherObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String message) {
        System.out.println(observerName + " ha recibido el siguiente mensaje del clima: " + message);
    }
}
