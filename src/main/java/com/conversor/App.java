package com.conversor;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorService conversor = new ConversorService();

        List<Moeda> moedas = List.of(
                new Moeda("USD", "Dólar Americano"),
                new Moeda("BRL", "Real Brasileiro"),
                new Moeda("EUR", "Euro"),
                new Moeda("GBP", "Libra Esterlina"),
                new Moeda("ARS", "Peso Argentino"),
                new Moeda("JPY", "Iene Japonês")
        );

        while (true) {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1. USD → BRL");
            System.out.println("2. BRL → USD");
            System.out.println("3. EUR → USD");
            System.out.println("4. USD → EUR");
            System.out.println("5. GBP → BRL");
            System.out.println("6. BRL → ARS");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) break;

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            String from = "", to = "";
            switch (opcao) {
                case 1 -> { from = "USD"; to = "BRL"; }
                case 2 -> { from = "BRL"; to = "USD"; }
                case 3 -> { from = "EUR"; to = "USD"; }
                case 4 -> { from = "USD"; to = "EUR"; }
                case 5 -> { from = "GBP"; to = "BRL"; }
                case 6 -> { from = "BRL"; to = "ARS"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            try {
                double convertido = conversor.converter(from, to, valor);
                System.out.printf("%.2f %s = %.2f %s%n", valor, from, convertido, to);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
