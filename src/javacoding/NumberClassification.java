package javacoding;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String classification = classifyNumber(number);
        System.out.println("Classification: " + classification);

        scanner.close();
    }

    public static String classifyNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}
