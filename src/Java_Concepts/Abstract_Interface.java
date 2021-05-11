package Java_Concepts;
// Abstract class and abstract method

/*abstract class Abstract_Interface {
	Abstract_Interface(){
		System.out.println("This is a constructor");
	}
	abstract void Abstract();
	void run() {
		System.out.println("This is the first run");
	}}

class Interface extends Abstract_Interface{
	void Abstract() {
		System.out.println("This is the second run");
	}
}
class second{
	public static void main(String[] args) {
		Interface i = new Interface();
		i.run();
		i.Abstract();
	}}	*/

//Interface and multiple inheritance using interface

/*interface FirstInterface {
	 void mymethod(); 
}
interface SecondInterface {
	void myothermethod();
}
class Interface implements FirstInterface,SecondInterface {
	public void mymethod() {
		System.out.println("Some method");
	}
	public void myothermethod() {
		System.out.println("Some other method");
	}
}
class Main{
	public static void main(String[] args) {
		Interface i = new Interface();
				i.mymethod();
				i.myothermethod();
			}
}*/