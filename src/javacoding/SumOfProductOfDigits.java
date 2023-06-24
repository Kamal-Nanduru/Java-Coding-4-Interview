package javacoding;

import java.util.Scanner;

public class SumOfProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        System.out.println("Sum of digits in " + number + ": " + sum);
        System.out.println("Product of digits in " + number + ": " + product);

        scanner.close();
    }
}
