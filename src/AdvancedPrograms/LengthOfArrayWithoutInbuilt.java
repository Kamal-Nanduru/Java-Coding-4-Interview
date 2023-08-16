package AdvancedPrograms;

import java.util.PrimitiveIterator.OfDouble;

public class LengthOfArrayWithoutInbuilt {
public static void main(String[] args) {
	 int count=0;
	 int array[] = {5, 69, 32, 63};
	 
	 // for loop : 
	 for(int i:array)
	 {
	   count++;
	 }

	 System.out.println("Length Of Array : " + count);
	 
	// Another way
	 int temp;
	    try
	    {
	        while(true)
	        {
	            temp = array[count];
	            count++;
	        }
	    }
	    catch(Exception ex)
	    {
	           System.out.println( "Length Of Array : " + count); 
	    }
}
}
