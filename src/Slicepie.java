import java.util.Scanner;

public class Slicepie {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no of slice");
		int slice=s.nextInt();
		System.out.println("Enter the no of recepients");
		int people=s.nextInt();
	    int perhead=(slice/people);
	    System.out.println("No of slice each person will get : " +perhead);
	    int Total=people*perhead;
	    if (Total>=slice) 
			System.out.println("Equal slices");
		else
			System.out.println("Insufficient slices");
			
			

		}



	}


