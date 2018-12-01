	/**
* @author Owen Perry 
* @version 1.0
*/
public abstract class Jelly {
	
	public static final int BLUE_JELLY = 0;
	public static final int RED_JELLY = 1;
	
	protected int type; // to indicate which colour the Jelly is.
	protected int health; // health of the Jelly (max health is 100, minimum health is 0).
	protected boolean isAlive;
	public String name;

	public Jelly(int type, int health){

		this.type = type;

		if (health <= 0) {
			this.health = 0;
		}
		if (health > 100) {
			this.health = 100;
		} else {
			this.health = health;
		}
		if (type == BLUE_JELLY) {
			this.name = "Blue Jelly";
		} else if (type == RED_JELLY) {
			this.name = "Red Jelly";
		}	
	}
	public boolean isAlive(){
		if (health <= 0) {
			isAlive = false;
		} else {
			isAlive = true;
		}
		return isAlive;
	}

}
