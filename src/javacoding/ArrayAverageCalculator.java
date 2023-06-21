package javacoding;

import java.util.Scanner;

public class ArrayAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        double average = calculateAverage(array);
        System.out.println("Average of the array is: " + average);

        scanner.close();
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array should not be empty.");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}
