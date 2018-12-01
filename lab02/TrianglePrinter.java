public class TrianglePrinter {
	public static void trianglePrinterClass (int n){
		int q = 0;
		for (int i = 1; i != n; i++) {

		            for (int k = n - i; k != 0; k--) {

		                System.out.print(" ");
		                q++;
		            }

		            while (q > 0) {
		            	System.out.print("*");
		            	q--;
		            }
		            System.out.println();
        }
    }
	public static void main (String[] args){
		int n = Integer.parseInt(args[0]);
		TrianglePrinter.trianglePrinterClass(n);
	}
}