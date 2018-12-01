
import java.util.ArrayList;

/**
 *  A class that holding a list of students
 *
 *@author Owen Perry
 *@date 2018
 */
public class StudentList {

	private ArrayList<Student> list; //instance variable

	/**
	 *  Constructor
	 */
	public StudentList(){
		list = new ArrayList<Student>();
	}
	
	/**
	 *  a method to print off all ArrayList elements
	 */
	
	public void printList(){
		System.out.println("--Begin--");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("--End--");
	}
	
	/**
	 *  A method to add a student to the list
	 *
	 *@param    The student
	 */
	public void addToList(Student s){
		//WRITE YOUR CODE HERE
		list.add(s);
		int listsize = list.size() - 1;
		System.out.println(list.get(listsize).getName()+" has been added to the student list");
	}

	/**
	 *  A method to remove a student from the list
	 *
	 *@param    The student
	 */
	public void removeFromList(Student s){
		//WRITE YOUR CODE HERE
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == s) {
            list.remove(i);
            System.out.println(list.get(i).getName()+" has been removed from the student list");
        	}
		}
	}
	
	/**
	 *  A main method to test
	 */
	public static void main(String[] args) {

		// Create an instance of the class 
		StudentList studentList = new StudentList();

		//create 3 student objects
		Student s1 = new Student("John Smith", "js@qmul.ac.uk", 2008);
		Student s2 = new Student("Tom Will", "tw@qmul.ac.uk", 2007);
		Student s3 = new Student("Owen Perry", "o.e.perry@se18.qmul.ac.uk", 2018);//WRITE YOUR OWN DETAILS HERE
		
		//add the three students to the list
		studentList.addToList(s1);
		studentList.addToList(s2);
		studentList.addToList(s3);

		// Print the list
		studentList.printList();
			
		// Remove the student "Tom Will"
		studentList.removeFromList(s2);
		
		// Print the list again
		studentList.printList();
	}

}