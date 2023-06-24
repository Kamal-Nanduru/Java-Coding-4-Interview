package javacoding;

import java.util.Scanner;

public class PrintNumbers_Upto_GivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
