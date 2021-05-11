package File_Handling;

import java.io.File;

public class Create_File {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\721901\\Desktop\\JAVApratice.txt");
			if (f.createNewFile()) {
				System.out.println("File created :" +f.getName());
				System.out.println("Absolute path : " +f.getAbsolutePath());
			}
			else {
				System.out.println("File already exist");
			}
		} catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
	}

}
