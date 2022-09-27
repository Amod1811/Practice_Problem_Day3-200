package bl.com.day2program;
import java.util.Scanner;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		while(i <= num) {
			sum = sum + i;
			i++;
		}
		 System.out.println("Sum of Natural Number is"+" " + sum);
	}

}
