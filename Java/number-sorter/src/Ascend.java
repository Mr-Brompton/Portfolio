public class Ascend {
	public static void sort(int firstNumber, int secondNumber) {
		//declare variables
		int smallNumber = 0;
		int bigNumber = 0;
		boolean finished = false;
		//Sort Numbers
		if(firstNumber > secondNumber) {
			bigNumber = firstNumber;
			smallNumber = secondNumber;
		}
		else if (firstNumber < secondNumber){
			bigNumber = secondNumber;
			smallNumber = firstNumber;
		}
		else {
			System.out.println("Both numbers are " + bigNumber);
			finished = true;
		}
		
		//display Numbers
		if (!finished) {
			System.out.println(smallNumber + " " + bigNumber);
			finished = true;
		}
	}
}