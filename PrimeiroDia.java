package br.com.taroco;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrimeiroDia {

	private static final String API_KEY = "sua api key";

	public static void main(String[] args) throws IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://imdb-api.com/API/Top250Movies/" + API_KEY)).GET().build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	
		System.out.println(response.statusCode());
		System.out.println(response.body());

	}

}
