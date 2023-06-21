package javacoding;

import java.util.Scanner;

public class EvenNumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Even numbers between " + start + " and " + end + ":");
        printEvenNumbers(start, end);

        scanner.close();
    }

    public static void printEvenNumbers(int start, int end) {
        if (start % 2 != 0) {
            start++; // Increment start if it is an odd number to make it even
        }

        for (int i = start; i <= end; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
