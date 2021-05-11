package Java_Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int a = 0,i=0,j=0;
		num=a;
while (a>0) {
	i=a%10;
	j=j+(i*i*i);
	a=a/10;
}if (num==j) {
	System.out.println("It is an armstrong number");
}else {
	System.out.println("Not an armstrong number");
}*/
		
		
		for (int num = 153; num <=1000; num++) {
			int a=0,i=0,j=0;
			a=num;
		while (a>0) {
				i=a%10;
				j=j+(i*i*i);
				a=a/10;
		}if (num==j) 
			System.out.println(num);
		}
		

}}
