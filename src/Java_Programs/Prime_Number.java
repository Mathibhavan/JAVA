package Java_Programs;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		int count = 0;
	
		for (int i=2; i<num; i++) {
			if (num%2==0) {
			count=1;
			}}
		if (count==0)
		System.out.println("Prime Number");
		else {
		System.out.println("Not a Prime Number");
	}*/
		
		
		for (int num = 2; num <100; num++) {
			int count=0;
			for (int j = 2; j < num; j++) {
				if (num%2==0) {
					count=1;
				}}
			if (count==0) {
				System.out.println(num);
			}
			
		}
		}
	
	}
		

	


             