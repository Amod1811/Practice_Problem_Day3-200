package bl.com.day2program;

import java.util.Scanner;

public class MonthName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// create the object
		System.out.print("Enter month's number: ");// take use input
		int monthNumber;
		monthNumber = sc.nextInt(); // use for accept user input
		switch (monthNumber) {
		case 1:
			System.out.println("January");// enter the number of month and print january same as all case enter month
											// number
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}

	}
}
