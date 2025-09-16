package com.jensprog.data;

import io.github.cdimascio.dotenv.Dotenv;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

/*
 * This class is fetching up-to-date exchange rates from an external API.
 * If the API is unreachable or the amount of requests exceeds the limit,
 * it falls back to the latest exchange rates.
 */
public class ExchangeRateProvider {
  private static final String API_URL = "https://api.exchangerate.host/latest";
  private HttpClient httpClient;

  public ExchangeRateProvider() {
    this.httpClient = HttpClient.newHttpClient();
  }

  public String fetchLatestRates() throws IOException {
    try {
      Dotenv dotenv = Dotenv.load();
      String apiKey = dotenv.get("API_KEY");
      String urlWithKey = API_URL + "?access_key=" + apiKey;

      HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlWithKey)).build();

      return httpClient.send(request, java.net.http.HttpResponse.BodyHandlers.ofString()).body();
    } catch (Exception e) {
      throw new IOException("Failed to fetch exchange rates", e);
    }
  }
}
