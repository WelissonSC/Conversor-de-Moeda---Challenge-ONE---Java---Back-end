package br.com.ws.model;

import java.util.Map;

public record Coin(String result, String base_code, String time_last_update_utc, Map<String, Double> conversion_rates ) {
}
