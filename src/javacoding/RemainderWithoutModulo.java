package javacoding;

import java.util.Scanner;

public class RemainderWithoutModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the divisor p: ");
        int p = scanner.nextInt();
        
        System.out.print("Enter the divisor q: ");
        int q = scanner.nextInt();
        
        int quotientP = number / p;
        int remainderP = number - (quotientP * p);
        
        int quotientQ = number / q;
        int remainderQ = number - (quotientQ * q);
        
        System.out.println("Remainder when divided by p: " + remainderP);
        System.out.println("Remainder when divided by q: " + remainderQ);
        
        scanner.close();
    }
}
