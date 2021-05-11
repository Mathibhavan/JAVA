package Java_Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number or a string");
		int a=sc.nextInt();
		int sum=0;
		int temp=a;
		while (a>0) {
			int r=a%10;  //getting remainder  
			sum=(sum*10)+r;    
			a=a/10;
		}if (temp==sum) 
			System.out.println("Entered num is palindrome");
		else {
			System.out.println("Entered num is not a palindrome");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		int len = str.length();
		String rev="",str1="";
		for (int i = str1.length()-1; i >=0; i--) {
			rev=rev+str1.charAt(i);
		}
		if (str1==rev) {
			System.out.println("Entered string is palindrome");
		}
		else {
			System.out.println("Entered string is not a palindrome");
		}
			
		}
		

	}


