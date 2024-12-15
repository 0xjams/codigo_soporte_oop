package me.jorgemoran.semana7;

public class VariousTasks {
    public static double divide(int a, int b) {
        // ArithmeticException si b es 0
        return a / b;
    }

    public static String processText(String text) {
        // NullPointerException si text es null
        return text.toUpperCase();
    }

    public static int getElement(int[] array, int index) {
        // ArrayIndexOutOfBoundsException si index >= array.length
        return array[index];
    }

    public static void main(String[] args){
        try {
            System.out.println(VariousTasks.divide(9, 3));
            System.out.println(VariousTasks.divide(0, 9));
            System.out.println(VariousTasks.divide(9, 0));
        }catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(VariousTasks.processText("hola"));
            System.out.println(VariousTasks.processText(null));
        }catch(NullPointerException e){
            System.err.println(e.getMessage());
        }
        try {
            int[] numeros = new int[5];
            numeros[0] = 5;
            System.out.println(VariousTasks.getElement(numeros, 20));
        }catch(Exception e){
            System.err.println("Manejando excepcion del arreglo");
            e.printStackTrace();
        }
    }

}
