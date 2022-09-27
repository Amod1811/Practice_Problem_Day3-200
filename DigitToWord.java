package bl.com.day2program;
import java.util.Scanner;

public class DigitToWord {
	public static void main(String[] args) {
		String[]nos = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		int r;
		String res = "";
		if(no >= 0) {
			r = no % 10;
			res = nos[r] + " " + res;
			no /= 10;
			System.out.println("\n" + res);
		}
		else {
			System.out.println("Number is not present");
		}
	}
}
