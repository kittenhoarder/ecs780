import java.util.Scanner;
/**
 *  A class that holding student marks 
 *
 *@author Owen Perry
 *@date 2018
 *@version 1.0
 */
public class StudentMarksMain {

	public static void main(String[] args) {

		StudentMarks studentMarks = new StudentMarks();
		Scanner reader = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.print("Enter a mark from 1-7 for students: ");
			String strInputMark = reader.next();
			int intInputMark = Integer.parseInt(strInputMark);

			System.out.print("Enter a position for the mark: ");
			String strInputPos = reader.next();
			int intInputInt = Integer.parseInt(strInputPos);

			studentMarks.setMark(intInputInt, intInputMark);
		}
		System.out.println(studentMarks.getMarks());
		System.out.println(studentMarks.getMark(1));
		System.out.println(studentMarks.getMeanMark());

		System.out.println(studentMarks.getHighestMarkPos());
		System.out.println(studentMarks.getOtherHighestMarkPos());
	}
}
