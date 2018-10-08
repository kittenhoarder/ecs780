public class EvenInt {
    public static void main (String args[]) {

      int i = Integer.parseInt(args[0]);

      if ((i % 2) == 0){
          System.out.println("Your integer is even.");
      } else {
          System.out.println("Your integer is not even.");
      }
    }
}