package me.jorgemoran.semana8;

import me.jorgemoran.semana8.excepciones.IncorrectDayException;
import me.jorgemoran.semana8.excepciones.IncorrectMonthException;

public class Main {
    public static void printDayOfTheWeek(String d) throws IncorrectDayException {
        switch(d){
            case "monday":
                System.out.println("Lunes");
                break;
            /*Los demas dias*/
            case "sunday":
                System.out.println("Domingo");
                break;
            default:
                throw new IncorrectDayException("El dia enviado no existe");
        }
    }

    public static void printMonth(String m){
        switch(m){
            case "january":
                System.out.println("Enero");
                break;
            /*Los demas dias*/
            case "december":
                System.out.println("Diciembre");
                break;
            default:
                throw new IncorrectMonthException("El mes enviado no existe");
        }
    }
    public static void main(String[] args) {
        try {
            Main.printDayOfTheWeek("asdfasdf");
            Main.printMonth("asdfasdf");
        }catch(IncorrectDayException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
        }catch(IncorrectMonthException e2){
            System.err.println("Controlando excepcion de printMonth especifico");
        }catch(Exception e3){

        }finally{
            System.out.println("Esto ocurrira siempre");
        }


    }

}
