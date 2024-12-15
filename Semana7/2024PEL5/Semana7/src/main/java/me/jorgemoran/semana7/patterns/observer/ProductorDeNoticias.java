package me.jorgemoran.semana7.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductorDeNoticias implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for(Observer observer : observers) {
            observer.update(news);
        }
    }
    public static void main(String[] args){
        ProductorDeNoticias elUniverso=new ProductorDeNoticias();
        Lector l = new Lector("Jorge Moran");
        Lector l2 = new Lector("Javier Sanchez");
        Lector l3 = new Lector("Jazmin Diaz");
        elUniverso.attach(l);
        elUniverso.attach(l2);
        elUniverso.attach(l3);
        elUniverso.notifyObservers("Maniana son las fiestas de Quito");
        elUniverso.detach(l);
        elUniverso.notifyObservers("La proxima semana los cortes duran menos tiempo");
    }
}
