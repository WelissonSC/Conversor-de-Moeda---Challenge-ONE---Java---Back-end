package br.com.ws.main;

import br.com.ws.calcs.Conversion;
import br.com.ws.logs.Historical;
import br.com.ws.logs.LogService;
import br.com.ws.logs.Logs;


import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversion conversion = new Conversion();
        LogService logService = new LogService();
        Historical historical = new Historical();
        int option = 0;


        while (option != 9) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Welcome to Currency Converter! Type the option you want: ");
            System.out.println("1 - Dolar(USD) to Peso Argentino(ARS)");
            System.out.println("2 - Peso Argentino(ARS) to Dolar(USD)");
            System.out.println("3 - Dolar(USD) to Peso Real(BRL)");
            System.out.println("4 - Real(BRL) to Dolar(USD)");
            System.out.println("5 - Euro(EUR) to Dolar(USD)");
            System.out.println("6 - Dolar(USD) to Euro(EUR)");
            System.out.println("7 - Real(BRL) to Euro(EUR)");
            System.out.println("8 - Euro(EUR) to Real(BRL)");
            System.out.println("9 - Real(BRL) to Iene(JPY)");
            System.out.println("10 - Iene(JPY) to Real(BRL)");
            System.out.println("11 - Show logs");
            System.out.println("12 - Exit");
            System.out.println("--------------------------------------------------------------------------------");

            option = sc.nextInt();
            sc.nextLine();

            if (option > 12 || option < 0) {
                System.out.println("Invalid option! Try again!");
            } else if (option == 1) {
                System.out.println("Type the amount you want to convert USD to ARS: ");
                Double amount = sc.nextDouble();
                double value = conversion.convert(amount, "USD", "ARS");
                System.out.println("The value: " + amount + " [USD] result is: " + value + " [ARS];");

                logService.register("USD", "ARS", amount, value);
                historical.addLog(new Logs("USD", "ARS", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 2) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                double value = conversion.convert(amount, "ARS", "USD");
                System.out.println("The value: " + amount + " [ARS] result is: " + value + " [USD];");

                logService.register("ARS", "USD", amount, value);
                historical.addLog(new Logs("ARS", "USD", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 3) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "USD", "BRL");
                System.out.println("The value: " + amount + " [USD] result is: " + value + " [BRL];");

                logService.register("USD", "BRL", amount, value);
                historical.addLog(new Logs("USD", "BRL", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 4) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "BRL", "USD");
                System.out.println("The value: " + amount + " [BRL] result is: " + value + " [USD];");

                logService.register("BRL", "USD", amount, value);
                historical.addLog(new Logs("BRL", "USD", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 5) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "EUR", "USD");
                System.out.println("The value: " + amount + " [EUR] result is: " + value + " [USD];");

                logService.register("EUR", "USD", amount, value);
                historical.addLog(new Logs("EUR", "USD", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 6) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "USD", "EUR");
                System.out.println("The value: " + amount + " [USD] result is: " + value + " [EUR];");

                logService.register("USD", "EUR", amount, value);
                historical.addLog(new Logs("USD", "EUR", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 7) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "BRL", "EUR");
                System.out.println("The value: " + amount + " [BRL] result is: " + value + " [EUR];");

                logService.register("BRL", "EUR", amount, value);
                historical.addLog(new Logs("BRL", "EUR", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 8) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "EUR", "BRL");
                System.out.println("The value: " + amount + " [EUR] result is: " + value + " [BRL];");

                logService.register("EUR", "BRL", amount, value);
                historical.addLog(new Logs("EUR", "BRL", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 9) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "BRL", "JPY");
                System.out.println("The value: " + amount + " [BRL] result is: " + value + " [JPY];");

                logService.register("BRL", "JPY", amount, value);
                historical.addLog(new Logs("BRL", "JPY", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 10) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "JPY", "BRL");
                System.out.println("The value: " + amount + " [JPY] result is: " + value + " [BRL];");

                logService.register("JPY", "BRL", amount, value);
                historical.addLog(new Logs("JPY", "BRL", amount, value, LocalDateTime.now()));
                historical.salveInJson("logs.json");

            } else if (option == 11) {
                historical.showLogs();
            }

        }
        System.out.println("Thak you for using our service!");
    }

}

