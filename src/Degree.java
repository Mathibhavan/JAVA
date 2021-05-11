
public class Degree {
	void getdegree()
	{System.out.println("I got my degree");}
	
public static void main(String[] args) {
	Degree degree = new Degree();
	degree.getdegree();
	Undergraduate un = new Undergraduate();
	un.getdegree();
	Postgraduate ps = new Postgraduate();
	ps.getdegree();
}}
class Undergraduate extends Degree{
	void getdegree()
	{System.out.println("I am an Undergraduated");}
}
class Postgraduate extends Degree{
	void getdegree() {
		System.out.println("I am Postgraduated");
	}
}


	
