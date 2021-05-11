import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		   System.out.println("Enter the height of the tower");
		   int tower=s.nextInt();
		   System.out.println("Enter the height of the stair");
		   double stair=s.nextDouble();
		   System.out.println("Enter the length of the step");
		   double step=s.nextDouble();
		   double x=stair/tower;
		   System.out.println("No of steps = " +x);
		   double y=(stair+step)/x;
		   System.out.println("Total distance covered = " +y);

	}

}
