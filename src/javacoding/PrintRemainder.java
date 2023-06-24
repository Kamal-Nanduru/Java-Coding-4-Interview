package javacoding;

import java.util.Scanner;

public class PrintRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of p: ");
        int p = scanner.nextInt();
        
        System.out.print("Enter the value of q: ");
        int q = scanner.nextInt();
        
        int remainder = p % q;
        
        System.out.println("The remainder of " + p + " divided by " + q + " is: " + remainder);
        
        scanner.close();
    }
}

