package me.jorgemoran.semana2;
import java.util.ArrayList;

public class MainArreglosColecciones {
public static void main(String args[]){
    String cadenas[]=new String[5];
    int numeros[]=new int[5];
    numeros[0]=25;
    cadenas[0]="Hola";
    /*System.out.println(numeros[0]);
    System.out.println(numeros[1]);
    System.out.println(cadenas[0]);
    System.out.println(cadenas[1]);*/
    ArrayList<String> coleccionCadenas=new ArrayList<String>();
    coleccionCadenas.add("palabra1");
    coleccionCadenas.add("palabra2");
    System.out.println(coleccionCadenas);
    System.out.println(coleccionCadenas.get(1));
    System.out.println(coleccionCadenas.contains("palabra3"));
    System.out.println(coleccionCadenas.contains("palabra2"));
    ArrayList<Integer> coleccionEnteros=new ArrayList<Integer>();
    coleccionEnteros.add(25);
    System.out.println(coleccionEnteros);
    int sumando1=coleccionEnteros.get(0)+1;
    System.out.println(sumando1);
}
}
