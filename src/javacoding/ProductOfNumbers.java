package javacoding;

import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long product = 1;

        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        System.out.println("Product of numbers from 1 to " + n + ": " + product);

        scanner.close();
    }
}
