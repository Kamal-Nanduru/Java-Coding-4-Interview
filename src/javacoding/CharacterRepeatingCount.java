package javacoding;

import java.util.Scanner;

public class CharacterRepeatingCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char character = scanner.next().charAt(0);

        int count = countRepeatingCharacter(input, character);
        System.out.println("Count of '" + character + "' in the string: " + count);

        scanner.close();
    }

    public static int countRepeatingCharacter(String input, char character) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
