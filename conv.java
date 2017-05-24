package session7;
import java.util.Scanner;//Import scanner

//public class conv

public class conv{

	// demo method to convert integer to string
	public void demoInteger() {
		int i;
		System.out.println("Enter Integer value that you want  to convert in String conversion ");
		// taking user input

		Scanner obj1 = new Scanner(System.in);
		i = obj1.nextInt();
		// Integer to String conversion by valueOf method

		String str1 = String.valueOf(i); //Convert int into String using valueof function

		System.out.println("This is the conversion from Integer to String " + str1);
	}



	public static void main(String[] args) {
		// creating object of class conv
		conv o = new conv();
		// calling method

		o.demoInteger();  

	}
}

----------------------
Sample Output
sh-4.3$ javac conv.java                                                                                                                                                         
sh-4.3$ java conv                                                                                                                                                               
Enter Integer value that you want  to convert in String conversion                                                                                                              
45                                                                                                                                                                              
This is the conversion from Integer to String 45   
