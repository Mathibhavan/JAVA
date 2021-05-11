
public class I {
	int i;
	public void printNum() {
		System.out.println(i);
	}}
class J extends I{
	int j;
	public void printNum() {
		System.out.println(j);
	}}
class Ans{
	public static void main(String[] args) {
		J a = new J();
		a.i=10;
		a.j=20;
		a.i=a.j;
		a.printNum();
		

	}

}
