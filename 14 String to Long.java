// Java program to convert String to Long
// using parseLong()
	
public class GFG {
	
	// main method
	public static void main(String args[])
	{
	
		// create a String
		String str = "999999999999";
		System.out.println("String - " + str);
	
		// convert into Long
		long varLong = Long.parseLong(str);
	
		// print String as Long
		System.out.println("Long - " + varLong);
	}
}
