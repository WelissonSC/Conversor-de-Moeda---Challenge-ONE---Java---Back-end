package br.com.ws.logs;

import br.com.ws.DateTimeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historical {
    private List<Logs> logs = new ArrayList<>();

    public void addLog(Logs logs) {
        this.logs.add(logs);
    }

    public void showLogs() {
        if (logs.isEmpty()) {
            System.out.println("No logs found!");
            return;
        }

        for (Logs log : logs) {
            System.out.println("Date/hour: " + log.dateHour() + " | Coin base: " + log.coinBase() + " | Coin target: " + log.coinTarget() + " | Amount: " + log.amount() + " | Conversion: " + log.conversion());
        }
    }

    public void salveInJson(String nameArcher) {
        Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDateTime.class, new DateTimeAdapter()).create();
        try (FileWriter writer = new FileWriter(nameArcher)){
            gson.toJson(logs, writer);
            System.out.println("Logs saved in: " + nameArcher);
        } catch (IOException e) {
            System.err.println("Error saving logs in: " + nameArcher );
        }
    }
}
