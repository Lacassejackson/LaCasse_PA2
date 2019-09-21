import java.util.Scanner; // import the Scanner class 

public class Rate {

	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    String[] rate = {"Anime", "Video Games", "Gundam", "Comics", "Bunnywave"};
		int people;
		int i = 0;
		int[] rating = {0, 0, 0, 0 , 0 };
		int average;
		int averageMemory = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		System.out.println("How many people are taking the survey?");
		people = scnr.nextInt();
		
		while (people > i) {
			i++;
			System.out.println("Please rate the following out of 10");
			
			System.out.println( rate[0] );
			rating[0] = scnr.nextInt();
			System.out.println( rate[1] );
			rating[1] = scnr.nextInt();
			System.out.println( rate[2] );
			rating[2] = scnr.nextInt();
			System.out.println( rate[3] );
			rating[3] = scnr.nextInt();
			System.out.println( rate[4] );
			rating[4] = scnr.nextInt();
			
			average = (rating[0] + rating [1] + rating[2] + rating[3] + rating [4]) / 5;
			averageMemory = average + averageMemory;
			
			num1 = rating[0] + num1;
			num2 = rating[1] + num2;
			num3 = rating[2] + num3;
			num4 = rating[3] + num4;
			num5 = rating[4] + num5;

		}
		//System.out.println("Topic 1 2 3 4 5 6 7 8 9 10 Average");
		//System.out.println("")
		//averageMemory = averageMemory / people;
		//System.out.println("The average is " + averageMemory);
		
		//Finding Highest Number
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("The Highest point total is " + rate[0] + " with a score of " + num1);
		} else if (num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("The Highest point total is " + rate[1] + " with a score of " + num2);
		} else if(num3 > num4 && num3 > num4) {
			System.out.println("The Highest point total is " + rate[2] + " with a score of " + num3);
		} else if(num4 > num5) {
			System.out.println("The Highest point total is " + rate[3] + " with a score of " + num4);
		} else {
			System.out.println("The Highest point total is " + rate[4] + " with a score of " + num5);
		}
		
		
		//Finding Lowest Number
		if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("The lowest point total is " + rate[0] + " with a score of " + num1);
		} else if (num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("The lowest point total is " + rate[1] + " with a score of " + num2);
		} else if(num3 < num4 && num3 < num4) {
			System.out.println("The lowest point total is " + rate[2] + " with a score of " + num3);
		} else if(num4 < num5) {
			System.out.println("The lowest point total is " + rate[3] + " with a score of " + num4);
		} else {
			System.out.println("The lowest point total is " + rate[4] + " with a score of " + num5);
		}
		
		
		
	}

}
