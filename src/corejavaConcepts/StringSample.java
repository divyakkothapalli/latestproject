package corejavaConcepts;

public class StringSample {

	public static void main(String[] args) {
		// double a =42420.464;
		// int a = 909;

		String a;// String declaration
		a = "Selenium";// Assign the value to a String

		String b = "My phone# is : 9874563210";
		
		System.out.println(a);
		//Converts all of the characters in this String to uppercase 
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		
		System.out.println(b);
		
		String c = "Hi all, How are you?";
		//length():Returns the length of this string.
		System.out.println(c.length());
		
		//charAt(Index): Returns the value at the specified index.
		System.out.println(c.charAt(10));
		
	
		String d = "Preethi";
		String e = "PrEEthI";
		

		//Validate two strings
		//Equals(): it will check both strings are length() and Char() are matching or not?
		if (d.equals(e)) {
			System.out.println("Both the String are equal");
		} else {
			System.out.println("Both the String are NOT equal");
		}
		
		//Validate the below string is contains "Shruthi" word or not?
		String f = "Hi Shruthi, how are you?";
		if (f.contains("Shruthi")) {
			System.out.println("The given word is available in the String");
		} else {
			System.out.println("The given word is NOT available in the String");
		}

	}

}
