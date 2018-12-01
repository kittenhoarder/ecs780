public class DayNameCal {
	public static void main (String args[]) {

		int day = Integer.parseInt(args[0]);
        String dayString;
        switch (day) {
            case 1:
            case 8:
            case 15:
            case 22:
            case 29: dayString = "Sunday";
                     break;
            case 2:
            case 9:
            case 16:
            case 23:
            case 30: dayString = "Monday";
                     break;
            case 3:
            case 10:
            case 17:
            case 24:
            case 31: dayString = "Tuesday";
                     break;
            case 4:
            case 11:
            case 18:
            case 25: dayString = "Wednesday";
                     break;
            case 5:
            case 12:
            case 19:
            case 26: dayString = "Thursday";
                     break;
            case 6:
            case 13:
            case 20:
            case 27: dayString = "Friday";
                     break;
            case 7:
            case 14:
            case 21:
            case 28: dayString = "Saturday";
                     break;
        default: 
            dayString = "Invalid day"; 
            break; 
        }
        System.out.print("The day on ");
        System.out.print(args[0]);
        System.out.print(" of October is ");
        System.out.print(dayString);
        System.out.println(".");
		
	}
}
