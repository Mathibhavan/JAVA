import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int temp,result;
		temp=num1>num2?num1:num2;
		result=temp>num3?temp:num3;
		System.out.println("The largest of three numbers is :" +result) ;
	}

	

}
