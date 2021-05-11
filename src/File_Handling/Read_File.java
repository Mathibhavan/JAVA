package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {

	public static void main(String[] args) {
		try {
		      File myObj = new File("JAVApratice.txt");
		      if (myObj.exists()) {
				System.out.println("File name : " +myObj.getName());
				System.out.println("Absolute Path : " +myObj.getAbsolutePath());
				System.out.println("Readable file ? " +myObj.canRead());
				System.out.println("Writable file ? " +myObj.canWrite());
				System.out.println("File size : " +myObj.length());
			}
		      else {
				System.out.println("The file does not exists");
			}
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
