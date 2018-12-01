
public class RedTower extends Tower {
	public RedTower(){
		super();
		this.name = "Red Tower";
	}
	public void attackJelly() {
		System.out.println(name + " attacks Jelly for 2 points damage.");
	}
}
