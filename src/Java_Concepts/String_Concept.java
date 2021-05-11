package Java_Concepts;

public class String_Concept {

	public static void main(String[] args) {
//To split a single word	
	/*String s="Welcome";
	String[] split = s.split("");
	for (String word : split) {
		System.out.println(word);
	}*/
	
//To split sentence
		/*String str ="World is full of wonders";
		String[] split = str.split(" ");
		for (String word : split) {
			System.out.println(word);
		}*/
		
		/*String str ="World is full of wonders";
		String[] split = str.split(" ", 3);
		for (String word : split) {
			System.out.println(word);
		}*/
		
//Duplicate string and Memory address
		/*String s="Food";
		String s1="Food";
		String str="Good";
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(str));*/
		
		
//String Immutable/Non-literals		
String s1="Good";
String s2="Good";
String s3="Food";
String s4 = s1.concat(s3);
System.out.println(System.identityHashCode(s4));
System.out.println(s4);
	}

}
