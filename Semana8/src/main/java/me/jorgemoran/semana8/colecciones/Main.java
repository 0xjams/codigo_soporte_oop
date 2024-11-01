package me.jorgemoran.semana8.colecciones;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main (String[] args){
        /*ArrayList arreglo = new ArrayList();
        arreglo.add("Hola");
        arreglo.add(Integer.valueOf(5));
        arreglo.add("Adios");
        for(Object o: arreglo){
            System.out.println(o);
        }*/
        ArrayList<Object> arreglo = new ArrayList<>();
        arreglo.add("Hola");
        arreglo.add(Integer.valueOf(1));
        arreglo.add("Adios");
        for(Object o: arreglo){
            System.out.println(o);
        }
        HashMap<String,String> hm=new HashMap<>();
        hm.put("nombre","Jorge");
        hm.put("apellido","Moran");
        System.out.println(hm.get("nombre") + " " + hm.get("apellido"));
    }
}
