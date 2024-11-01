package me.jorgemoran.semana7.observer;
import java.util.ArrayList;
import java.util.List;

class WeatherStation implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String weatherMessage;

    public void setWeatherMessage(String weatherMessage) {
        this.weatherMessage = weatherMessage;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherMessage);
        }
    }
}
