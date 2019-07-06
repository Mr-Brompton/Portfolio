import java.util.Scanner;

public class FindAreaUI {
	public static void main(String args[]) {
		System.out.println("What is your shape?"); //ui which shape?
		Scanner in = new Scanner(System.in); //ui open input stream
		String shape = in.nextLine().toLowerCase(); //save ui to var
		switch(shape) {
		   case "c" :
			   System.out.println("Circle eh? well... hang aROUND for the answer!"); //Just a pun
				System.out.println("Now I need your vitals... what is the circle's radius?"); //ui radius input
				double userRadius = Double.parseDouble(in.nextLine()); //parse input to double
				FindArea.circle(userRadius); //perform calc
		      break; 
		   
		   case "r" :
			   System.out.println("OOh, a rectangle... This won't take long!");//just a pun
				System.out.println("So, what is the length of this four-sided wonder?");//ui length input
				double userLength = Double.parseDouble(in.nextLine());//parse userlength to double
				System.out.println("And it's height? I know, a square is the same on all sides, but measure twice and all that jazz...)");//ui width input
				double userHeight = Double.parseDouble(in.nextLine()); //parse height input to double
				FindArea.quad(userLength, userHeight);//run quad area finder
		      break; 
		   
		   case "s" :
			   System.out.println("OOh, a quadrilateral... you're a proper square!");//just a pun
				System.out.println("So, what is the length of this four-sided wonder?");//ui length input
				double squareLength = Double.parseDouble(in.nextLine());//parse userlength to double
				FindArea.quad(squareLength, squareLength);//run quad area finder
			      break;
		  
		   case "t" :
			   System.out.println("Triangle hmmm... That's Acute choice!");//just a pun
				System.out.println("How long is your bottom? (base / length or width  at longest point)");//ui base
				double userBase = Double.parseDouble(in.nextLine());//parse and save to var user base
				System.out.println("Next I'll need a height...");//ui height
				double triHeight = Double.parseDouble(in.nextLine());//parse and var height
				FindArea.triangle(userBase, triHeight);//run triangle area finder
			      break;      
		   // You can have any number of case statements.
		   default : // Optional
			   System.out.println("Are you sure that is a shape? I only work with triangles, circles and squares. Make sure you spell the shape correctly or you could just type the first letter.");//default if input not recognised.
		}
		in.close();
	}
}
