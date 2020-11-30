/**
 * This TargetHeartRateCalculator is to test HeartRates. Specifically, to prompt for the person's information, instantiate an object of 
 * class HeartRates and print the information from that object.
 * 
 * 
 * @author Yuhang Zhao, student number 150467199
 */

import java.util.Scanner;

public class TargetHeartRateCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your personal information:\n");
		System.out.println("What's your first name?");
		String fn = input.nextLine();
		System.out.println("What's your last name?");
		String ln = input.nextLine();
		System.out.println("What's your birth month?");
		int m = input.nextInt();
		System.out.println("What's your birth day?");
		int d = input.nextInt();
		System.out.println("What's your birth year?");
		int y = input.nextInt();
		
		HeartRates person = new HeartRates(fn, ln, m, d, y);
		System.out.printf("First name: %s, last name: %s, date of birth: %d/%d/%d\n", person.getfn(), person.getln(), person.getm(), person.getd(), person.gety());
		System.out.printf("This person's age is: %d\nThe maximum heart rate is: %d\nThe target-heart-rate range is from %.2f to %.2f", person.calAge(), person.maxHeartRate(), person.targetHeartRateLow(), person.targetHeartRateHigh());
		
	}

}
