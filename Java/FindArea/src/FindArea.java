
public class FindArea {
	static double area;
	public static void circle(double radius) {
		double rad = radius*radius;
		area = Math.PI*rad;		
		System.out.println( "The circle's area is " + area + ".");
	}
	public static void quad(double length, double height) {
		area = length*height;
		System.out.println( "The quad's area is " + area + ".");
	}
	public static void triangle(double length, double height) {
		area = length*height/2;
		System.out.println( "The triangle's area is " + area + ".");
	}
}
