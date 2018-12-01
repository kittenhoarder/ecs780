/**
* @author Owen Perry 
* @version 1.0
*/
public class Student {

	String name, gender, yearOfBirth;
	boolean registered = false;

	// Method that registers a student
	public void register() {
		if (registered == true) {
            System.out.println("The student "+name+" has already been registered.");
        } else {
            registered = true;
        }
	}
}