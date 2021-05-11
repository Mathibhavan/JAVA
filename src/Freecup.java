import java.util.Scanner;

public class Freecup {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of cups");
		int cups=s.nextInt();
		int freecup=(cups/6);
		int Total=freecup+cups;
		System.out.println("Total no of cups" +Total);

	}

}
