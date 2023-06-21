package javacoding;

import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Vowels in the string:");
        findAndPrintVowels(input);

        scanner.close();
    }

    public static void findAndPrintVowels(String input) {
        input = input.toLowerCase(); // Convert input to lowercase for case-insensitive comparison

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
