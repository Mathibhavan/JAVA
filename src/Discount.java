import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the market price");
		double market=s.nextDouble();
		System.out.println("Enter the discount amount");
		double discount=s.nextDouble();
		double a=market*(discount/100);
		double price=market-a;
		System.out.println("Amount to be paid :" +price);
		

	}

}
