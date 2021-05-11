package Java_Programs;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println("Fibonacci series");
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <=10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
        
	}

}
