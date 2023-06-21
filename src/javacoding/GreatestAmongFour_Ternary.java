package javacoding;

import java.util.Scanner;

public class GreatestAmongFour_Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int greatestNum = (num1 > num2) ? (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3 > num4 ? num3 : num4)) : (num2 > num3 ? (num2 > num4 ? num2 : num4) : (num3 > num4 ? num3 : num4));

        System.out.println("The greatest number is: " + greatestNum);

        input.close();
    }
}
