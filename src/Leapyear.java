import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the year");
	int year=s.nextInt();
	if (year%4==0) 
		System.out.println("The entered year is leap year");
	else
		System.out.println("The entered year is not a leap year");

	}

}