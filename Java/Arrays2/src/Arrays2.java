import java.util.*;
public class Arrays2 {
	static int[] die1 = new int[6];
	static int[] die2 = new int[6];
	static int currentDie1;
	static int currentDie2;
	static ArrayList<Integer> result = new ArrayList<>();
	public static void main(String[] args) {
		/*
		 * Write a short program using nested for loops to calculate all possible results 
		 * from summing the outcomes of two six-sided dice and store each result as elements 
		 * in an array (it should have 36 elements). Use an ArrayList to store the distinct 
		 * possible outcomes.
		 */
		//populate dice arrays
		for (int i = 0; i < 6; ++i) {
	        die1[i] = i + 1;
	        die2[i] = i + 1;
	        //System.out.println(die2[i]);
		}
		
		//for loop to run through die1
		for (int i = 0; i < 6; ++i) {
			for (int x = 0; x < 6; ++x) {
				currentDie1 = die1[i] + die2[x];
				result.add(currentDie1);
			}
		}
			System.out.println(result);

	}
}
