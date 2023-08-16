package AdvancedPrograms;
import java.util.*;

public class PrintFactorOfGivenNumberFromArray {
	
	public static void printFactorOfGivenNumber(int[] arr, int n) {
		for(int i=0; i<arr.length; i++) {
			if(n % arr[i]==0 && arr[i]!=n) {
				System.out.println(arr[i]+"");
			}
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {2, 5, 1, 4, 7, 8, 10, 20, 14};
		System.out.println("Given Array is" + Arrays.toString(arr));
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		printFactorOfGivenNumber(arr, num);
	}

}
