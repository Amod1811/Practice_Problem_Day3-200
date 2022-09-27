package bl.com.day2program;
import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character :");
		char ch = sc.next().charAt(0);// use for take char value from user
		switch (ch) { // switch case 
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;//  after check enter char are vowel are not break the switch case and go to default section
			      // enter char are vowel print char is  vowel and not vowel go to default 
			default :
				System.out.println(ch + " is consonant");
		}
	}
	
}


