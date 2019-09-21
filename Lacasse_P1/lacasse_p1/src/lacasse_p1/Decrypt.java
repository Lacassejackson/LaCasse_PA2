package lacasse_p1;
import java.util.Scanner;


public class Decrypt {
	
	public static void main(String[] args) {
	int num1;
	int num2;
	int num3;
	int num4;
	int num;
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter your four digit number to be decrypted.");
	num = scnr.nextInt();

	num1 = num % 10;
	num2 = num / 10 % 10;
	num3 = num /100 % 10;
	num4 = num /1000 % 10;
	
	num1 = (num1 * 10) - 7;
	num2 = (num2 * 10) - 7;
	num3 = (num3 * 10) - 7;
	num4 = (num4 * 10) - 7;
	
	System.out.println("Your number is: " + num3 + "" + num4 + "" + num1 + "" + num2);
	
	}
	
}
