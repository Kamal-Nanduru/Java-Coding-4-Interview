package javacoding;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number should be non-negative.");
        }

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
