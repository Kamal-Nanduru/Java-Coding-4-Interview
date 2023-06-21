package javacoding;

import java.util.Scanner;

public class RangeSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int sum = calculateRangeSum(start, end);
        System.out.println("Sum of numbers in the range " + start + " to " + end + ": " + sum);

        scanner.close();
    }

    public static int calculateRangeSum(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Starting number should be less than or equal to the ending number.");
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }
}
