package me.jorgemoran.semana4.generics;

public class MainArrayUtil {
    public static void main(String[] args){
        Integer []numeros=new Integer[5];
        numeros[0]=5;
        numeros[1]=20;
        for(Integer i:numeros){
            System.out.println(i);
        }
        ArrayUtil.switchElements(numeros,0,1);
        for(Integer i:numeros){
            System.out.println(i);
        }

    }
}
