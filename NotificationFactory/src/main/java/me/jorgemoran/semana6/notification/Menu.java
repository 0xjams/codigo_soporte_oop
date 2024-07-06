package me.jorgemoran.semana6.notification;

import java.util.Scanner;
import me.jorgemoran.semana6.notification.entity.Notification;
import me.jorgemoran.semana6.notification.entity.NotificationFactory;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Enviar mensaje en Pushbullet");
            System.out.println("2. Enviar mensaje en Telegram");
            System.out.println("3. Salir");
            int opcion = solicitarOpcion();
            switch (opcion) {
                case 1:
                    enviarMensajePushbullet();
                    break;
                case 2:
                    enviarMensajeTelegram();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
            }
        }
    }

    private int solicitarOpcion() {
        int opcion;
        while (true) {
            System.out.print("Ingrese una opción (1, 2, o 3): ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();  // Clear the newline character left in the buffer
                if (opcion >= 1 && opcion <= 3) {
                    return opcion;
                }
            } else {
                scanner.next(); // Limpiar buffer de entrada
                scanner.nextLine();  // Clear the newline character if not an int
            }
            System.out.println("Opción inválida, intente de nuevo.");
        }
    }

    private void enviarMensajePushbullet() {
        System.out.print("Ingrese el mensaje para enviar por Pushbullet: ");
        String mensaje = scanner.nextLine();  // Now this should work correctly
        Notification pushBulletNotification = NotificationFactory.createNotification("pushbullet", null);
        pushBulletNotification.sendMessage(mensaje);
    }

    private void enviarMensajeTelegram() {
        System.out.print("Ingrese el ID del chat de Telegram: ");
        String chatId = scanner.nextLine();
        System.out.print("Ingrese el mensaje para enviar por Telegram: ");
        String mensaje = scanner.nextLine();
        Notification telegramNotification = NotificationFactory.createNotification("telegram", chatId);
        telegramNotification.sendMessage(mensaje);
    }


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}

