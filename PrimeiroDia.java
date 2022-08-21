package br.com.taroco;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrimeiroDia {

	public static void main(String[] args) throws IOException, InterruptedException {

		String apiKey = "api key";
		URI apiIMDB = URI.create("https://imdb-api.com/en/API/Top250TVs/" + apiKey);
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(apiIMDB).GET().build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String json = response.body();
		
		System.out.println(response.statusCode());
		System.out.println(json);

	}

}
