	/**
* @author Owen Perry 
* @version 1.0
*/
public class JellyTest {
	public static void main(String[] args) {
		Jelly blueJelly = new BlueJelly(0, 110);
		Jelly redJelly = new RedJelly(1, -10);

		if (blueJelly.isAlive() == true) {
			System.out.println("BlueJelly is alive!");
		} 
		if (redJelly.isAlive() == true) {
			System.out.println("RedJelly is alive!");
		}
		if (blueJelly.isAlive() == false) {
			System.out.println("BlueJelly is dead!");
		}
		if (redJelly.isAlive() == false) {
			System.out.println("RedJelly is dead!");
		}
	}
}