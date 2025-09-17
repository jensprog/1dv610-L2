package com.jensprog.data;

import io.github.cdimascio.dotenv.Dotenv;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
 * This class is fetching up-to-date exchange rates from an external API.
 * If the API is unreachable or the amount of requests exceeds the limit,
 * it falls back to the latest exchange rates.
 */
public class ExchangeRateProvider {
  private final String apiUrl;
  private HttpClient httpClient;

  public ExchangeRateProvider() {
    this("https://api.exchangerate.host/latest");
  }

  public ExchangeRateProvider(String apiUrl) {
    this.apiUrl = apiUrl;
    this.httpClient = HttpClient.newHttpClient();
  }

  public String fetchLatestRates() throws IOException {
    try {
      Dotenv dotenv = Dotenv.load();
      String apiKey = dotenv.get("API_KEY");
      String urlWithKey = apiUrl + "?access_key=" + apiKey;

      HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlWithKey)).build();

      return httpClient.send(request, HttpResponse.BodyHandlers.ofString()).body();
    } catch (Exception e) {
      throw new IOException("Failed to fetch exchange rates", e);
    }
  }
}
