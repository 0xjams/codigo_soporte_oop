package me.jorgemoran.semana2;

import java.util.ArrayList;
import java.util.HashMap;

/*
* CamelCase => PruebasTiposDeDato
* */
public class Pruebas {
    public static void main (String[] args){
        String pruebaDeCadena = "Pruebas";
        int entero = 10;
        float flotante;
        boolean yesno;
        if(entero>5){
            System.out.println("Entero mayor a 5");
        } else if(entero > 10) {
            System.out.println("Entero mayor a 10");
        } else {System.out.println("Cualquier otro caso");}
        System.out.println(pruebaDeCadena);
        for(int i=0;i<=4;i=i+1){
            System.out.println("Iteraci[on " + i);
        }
        System.out.println("-------- Antes de la j");
        int j=20;
        do{
            System.out.println("Iteraci[on " + j);
            j++;
        }while(j<=4);
        System.out.println("-------- Antes de la k");
        int k=20;
        while(k<=4){
            System.out.println("Iteraci[on " + k);
            k+=1;
        }
        String fecha="20240611";
        while(true){
            if(fecha.equals("20240611")){
                break;
            }
        }
        ArrayList<String> arreglo;
        arreglo = new ArrayList<String>();
        arreglo.add("palabra1");
        arreglo.add("palabra2");
        for(String tmp: arreglo){
            System.out.println(tmp);
            System.out.println(tmp.charAt(2));
            System.out.println(tmp.indexOf("1"));
            System.out.println(tmp.substring(4,6));
        }
        System.out.println(Math.pow(2,2));
        HashMap<String,String> diccionario = new HashMap<String,String>();
        diccionario.put("nombre","Jorge");
        diccionario.put("apellido","Moran");
        System.out.println(diccionario.get("nombre"));
        for(String key: diccionario.keySet()){
            System.out.println(key);
        }

        Integer intWrapper = Integer.parseInt("4");
        int valorEnvuelto = intWrapper.intValue();
        HashMap<String,Integer> diccionario2;
        String pruebaManipulacion="Esto es una cadena";
        char caracter = pruebaManipulacion.charAt(1);
        String nuevaCadena = "" + caracter;
        String mayuscula = nuevaCadena.toUpperCase();
        System.out.println(mayuscula);
    }

}
