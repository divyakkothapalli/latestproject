package corejavaConcepts;

import java.util.Scanner;

public class Print1To100Numbers {

	public static void main(String[] args) {
//		for(initialize the variable; Condition ; increment/Decrement of variable){
//		}
		// GEt the data from excelsheet
		int i;
		Scanner s = new Scanner(System.in);
		for (i = s.nextInt(); i <= 100; i++) {
			// System.out.println(i);

			if (i % 2 == 0) {
				System.out.println(i + "   is EVEN");
			} else {
				System.out.println(i + "  is ODD");
			}
		} // end of for loop
	}

}
