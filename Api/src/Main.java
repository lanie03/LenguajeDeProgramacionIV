import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Main {
    public static void main(String[] args) {
        try {
            // Crear el cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Crear la solicitud GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://osdr.nasa.gov/osdr/data/osd/files/87"))
                            .build();

            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Imprimir el cogido de respuesta y cuerpo de la respuesta
            System.out.println("Responde Code: " + response.statusCode());
            System.out.println("Responde Body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}