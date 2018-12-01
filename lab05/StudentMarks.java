/**
 *  A class that holds student marks 
 *
 *@author Owen Perry
 *@date 2018
 *@version 1.0
 */
public class StudentMarks {

	private double[] marksArray = new double[6];

	public String getMarks() {
		String marksString = "";
		for (int i = 0; i < marksArray.length; i++){
			marksString = marksString + marksArray[i]+" ";
		}
		return marksString;
	}

	public double getMark(int pos) {
		return marksArray[pos];
	}

	public void setMark(int pos, double mark) {
		marksArray[pos] = mark;
	}

	public double getMeanMark() {
		double sum = 0;
		for (int i = 0; i < marksArray.length; i++) {
			sum = sum + marksArray[i];
		}
		double mean = sum / marksArray.length;
		return mean;
	}

	public int getHighestMarkPos() {
		double highestMark = 0;
		int indexPlace = 0;

		for (int i = 0; i < marksArray.length; i++){
			if (marksArray[i] > highestMark){
				highestMark = marksArray[i];
				indexPlace = i;
			}
		}
		return indexPlace;
	}

	public int getOtherHighestMarkPos() {
		double highestMark = 0;
		int indexPlace = 0;

		for (int i = 0; i < marksArray.length; i++){
			if (marksArray[i] > highestMark || marksArray[i] == highestMark){
				highestMark = marksArray[i];
				indexPlace = i;
			}
		}
		return indexPlace;
	}
}