package corejavaConcepts;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 90;
		int b = 90;
		
		// VLAIDATE THE LARGE NUMBER
		if (a > b) {
			System.out.println("a is large value");
		} else if (b > a) {
			System.out.println("b is large value");
		} else if (b == a) {
			System.out.println("both are equal");
		}
	}

}
