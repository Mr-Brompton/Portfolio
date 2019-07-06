/*To Do:
 * Finished to spec. Further features could be added.
 * Allow user input as string
 * Allow user to choose a format for measurement (cm, m, mm, km etc)
 * Add further shapes, octogon, hexagon, pentagon etc)
 * 
 * 
 * 
 * 
 */

import java.util.Scanner; //import scanner utility

public class FindAreaUI { //initiate class
	public static void main(String args[]) { //initiate method
		System.out.println("What is your shape?"); //ui which shape?
		Scanner in = new Scanner(System.in); //ui open input stream
		String shape = in.nextLine().toLowerCase(); //save ui to var
		if(shape.equals("circle") || shape.equals("c")) { //begin if else method for FindArea (circle)
			System.out.println("Circle eh? well... hang aROUND for the answer!"); //Just a pun
			System.out.println("Now I need your vitals... what is the circle's radius?"); //ui radius input
			double userRadius = Double.parseDouble(in.nextLine()); //parse input to double
			FindArea.circle(userRadius); //perform calc
		}
		else if (shape.equals("square") || shape.equals("s")|| shape.equals("rectangle") || shape.equals("r") || shape.equals("q") || shape.equals("quad") || shape.equals("quadrilateral")){//init quad area finder
			System.out.println("OOh, a quadrilateral... you're a proper square!");//just a pun
			System.out.println("So, what is the length of this four-sided wonder?");//ui length input
			double userLength = Double.parseDouble(in.nextLine());//parse userlength to double
			System.out.println("And it's height? I know, a square is the same on all sides, but measure twice and all that jazz...)");//ui width input
			double userHeight = Double.parseDouble(in.nextLine()); //parse height input to double
			FindArea.quad(userLength, userHeight);//run quad area finder
		}
		else if (shape.equals("triangle") || shape.equals("t")){//init triangle area finder
			System.out.println("Triangle hmmm... That's Acute choice!");//just a pun
			System.out.println("How long is your bottom? (base / length or width  at longest point)");//ui base
			double userBase = Double.parseDouble(in.nextLine());//parse and save to var user base
			System.out.println("Next I'll need a height...");//ui height
			double userHeight = Double.parseDouble(in.nextLine());//parse and var height
			FindArea.triangle(userBase, userHeight);//run triangle area finder
		}
		else {
			System.out.println("Are you sure that is a shape? I only work with triangles, circles and squares. Make sure you spell the shape correctly or you could just type the first letter.");//default if input not recognised.
		}
		in.close();
	}
}
