package javacoding;

import java.util.Scanner;
 class FizzBuzz{
	 public static void main (String args []) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int n=sc.nextInt();
		 System.out.println("The Fizz, Buzz and Fizz Buzz num are : ");
		 for(int i=1; i<=n; i++) {
			 if(i%3 == 0 && i%5 ==0) {
				 System.out.println("Fizz Buzz");
			 }
			 else if(i%3 == 0){
				 System.out.println("Fizz");
			 }
			 else if(i%5 == 0) {
				 System.out.println("Buzz");
			 }
			 else {
				 System.out.println(i);
			 }
			 System.out.println(""+"");
		 }
		 sc.close();
	 }
 }

