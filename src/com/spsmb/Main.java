package com.spsmb;



public class Main {
    public static void main(String[] args) {
        StringBuilder products = new StringBuilder();
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
                default:
                    System.out.println("Co si muzes koupit:");
                    System.out.println("1-Rohlik 20kc");
                    System.out.println("2-Chleba 50kc");
                    System.out.println("3-Vejce 70kc");
                    System.out.println("4-Mleko 45kc");

            }
        }
        System.out.println("Cena\n: " + balance + " CZK");
        System.out.println("Co jsi si koupil:" + products);
    }
}
