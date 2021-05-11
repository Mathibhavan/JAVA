import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row,column,i = 0,j = 0;
		System.out.println("Enter the no of rows");
		row=s.nextInt();
		System.out.println("Enter the no of column");
		column=s.nextInt();
		
		int matrics1[][]=new int[row][column];
		int matrics2[][]=new int[row][column];
		int result[][]=new int[row][column];
		
		System.out.println("Enter the elements for matrics 1");
		for (int i1 = 0; i1 < row; i1++) {
			for (int j1 = 0; j1 < column; j1++) {
				 matrics1[i][j] =s.nextInt();
				System.out.println();
			}
			
		
		System.out.println("Enter the elements for matrics 2");
		for (int i2 = 0; i2 < row; i2++) {
			for (int j2 = 0; j2 < column; j2++) {
				 matrics2[i][j]=s.nextInt();
				System.out.println();
				
			}
			
			for (int i3 = 0; i3 < row; i3++) {
				for (int j3 = 0; j3 < result.length; j3++) {
					result [i][j] = matrics1[i][j]+matrics2[i][j];
					
			
			
			System.out.println("Sum of the matrics");
			for (int k = 0; k < result.length; k++) {
				for (int k2 = 0; k2 < result.length; k2++) {
					
					
			}
				System.out.println("The result is " +result[i][j]+"\t");
				System.out.println();
		}
	}

}}}}}
