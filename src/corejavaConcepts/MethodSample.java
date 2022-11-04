package corejavaConcepts;

public class MethodSample {

	public static void add() {
		int a = 90;
		int b = 80;
		System.out.println(a + b);
	}

	public static void sub() {
		int a = 90;
		int b = 80;
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		//Call the methods in main
		add();
		sub();
	}

}
