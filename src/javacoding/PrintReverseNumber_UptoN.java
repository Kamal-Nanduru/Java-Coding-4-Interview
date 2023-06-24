package javacoding;

import java.util.Scanner;

public class PrintReverseNumber_UptoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        System.out.println("Numbers from " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
