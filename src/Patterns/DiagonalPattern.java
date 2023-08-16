package Patterns;

import java.util.Scanner;
public class DiagonalPattern {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the row number :" + "");
	int row=Sc.nextInt();
	System.out.println("Enter the column Number : " + "");
	int col = Sc.nextInt();
	for(int i=1; i<=row; i++) {
		for(int j=i; j<=col; j++) {
			if(i==j) {
				System.out.print("@"+" ");
			}
			else {
				System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
}
