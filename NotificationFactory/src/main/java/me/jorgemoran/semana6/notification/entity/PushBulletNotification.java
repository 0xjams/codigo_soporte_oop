package me.jorgemoran.semana6.notification.entity;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PushBulletNotification implements Notification {
    private final String url;
    private final String accessToken;
    private final String deviceId;

    public PushBulletNotification(String url, String accessToken, String deviceId) {
        this.url = url;
        this.accessToken = accessToken;
        this.deviceId = deviceId;
    }

    @Override
    public void sendMessage(String message) {
        // Aquí se prepara la URL para enviar el mensaje usando HTTP
        String requestUrl = String.format("%s/pushes", url);
        // Imprime en consola que se está enviando un mensaje PushBullet
        System.out.println("Enviando mensaje PushBullet: " + message);
        String title = "Notificación en clase";
        try {
            // URL para la API de Pushbullet
            String pushbulletUrl = "https://api.pushbullet.com/v2/pushes";

            // Establece una conexión HTTP
            URL url = new URL(pushbulletUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Establece el método de solicitud a POST
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Access-Token", accessToken);
            conn.setRequestProperty("Content-Type", "application/json");

            // Habilita el flujo de salida para datos POST
            conn.setDoOutput(true);

            // Crea el payload JSON para la notificación
            String jsonPayload = String.format(
                    "{\"type\": \"note\", \"title\": \"%s\", \"body\": \"%s\"}",
                    title, message
            );

            // Envía el payload JSON
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonPayload.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Verifica el código de respuesta
            int responseCode = conn.getResponseCode();
            System.out.println("Código de Respuesta : " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { // éxito
                System.out.println("Notificación enviada con éxito!");
            } else {
                System.out.println("Fallo al enviar la notificación");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
