package javacoding;

import java.util.Scanner;

public class ChcekSumProductEquality {
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

        if (sum == product) {
            System.out.println("Sum and product of digits in " + number + " are equal.");
        } else {
            System.out.println("Sum and product of digits in " + number + " are not equal.");
        }

        scanner.close();
    }
}
