package corejavaConcepts;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		int a;
		int b;
		// Give a & b values at runtime in console

		// Create object for the existing class(developed By Java team)
		// CLASSNAME objectName = new CLASSNAME();
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		System.out.println(a + b);
	}
}
