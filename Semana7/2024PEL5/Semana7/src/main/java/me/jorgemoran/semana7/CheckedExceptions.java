package me.jorgemoran.semana7;

import java.io.*;

public class CheckedExceptions {
    // Delegando la responsabilidad de lidiar con la excepcion hacia el caller
    public void readFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("Archivo no encontrado: " + path);
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine(); // Puede lanzar IOException

        if (line == null) {
            throw new IOException("El archivo está vacío");
        }
    }

    public void readFile2(String path) {
        File file = new File(path);
        try{
            System.out.println("Intentando leer un archivo");
            if (!file.exists()) {
                throw new FileNotFoundException("Archivo no encontrado: " + path);
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine(); // Puede lanzar IOException

            if (line == null) {
                throw new IOException("El archivo está vacío");
            }else {
                System.out.println(line);
            }
        }catch(IOException e){
            System.err.println("Dentro de IOException");
            e.printStackTrace();
        }catch(Exception e){
            System.err.println("Dentro de Exception");
            e.printStackTrace();
        }finally{
            System.err.println("Haciendo labores de limpieza");
        }

    }

    public static void main(String[] args) throws IOException{
        //CheckedExceptions.readFile("archivo.txt");
        CheckedExceptions ce=new CheckedExceptions();
        //ce.readFile("archivo.txt");
        ce.readFile2("archivo.txt");
    }
}
