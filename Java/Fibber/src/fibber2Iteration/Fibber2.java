package fibber2Iteration;
import static java.lang.System.out;
import java.util.Scanner;

public class Fibber2 {

	public static void main(String[] args) {
		int current = 0;
		int next = 1;
		System.out.println("How many iterations of the fibbonacci sequence?");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		for (int i = 0; i <=num; ++i) {
			
			int temp = current + next;
			current = next;
			next = temp;
			out.println(current);
		}
		keyboard.close();
	}

}
