package dev.jorge;

import java.util.Scanner;

public class AppArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong Number: ");
        int number = scanner.nextInt();

        ArmstrongNumber armstrongNumber = new ArmstrongNumber();

        boolean result = armstrongNumber.isArmstrong(number);

        System.out.println("Is " + number + " an Armstrong number? " + result);

        scanner.close();
    }
}