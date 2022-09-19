package bl.com.day2program;

import java.util.Scanner;

public class PalindormeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int temp=num; // store the num reverse value as temp 
		int rev=0,rem;
		// check the number not equal to zero
		while(temp !=0) {
			
			rem = temp%10;// modules of ten
			rev = rev*10+rem;// multiplication reverse value with 10 and add the modules remainder 
			temp = temp/10;// devide temp value with ten 
		}
		// check the number value and reverse value are equal or not
		if (num==rev) {
			System.out.println(num + "number is Pallindrome");//number value and reverse value are same 
		}
		else {
			System.out.println(num + "number is not Pallindrome");//number value and reverse value not same 
		} 

	}

}