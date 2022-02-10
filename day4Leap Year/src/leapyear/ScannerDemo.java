package leapyear;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year :");
		int year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.println(year +" is a leap year");
		}
		else if(year % 100 == 0){
			System.out.println(year + " is not a leap year");
		}
		if (year % 4 == 0) {
			System.out.println(year +" is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

	}

}
