package javacoding;

import java.util.Scanner;

public class PrintEvenNumbers_MN_ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Even numbers from " + m + " to " + n + ":");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
