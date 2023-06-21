package javacoding;

import java.util.Scanner;

public class NumberSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swapNumbers(a, b);
        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }

    public static void swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}

