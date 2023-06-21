package javacoding;

import java.util.Scanner;

public class ArrayMinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maximum = findMaximum(array);
        int minimum = findMinimum(array);

        System.out.println("Maximum value: " + maximum);
        System.out.println("Minimum value: " + minimum);

        scanner.close();
    }

    public static int findMaximum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array should not be empty.");
        }

        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }

        return maximum;
    }

    public static int findMinimum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array should not be empty.");
        }

        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }

        return minimum;
    }
}
