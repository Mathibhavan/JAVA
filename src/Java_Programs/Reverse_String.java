package Java_Programs;
import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		int len = str.length();
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed string = "+rev);
		
		

	}

}
