package br.com.ws.logs;

import java.time.LocalDateTime;

public record Logs(String coinBase, String coinTarget, Double amount, Double conversion, LocalDateTime dateHour) {
}
