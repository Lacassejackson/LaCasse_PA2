import java.util.Scanner; // import the Scanner class 

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int version;
		double weight;
		double height;
		double BMI;
		//int pounds = 1;
		
	    Scanner scnr = new Scanner(System.in);
		System.out.println("Hello, Press 1 for Pounds and 2 for Kilograms");
		version = scnr.nextInt();
		
		if (version <= 1) {
			System.out.println("Please enter your weight.");
			weight = scnr.nextDouble();
			System.out.println("Please enter your height in inches.");
			height = scnr.nextDouble();
			BMI = (703 * weight) / Math.pow(height, 2); 
			System.out.println("Your BMI is " + BMI);
				
			if (BMI < 18.5) {
				System.out.print("You are underweight");
			} else if (18.5 <= BMI && BMI <= 24.9 ) {
				System.out.print("You are normal weight");
			} else if (25 < BMI && BMI <= 29.9) {
				System.out.print("You are overweight");
			} else if (BMI >= 30) {
				System.out.print("You are obese");
			}
			
			
		} else if (version > 1) {
			System.out.println("Please enter your weight.");
			weight = scnr.nextDouble();
			System.out.println("Please enter your height in meters.");
			height = scnr.nextDouble();
			BMI = ( weight) / Math.pow(height, 2);
			System.out.println("Your BMI is " + BMI);
			
			if (BMI < 18.5) {
				System.out.print("You are underweight");
			} else if (18.5 <= BMI && BMI <= 24.9 ) {
				System.out.print("You are normal weight");
			} else if (25 < BMI && BMI <= 29.9) {
				System.out.print("You are overweight");
			} else if (BMI >= 30) {
				System.out.print("You are obese");
			}
			
		}

		
	}

}
