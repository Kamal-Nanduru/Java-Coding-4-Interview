package AdvancedPrograms;

public class MergingArrays {
 public static void main(String[] args) {
	 int a [] = {5, 2, 7, 1};
	 int b [] = {6, 3, 8, 9};
	 int c [] = new int[a.length+b.length];
	 int temp = 0;
	 for(int i=0; i<c.length; i++) {
		 if(i<a.length) {
			 c[i] = a[i];
		 }
		 else {
			 c[i] = b[temp++];
		 }
		 System.out.print(c[i]+" ");
	 }
 }
}
