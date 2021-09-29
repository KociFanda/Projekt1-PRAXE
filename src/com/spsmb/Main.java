package com.spsmb;



public class Main {
    public static void main(String[] args) {

        StringBuilder products = new StringBuilder();
        System.out.println("Co si muzes koupit:");
        System.out.println("1-Rohlik 20kc");
        System.out.println("2-Chleba 50kc");
        System.out.println("3-Vejce 70kc");
        System.out.println("4-Mleko 45kc");
        System.out.println("5-Máslo 20kc");
        System.out.println("6-Krosiant 15kc");
        System.out.println("7-Limonáda 35kc");
        System.out.println("8-Salám 25kc");
        System.out.println("9-Salám XXL 45kc");

        double balance = 0;

        for (String arg : args) {

            switch (arg) {
                case "1":
                    balance += 20;
                    products = new StringBuilder("Rohlik");
                    break;
                case "2":
                    balance += 50;
                    products = new StringBuilder("chleba");
                    break;
                case "3":
                    balance += 70;
                    products = new StringBuilder("Vejce");
                    break;
                case "4":
                    balance += 45;
                    products.append("Mleko");
                    break;
                case "5":
                    balance += 20;
                    products.append("Maslo");
                    break;
                case "6":
                    balance += 15;
                    products.append("Krosiant");
                    break;
                case "7":
                    balance += 35;
                    products.append("limonáda");
                    break;
                case "8":
                    balance += 25;
                    products.append("Salám");
                    break;
                case "9":
                    balance += 45;
                    products.append("Salám XXL");
                    break;
                default:
                    System.out.println("Tento produkt neznám");

            }
        }
        System.out.println("Cena\n: " + balance + " CZK");
        System.out.println("Co jsi si koupil:" + products);
    }
}
