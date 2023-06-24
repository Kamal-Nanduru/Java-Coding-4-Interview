package javacoding;

import java.util.Scanner;

public class Checking_Value_In_Range {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int S = Sc.nextInt();
        if (S >= 1 && S <= 50) {
            System.out.println("True Value Exists");
        } else {
            System.out.println("No, it won't exist");
        }
        
        Sc.close(); // Closing the Scanner object
    }
}
