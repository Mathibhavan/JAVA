import java.util.Scanner;

public class Matchstick {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cube=0;
		System.out.println("Enter the step");
		int step=s.nextInt();
		for (int i = 0; i <= step; i++) {
			cube=step*6;
			if (i>1) 
			cube=(step*6)-1;
		}
		 System.out.println(cube);

	}

}
