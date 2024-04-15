package edu.ucaldas.poo.gradebook;

public class calculoInteres {
    public static void main(String[] args) {
        double amount = 1000;
        double interest = 0.05;
        double total1 = 0;
        double total2 = 0;

        for (int years = 1; years<=10; years++){
            total1 = 1+interest;
            total2 = amount*total1;
            amount = total2;
        }

        System.out.println(amount);
    }
}
