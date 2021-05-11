package Java_Programs;

public class Triangle {

	public static void main(String[] args) {
		int i,j=0,n=4;
		for ( i=1; i<=n; i++) {
			for ( j=n; j>=i; j--) {
				System.out.println("*");
			}System.out.println();
		}

	}

}
