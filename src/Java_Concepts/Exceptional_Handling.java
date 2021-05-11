package Java_Concepts;

public class Exceptional_Handling {

	public static void main(String[] args) {
// Try and nested try block
		/*try {
			int a[]= new int[5];
			a[5]=2;
		}
		 catch (Exception e) {
			 System.out.println(e);
			System.out.println("Element not found");
		}
		try {
			int b=12/0;
			
		} catch (Exception e) {
			System.out.println(e);
		}*/
		
// Try-Final exception	
try {
	int data=25/0;
	System.out.println(data);
} catch (Exception e) {
	e.printStackTrace();
}
finally {
	int data=25/5;
	System.out.println(data);
}
		
	}

}
