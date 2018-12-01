public class DayName {
	public static void main (String args[]) {

		int day = Integer.parseInt(args[0]);
        String dayString;
        switch (day) {
            case 0:  dayString = "Sunday";
                     break;
            case 1:  dayString = "Monday";
                     break;
            case 2:  dayString = "Tuesday";
                     break;
            case 3:  dayString = "Wednesday";
                     break;
            case 4:  dayString = "Thursday";
                     break;
            case 5:  dayString = "Friday";
                     break;
            case 6:  dayString = "Saturday";
                     break;
        default: 
            dayString = "Invalid day"; 
            break; 
        }
        System.out.println(dayString);
		
	}
}
