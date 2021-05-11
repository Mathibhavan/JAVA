package Java_Concepts;
import java.util.Scanner;

public class Method_Concepts {

//Method without argument
	/*public static void Method() {
          System.out.println("Welcome to concept of learning methods in JAVA");
         }
	  public static void main(String[] args) {
		Method();
     }*/

 //Method with Argument   
	/*public static void Method(String name) {
	System.out.println("Welcome to concept of learning methods in JAVA  " +name);
	}
	 public static void main(String[] args) {
		 Method("Mathi");
		 Method("Bhavan");
		 Method("Lalitha");
		 }*/
	
//Method with multiple Arguments
	/*public static void Method(String name,int classno) {
		System.out.println(name+" Welcome to concept of learning methods in JAVA class " +classno);
	}
	 public static void main(String[] args) {
		 Method("Mathi",1);
		 Method("Bhavan",2);
		 Method("Lalitha",3);
		 }*/
	
//Return methods 
	/*public static int Method(int y) {
		return 3+y;
	}
		public static void main(String[] args) {
			System.out.println(Method(7));
			System.out.println(Method(17));
			System.out.println(Method(27));
     }*/

//Method with if condition
	/*public static void Weekdays(int day) {
		if (day==0) 
			System.out.println("Sunday");
		else if (day==1) 
			System.out.println("Monday");
		else if (day==2) 
			System.out.println("Tuesday");
		else if (day==3) 
			System.out.println("Wednesday");
		else if (day==4) 
			System.out.println("Thursday");
		else if (day==5) 
			System.out.println("Firday");
		else if (day==6) 
			System.out.println("Saturday");
		else {
			      System.out.println("Enter a valid input");
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		int w = s.nextInt();
		Weekdays(w);
	}*/
	
//Method overloading and subclass
	/*public class Bank {
	public static void getbalance(int i) {
		System.out.println("Amount deposited in Bank is  " +i);
	}
static class BankA extends Bank{
	public static void getbalance(int a) {
		System.out.println("Amount deposited in Bank is " +a );
	}
static class BankB extends Bank{
	public static void getbalance(int b) {
		System.out.println("Amount deposited in Bank is " +b);
	}
static class BankC extends Bank{
	public static void getbalance(int c) {
		System.out.println("Amount deposited in Bank is " +c);
	}
}
}
}

public static void main(String[] args) {
	getbalance(0);
	getbalance(1000);
	getbalance(2000);
	getbalance(3000);
	}}*/

//Static method Vs Public method
	/*static void staticmethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	void publicmethod() {
		System.out.println("Public methods are called by using objects");
	}
		public static void main(String[] args) {
			staticmethod();
			Pratice p = new Pratice();
	        p.publicmethod();
		}*/
	
	//you cannot have same method name when once is public and the another is static
	
}
