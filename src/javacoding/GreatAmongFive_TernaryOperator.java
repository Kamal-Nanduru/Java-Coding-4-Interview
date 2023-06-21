package javacoding;

import java.util.Scanner;

public class GreatAmongFive_TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int greatestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            greatestNumber = (numbers[i] > greatestNumber) ? numbers[i] : greatestNumber;
        }

        System.out.println("The greatest number is: " + greatestNumber);
        
        scanner.close();
    }
}
