package javacoding;

import java.util.Scanner;

public class ReverseWordsInSentence {
	
public static void reverseawordinjs(String s)
{
	String[] s1=s.split("\\s");
	
	String revesreaword="";
	
	for(int i=s1.length-1;i>=0;i--)
	{
		revesreaword =revesreaword+s1[i]+" ";
	}
	 System.out.println(revesreaword);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string :");
	String s=sc.nextLine();
	reverseawordinjs(s);
}
}