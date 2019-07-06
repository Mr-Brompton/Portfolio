
public class Fibonacci {
	static int startFib = 1;
	static int currentFib = 1;
	static int nextFib = 1;
	static int[] fibSeries = new int[20];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a short program to work out the first twenty numbers in the Fibonacci series and store them in an array.
		
		
		
		for (int i = 0; i < 20; ++i) {
			
			fibSeries[i] = currentFib + nextFib;
			nextFib = fibSeries[i];
			System.out.println(fibSeries[i]);
		
		}
	}

}
