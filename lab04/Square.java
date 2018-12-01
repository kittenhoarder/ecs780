/** 
* @author Owen Perry 
* @version 1.0
*/
public class Square {
	
	public int sideLength;
	// This method returns the area of a given square.
	public int area() {
		return (sideLength * sideLength);
	}
	public static void main (String args[]) {
		Square square1 = new Square();
		square1.sideLength = 10;

		Square square2 = new Square();
		square2.sideLength = 35;

		System.out.println(square1.area());
		System.out.println(square2.area());
	}
}