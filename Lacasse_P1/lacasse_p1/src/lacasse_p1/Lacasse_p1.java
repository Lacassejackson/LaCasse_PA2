package lacasse_p1;
import java.util.Scanner;

public class Lacasse_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int num4;
		int num;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter your four digit number to be encripted.");
		num = scnr.nextInt();
		
		num1 = num % 10;
		num2 = num / 10 % 10;
		num3 = num /100 % 10;
		num4 = num /1000 % 10;
		/* System.out.println("Enter the first digit");
		num1 = scnr.nextInt();
		System.out.println("Enter the next digit");
		num2 = scnr.nextInt();
		System.out.println("Enter the next digit");
		num3 = scnr.nextInt();
		System.out.println("Enter the final digit");
		num4 = scnr.nextInt();
		*/
		
		num1 = (num1 + 7) / 10;
		num2 = (num2 + 7) / 10;
		num3 = (num3 + 7) / 10;
		num4 = (num4 + 7) / 10;
		
		System.out.println("Your code is: " + num3 + "" + num4 + "" + num1 + "" + num2);
	}

}
