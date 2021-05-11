import java.util.Scanner;

public class Divideseven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter for a");
		int a=s.nextInt();
		System.out.println("Enter for b");
		int b=s.nextInt();
		if (a%b!=0) 
			System.out.println("Not evenly divided");
		else
			System.out.println("Evenly divided");

	}

}
