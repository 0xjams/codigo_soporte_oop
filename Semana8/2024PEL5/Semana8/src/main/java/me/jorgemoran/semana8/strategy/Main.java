package me.jorgemoran.semana8.strategy;

public class Main {
    public static void main(String[] args){
        int [] array= {1,12,23,14,5};
        Sorter sorter = new Sorter();
        sorter.setStrategy(new BubbleSort());
        sorter.sort(array);
        sorter.setStrategy(new QuickSort());
        sorter.sort(array);
        sorter.setStrategy(null);
        sorter.sort(array);
    }
}
