package corejavaConcepts;

public class Operators {

	public static void main(String[] args) {
		int a = 90;
		int b = 80;
		int c = 100;

		if (a > b && a > c) {// TRUE && FASLE
			System.out.println(" a is large value");

		} else if (b > a && b > c) {
			System.out.println(" b is large value");

		} else if (c > a && c > b) {
			System.out.println(" c is large value");
		}
		
		System.out.println("*********************************");
		
		
		if (a > b || a > c) {// TRUE && FASLE
			System.out.println(" a is large value");

		} else if (b > a || b > c) {
			System.out.println(" b is large value");

		} else if (c > a || c > b) {
			System.out.println(" c is large value");
		}
	}

}
