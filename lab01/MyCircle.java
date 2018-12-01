public class MyCircle {
    public static void main (String args[]) {
  		
  		final double PI = 3.1415926;
  		double rad = Double.parseDouble(args[0]);
  		double circ = 2 * rad * PI;
  		double area = 4 * Math.pow(rad, 2) * PI;  

  		System.out.print("The radius of a circle is "+rad);
  		System.out.println(" cm.");
  		System.out.print("The circumference is "+circ);
  		System.out.println(" cm.");
  		System.out.print("And its area is "+area);
  		System.out.println(" cm\u00B2.");

  }
}