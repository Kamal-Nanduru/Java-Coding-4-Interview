package javacoding;

import java.util.Scanner;

public class IdentifyingUpperOrLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);

        if (Character.isUpperCase(alphabet)) {
            System.out.println("The alphabet is uppercase.");
        } else if (Character.isLowerCase(alphabet)) {
            System.out.println("The alphabet is lowercase.");
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet.");
        }

        scanner.close();
    }
}
