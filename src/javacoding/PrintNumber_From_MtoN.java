package javacoding;

import java.util.Scanner;

public class PrintNumber_From_MtoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Numbers from " + m + " to " + n + ":");
        if (m <= n) {
            for (int i = m; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = m; i >= n; i--) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
