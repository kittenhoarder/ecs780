public class BMI {
    public static void main (String args[]) {
        
        float weight = Float.parseFloat(args[0]);
        float height = Float.parseFloat(args[1]);
        float bmi = ((weight / (height/100))/(height/100));       
        String category = "";

        if (bmi < 18.5) {
            category = "underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            category = "overweight";
        } else {
            category = "obese";
        }
        System.out.print("Your weight: "+args[0]);
        System.out.println(" kg");
        System.out.print("Your height: "+args[1]);
        System.out.println(" cm");
        System.out.print("Your BMI: ");
        System.out.println(String.format("%.2f", bmi));
        System.out.print("You are in the "+category);
        System.out.println(" range.");

    }
}