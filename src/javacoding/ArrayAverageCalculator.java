package javacoding;

class ArrayAverageCalculator{
	public static void main(String[] args) {
		int[] array = {25, 53, 856, 8641, 562, 20,36};
		int sum = 0 ;
		for(int x:array )
		sum=sum+x;
		int avg=sum/array.length;
		System.out.println(avg);
	}
}