package javacoding;

import java.util.Scanner;

public class VowelOrConstant_By_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
                break;
        }
        
        scanner.close();
    }
}
