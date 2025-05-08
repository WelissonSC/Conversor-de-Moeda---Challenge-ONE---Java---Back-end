package br.com.ws.logs;

import java.util.List;

public class LogService {
    private Historical historical = new Historical();

    public void register(String coinBase, String coinTarget, Double amount, Double conversion) {
        historical.addLog(new Logs(coinBase, coinTarget, amount, conversion, null));
        historical.salveInJson("logs.json");
    }

}
