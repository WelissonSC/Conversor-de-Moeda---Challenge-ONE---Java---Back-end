package br.com.ws.main;

import br.com.ws.calcs.Conversion;
import br.com.ws.model.Coin;
import br.com.ws.model.CoinSearch;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversion conversion = new Conversion();
        int option = 0;




        while (option != 5) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Welcome to Currency Converter! Type the option you want: ");
            System.out.println("1 - Dolar(USD) to Peso Argentino(ARS)");
            System.out.println("2 - Peso Argentino(ARS) to Dolar(USD)");
            System.out.println("3 - Dolar(USD) to Peso Real(BRL)");
            System.out.println("4 - Real(BRL) to Dolar(USD)");
            System.out.println("5 - Exit");
            System.out.println("--------------------------------------------------------------------------------");

            option = sc.nextInt();
            sc.nextLine();

            if (option > 5 || option < 0) {
                System.out.println("Invalid option! Try again!");
            } else if (option == 1) {
                System.out.println("Type the amount you want to convert USD to ARS: ");
                Double amount = sc.nextDouble();
                double value = conversion.convert(amount, "USD", "ARS");
                System.out.println("The value: " + amount + " [USD] result is: " + value + " [ARS];");
            } else if (option == 2) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                double value = conversion.convert(amount, "ARS", "USD");
                System.out.println("The value: " + amount + " [ARS] result is: " + value + " [USD];");
            } else if (option == 3) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "USD", "BRL");
                System.out.println("The value: " + amount + " [USD] result is: " + value + " [BRL];");
            } else if (option == 4) {
                System.out.println("Type the amount you want to convert: ");
                Double amount = sc.nextDouble();
                Double value = conversion.convert(amount, "BRL", "USD");
                System.out.println("The value: " + amount + " [BRL] result is: " + value + " [USD];");
            }

        }
        System.out.println("Thak you for using our service!");
    }

}

