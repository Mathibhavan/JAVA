import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		int root=0;
		for (int i = 1; i*i <=num ; i++) {
			if (num%i==0) {
				root=i*i;
				System.out.println(root);
			}
		}
			
				
			}

		}
		
	


