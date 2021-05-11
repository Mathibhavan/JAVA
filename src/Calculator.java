import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a = s.nextDouble();
		double b = s.nextDouble();
		System.out.println("Enter the operators (+,-,*,/)" );
		char operator = s.next().charAt(0);
		double result;
		switch (operator) {
		case '+':
			System.out.println(result=a+b);
			break;
			
		case '-':
			System.out.println(result=a-b);
		case '*':
			System.out.println(result=a*b);
		case '/':
			System.out.println(result=a/b);

		default:
			System.out.println("Enter the correct operator");
			break;
		}
		}}
