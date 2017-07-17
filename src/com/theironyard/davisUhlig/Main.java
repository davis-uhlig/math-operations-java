package com.theironyard.davisUhlig;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double operand1;
        double operand2;
        double sum;
        double difference;
        double division;
        double multiplication;
        double remainder;

        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);

        operand1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter another number");

        Scanner secondScan = new Scanner(System.in);

        operand2 = Double.parseDouble(secondScan.nextLine());

        sum = operand1 + operand2;


        difference = operand1 - operand2;


        division = operand1 / operand2;


        multiplication = operand1 * operand2;


        remainder = operand1 % operand2;


        showResults(sum, difference, division, multiplication, remainder);

    }

    public static void showResults ( double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The quotient is: " + division);
        System.out.println("The result is: " + multiplication);
        System.out.println("The remainder is: " + remainder);
    }
}
