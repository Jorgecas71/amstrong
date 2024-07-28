package dev.jorge;

public class ArmstrongNumber {

    public boolean isArmstrong(int number) {
        int storedNumber = number; // importante tener un numero guardadico para hacer la comparacion
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // obtengo el ultimo digito
            int powerDigit = (int) Math.pow(digit, numberOfDigits); // lo elevo
            sum += powerDigit;

            number /= 10; // ahora al numero se le quita el ultimo digito
            // vuelve a empezar el bucle hasta que sea 0 :)
        }
        if (storedNumber == sum) {
            return true;
        } else {
            return false;
        }
    }
}