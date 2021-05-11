package File_Handling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write_File {

	public static void main(String[] args) {
		/*try {
			FileWriter w = new FileWriter("C:\\Users\\721901\\eclipse-workspace\\Java\\JAVApratice.txt");
			PrintWriter p = new PrintWriter(w);
			w.write("Welcome to JAVA");
			w.close();
			System.out.println("Sucessfully written");
		} catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}*/
		
		try {
	         BufferedWriter out = new BufferedWriter(new FileWriter("JAVApratice"));
	         out.write("WOW !! File written sucessfully using file concepts");
	         out.close();
	         System.out.println("File created successfully");
	      }
	      catch (IOException e) {
	    	  System.out.println(e);
	      }

	}

}
