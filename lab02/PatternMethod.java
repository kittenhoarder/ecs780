public class PatternMethod{
	public static void printPattern (int n){
		//write your code here (taken from your solution of Ex. 3)
        for (int i = 1; i <= n; i++) {
		            for (int k = 1; k <= i; k++) {
		                System.out.print(k);
		            }
		            System.out.println();
        }
    }
	public static void main (String[] args){
		int n = Integer.parseInt(args[0]);
		PatternMethod.printPattern(n);
	}
}