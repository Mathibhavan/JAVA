package Java_Programs;

import java.util.Scanner;

public class Find_Even_Odd {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if (num/2==0) {
			System.out.println("The number entered is even");
		}else {
			System.out.println("The number entered is odd");
		}*/
		
//Sum of even number		
		/*int count=0;
		for (int i = 2; i <=100; i++) {
			if (i%2==0) 
			count=count+1;
			}
		System.out.println(count);*/
		
//Sum of odd number		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		for (int i = 2; i <=num; i++) {
			if (i%2!=0) 
				count=count+1;
			}System.out.println(count);
		}
	}


