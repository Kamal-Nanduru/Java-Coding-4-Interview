package javacoding;

import java.util.Scanner;

public class EvenNumber_InbetweenMN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Even numbers between " + m + " and " + n + ":");
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }
        
        System.out.println("Total even numbers: " + count);
        
        scanner.close();
    }
}
