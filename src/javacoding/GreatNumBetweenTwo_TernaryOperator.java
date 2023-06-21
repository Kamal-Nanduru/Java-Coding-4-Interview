package javacoding;

import java.util.Scanner;

public class GreatNumBetweenTwo_TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int greaterNum = (num1 > num2) ? num1 : num2;

        System.out.println("The greater number is: " + greaterNum);

        input.close();
    }
}
