import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int fact=1;
	System.out.println("Enter the number");
	int num = s.nextInt();
	for (int i = 1; i < num; i++) {
		fact=fact*i;
	}
	System.out.println("The factorial of the given num is :" +fact);
	}}

