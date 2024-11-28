package me.jorgemoran.semana4.generics;

public class ArrayUtil {
    public static <T> T switchElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return temp;
    }

}
