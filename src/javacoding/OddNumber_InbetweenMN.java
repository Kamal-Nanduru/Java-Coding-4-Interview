package javacoding;

import java.util.Scanner;

public class OddNumber_InbetweenMN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();
        
        int count = 0;
        
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.println(i);
            }
        }
        
        System.out.println("Total number of odd numbers between " + m + " and " + n + ": " + count);
        
        scanner.close();
    }
}
