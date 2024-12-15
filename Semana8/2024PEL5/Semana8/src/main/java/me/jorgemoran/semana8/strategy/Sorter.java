package me.jorgemoran.semana8.strategy;

public class Sorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        if(strategy == null) {
            throw new IllegalStateException("Estrategia no definida");
        }
        strategy.sort(array);
    }
}
