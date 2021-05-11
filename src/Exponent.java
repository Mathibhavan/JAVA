import java.util.Scanner;

public class Exponent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the details");
		int base=s.nextInt();
		int exp=s.nextInt();
		int result=1;
		for (; exp!=0; exp--) {
			 result = result*base;
		}
		
System.out.println(result);
	}

}
