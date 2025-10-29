package com.conversor;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ExchangeRateApi {

    private static final String API_KEY = "9ae5572cf20d817378d9fa72"; // sua chave
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public Map<String, Double> buscarTaxas(String base) throws Exception {
        String urlStr = API_URL + base;
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Gson gson = new Gson();
        JsonObject json = gson.fromJson(new InputStreamReader(conn.getInputStream()), JsonObject.class);

        if (!json.get("result").getAsString().equals("success")) {
            throw new RuntimeException("Erro na API: " + json);
        }

        JsonObject rates = json.getAsJsonObject("conversion_rates");
        return gson.fromJson(rates, Map.class);
    }
}
