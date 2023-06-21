package javacoding;

import java.util.Scanner;

public class SmallNumAmongThree_TernaryOperator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        // Collecting input from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Finding the smallest number using the ternary operator
        int smallest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        // Printing the smallest number
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
