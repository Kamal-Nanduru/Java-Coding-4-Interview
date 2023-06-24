package javacoding;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int temp = number;
        
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }
        
        System.out.println("Number of digits in " + number + ": " + count);
        
        scanner.close();
    }
}
