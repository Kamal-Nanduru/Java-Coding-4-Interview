package javacoding;

import java.util.Scanner;

public class SwapingUsingThirdVraiable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first variable: ");
        int firstVariable = scanner.nextInt();

        System.out.print("Enter the second variable: ");
        int secondVariable = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);

        // Swapping variables using a third variable
        int temp = firstVariable;
        firstVariable = secondVariable;
        secondVariable = temp;

        System.out.println("After swapping:");
        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);

        scanner.close();
    }
}

