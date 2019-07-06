/*
 * A short program that creates an array of integers 
 * DONEto store the following list of integers (17, 89, 27, 11, 91, 42, 73, 90, 5, 56). 
 * Use one or more loops to identify the 
 * DONEminimum, 
 * DONEmaximum, 
 * DONErange, 
 * DONEmean and 
 * standard deviation 
 * of this population of numbers and output these values. 
 * 
 * Not sure if standard deviation is working. Needs checking.
 */


public class Arrays {
	static int[] z = {17, 89, 27, 11, 91, 42, 73, 90, 5, 56};
	static int bigZ = Integer.MIN_VALUE;
	static int littleZ = Integer.MAX_VALUE;
	static int range;
	static int mean;
	static int standardDeviation;
	
	public static void main(String[] args) {
		System.out.println("The minimum value is " + giveMinValue() + ".");
		System.out.println("The Maximum value is " + giveMaxValue() + ".");
		System.out.println("The range is " + giveRange() + ".");
		System.out.println("The mean is " + giveMean(z) + ".");
		System.out.println("The Standard Deviation is " + giveStandardDeviation() + ".");
	}

	private static int giveStandardDeviation() {
		/*
		 * 1. Work out the Mean
		 * 2. Then for each number: subtract the Mean and square the result !!Convert negs to pos
		 * 3. Then work out the mean of those squared differences.
         * 4. Take the square root of that and we are done!
		 */
		int[] holdingBay = new int[10];
		for (int i = 0; i < z.length; ++i) {
			int currentZ = z[i];
			holdingBay[i] = (int) currentZ - mean;
			if (holdingBay[i] < 0) {
				holdingBay[i] = holdingBay[i] * -1;
			}
			holdingBay[i] = (int) Math.sqrt(holdingBay[i]);
			System.out.println("In the holding bay are the numbers " + holdingBay[i]);
		}
		standardDeviation = (int) Math.sqrt(giveMean(holdingBay));
		return standardDeviation;
	}

	private static int giveMean(int[] integer) {
		int runningTotal = 0;
		for (int i = 0; i < integer.length; ++i) {
			int currentZ = integer[i];
			runningTotal = runningTotal + currentZ;
			//System.out.println(runningTotal);
		}
		mean = runningTotal / z.length;
		return mean;
		// TODO Auto-generated method stub
		
	}

	private static int giveRange() {
	 giveMaxValue();
	 giveMinValue();
	 int range = bigZ - littleZ;
		return range;
	}

	private static int giveMaxValue() {
		for (int i = 0; i < z.length; ++i) {
			if (z[i] > bigZ) {
				bigZ = z[i];
			} 
		}
		return bigZ;
	}

	private static int giveMinValue() {
		for (int i = 0; i < z.length; ++i) {
			if (z[i] < littleZ) {
				littleZ = z[i];
			}
		}
		return littleZ;		
	}
	
	
}
