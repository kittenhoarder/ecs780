
public class BlueTower extends Tower {
	public BlueTower(){
		super();
		this.name = "Blue Tower";
	}
	public void attackJelly(Jelly j) {
		System.out.println(name + " attacks Jelly for 2 points damage.");
	}
}
