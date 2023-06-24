package javacoding;

import java.util.Scanner;

public class CountEvenOddNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();
        
        int countEven = 0;
        int countOdd = 0;
        
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        
        System.out.println("Count of even numbers between " + m + " and " + n + ": " + countEven);
        System.out.println("Count of odd numbers between " + m + " and " + n + ": " + countOdd);
        
        scanner.close();
    }
}
