package me.jorgemoran.semana4.model;

import java.io.*;
import java.util.*;

public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String id;
    private String nombre;
    private List<String> historialCompras;
    private transient String passwordHash;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.historialCompras = new ArrayList<>();
    }

    public void agregarCompra(String compra) {
        historialCompras.add(compra);
    }

    public void guardarEstado(String archivo) {
        try  {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(archivo));
            out.writeObject(this);
        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }
    }

    public static Cliente cargarEstado(String archivo) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(archivo))) {
            return (Cliente) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // Método main de ejemplo
    public static void main(String[] args) {
        // Crear y guardar
       /* Cliente cliente = new Cliente("001", "Juan Pérez");
        cliente.agregarCompra("Laptop - 2024-01-15");
        cliente.agregarCompra("Mouse - 2024-01-20");

        cliente.guardarEstado("cliente001.dat");*/

        // Cargar y verificar
         Cliente clienteCargado = Cliente.cargarEstado("cliente001.dat");
        if (clienteCargado != null) {
            System.out.println("Cliente cargado: " + clienteCargado.nombre);
            System.out.println("Historial de compras:");
            for (String compra : clienteCargado.historialCompras) {
                System.out.println(compra);
            }
        }
    }
}
