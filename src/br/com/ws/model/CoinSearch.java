package br.com.ws.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinSearch {
    private String coin;


    public Coin searchCoin(String coin) {
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/57aeb2d98c464ee58213f20c/latest/" + coin);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try {
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Coin.class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException("Sorry! We had a problem to connect with the server");
        }

    }
}
