public class MonthConverter {
	public static void main (String args[]) {

		int valMonth = Integer.parseInt(args[0]);
		String month;

		if (valMonth == 1) {
			month = "January";
		} else if (valMonth == 2) {
			month = "February";
		} else if (valMonth == 3) {
			month = "March";
		} else if (valMonth == 4) {
			month = "April";
		} else if (valMonth == 5) {
			month = "May";
		} else if (valMonth == 6) {
			month = "June";
		} else if (valMonth == 7) {
			month = "July";
		} else if (valMonth == 8) {
			month = "August";
		} else if (valMonth == 9) {
			month = "September";
		} else if (valMonth == 10) {
			month = "October";
		} else if (valMonth == 11) {
			month = "November";
		} else {
			month = "December";
		}

		System.out.println(month);

	}
}
