package corejavaConcepts;

public class VariableSample {
	//Global variable
	static int a = 100;
	static int b = 50;

	public static void add() {	
		//Local variable
		//int a = 10;
		int b = 20;
		System.out.println("The Add results is: " + (a + b));
	}

	public static void sub() {
		//Local variable
		int a = 50;
		int b = 10;
		System.out.println("The Sub results is: " + (a - b));
	}

	public static void main(String[] args) {
		add();
		sub();
	}

}
