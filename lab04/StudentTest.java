/**
* @author Owen Perry 
* @version 1.0
*/
public class StudentTest {
	public static void main (String args[]) {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.name = "Rick Sanchez";
		student1.gender = "Male";
		student1.yearOfBirth = "1972";

		student2.name = "Owen Perry";
		student2.gender = "Male";
		student2.yearOfBirth = "1987";

		System.out.println(student1.name+" "+student1.gender+" "+student1.yearOfBirth+" ");
		System.out.println(student2.name+" "+student2.gender+" "+student2.yearOfBirth+" ");
	}
}