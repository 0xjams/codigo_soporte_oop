package me.jorgemoran.semana6.http.ejercicio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;


public class EstadoOrden {

    public static void main(String[] args) throws Exception {
        String url = "https://dev.jorge.moran.com.ec/ejercicio_webhooks.php";
        URL obj = URI.create(url).toURL();
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        /*
        * {
    "orderId": 123,
    "previousStatus": "Pendiente",
    "newStatus": "Enviado"
}
        * */
        String jsonInputString = "{\"orderId\": 5879, \"previousStatus\": \"Creado\",\"newStatus\":\"Finalizado\"}";
        con.setDoOutput(true);
        try (OutputStream os = con.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        int responseCode = con.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_CREATED) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine + "\n");
            }
            in.close();
            System.out.println(response);
        }
        else{
            System.out.println("Hubo un error, codigo de respuesta " +  responseCode);
        }
    }
}
