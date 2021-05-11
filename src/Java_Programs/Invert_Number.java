package Java_Programs;

public class Invert_Number {

	public static void main(String[] args) {
		
		int reverse=0;
		/*while (num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}*/
		
		for (int num = 123546; num !=0; num/=10) {
			int digit=num%10;
			reverse=reverse*10+digit;
		}
		
System.out.println(reverse);
	}

}
