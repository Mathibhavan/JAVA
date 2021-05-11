
public class Studentdetails {

	static void setInfo(String name[],int age[],String address[]) {
		for (int i = 0; i < name.length; i++){
			System.out.println(name[i]+age[i] +address[i]);
			}}
	static void setInfo(String name[],int age[]) {
		for (int j = 0; j < age.length; j++) {
				 System.out.println(name[j] +age[j]);
				}}
	
 public static void main(String[] args) {
	 String[] strarray=new String[] {"Mathi","Bhavan","Lalitha","Kumar","Latha"};
	 int[] a =new int[]{25,23,21,22,26};
	 String[] address=new String[] {"Chennai","Mumbai","Delhi","Kolkata","Bangalore"};
	 setInfo(strarray, a,address);
	 setInfo(strarray,a);
 }

}
