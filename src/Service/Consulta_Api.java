package Service;

import javax.swing.plaf.PanelUI;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta_Api {
    private static final String API_KEY = "f476602002fc59c6d68d5c60";

    public String obtenerDatos(){
        String direccion = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );
            return response.body();
        }catch (Exception e){
            System.out.println("Error al consultar la API");
            return null;
        }
    }
}
