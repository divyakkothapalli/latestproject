package corejavaConcepts;

public class ArraySample {
	public static void main(String[] args) {
		int a =90;
		
		
		String b ="80";
		//Array: Store set of multiple values(number/Alphabets/Special char) into a container with index format
		String d[]={"hi","Hello","How","are","you?","Selenium"};		
		System.out.println(d.length);
				
		int c[] = {90,76,434,34,223};
		System.out.println("c.length is: "+c.length);
		//Print c array values using FOR LOOP
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);//90
		}
		System.out.println("***************************************");
		//Print c array values using FOREACH / ADVANCED FOR LOOP/ENHACED FOR LOOP
		for (int i : c) {
			System.out.println(i);
		}
				
		System.out.println("***************************************");
		for (String tulasi : d) {
			System.out.println(tulasi);
		}
		
		
		
		
	}
}
