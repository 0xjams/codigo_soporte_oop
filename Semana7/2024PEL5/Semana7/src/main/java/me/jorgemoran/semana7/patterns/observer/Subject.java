package me.jorgemoran.semana7.patterns.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String news);
}
