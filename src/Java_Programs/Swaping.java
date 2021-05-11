package Java_Programs;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value for x and y");
	int x=sc.nextInt();
	int y=sc.nextInt();		
	int temp=0;
	System.out.println("Before Swaping " +x  +y);
	temp=x;
	x=y;
	y=temp;
	System.out.println("After swaping " +x  +y);*/
		
// Without using 3rd variable	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();		
		System.out.println("Before Swaping " +x  +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swaping " +x  +y);
	}

	}


