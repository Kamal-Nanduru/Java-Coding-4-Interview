package javacoding;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move the left index to the right and the right index to the left
            left++;
            right--;
        }

        return new String(characters);
    }
}

