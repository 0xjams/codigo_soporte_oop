package me.jorgemoran.semana6.notification.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TelegramNotification implements Notification {
    private final String url;
    private final String token;
    private final String chatId;

    public TelegramNotification(String url, String token, String chatId) {
        this.url = url;
        this.token = token;
        this.chatId = chatId;
    }

    @Override
    public void sendMessage(String message) {
        // Preparar la URL de la solicitud
        String requestUrl = String.format("%s/bot%s/sendMessage?chat_id=%s&text=%s", url, token, chatId, message);

        try {
            // Crear un objeto URL desde la URL de la solicitud
            URL url = new URL(requestUrl);
            // Abrir una conexión
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Establecer el método de la solicitud a GET, ya que estamos enviando datos a través de la URL
            connection.setRequestMethod("GET");

            // Establecer un User-Agent y otros encabezados opcionales si es necesario
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Obtener el código de respuesta para determinar si la solicitud fue exitosa
            int responseCode = connection.getResponseCode();
            System.out.println("Código de Respuesta: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { // éxito
                // Leer la respuesta
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Imprimir la respuesta de Telegram
                System.out.println("Respuesta de Telegram: " + response.toString());
            } else {
                System.out.println("Fallo al enviar el mensaje");
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error al enviar el mensaje a Telegram.");
        }
    }

}
