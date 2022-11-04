package corejavaConcepts;

public class NestedForLoopSample {

	public static void main(String[] args) {
		int a[]= {1,2};
		String b[]= {"a","b"};
		
		//output: (1,a), (1,b), (2,a)
		for(int i=0; i<a.length; i++){			
			for (int j = 0; j < b.length; j++) {
				System.out.println(a[i] +","+ b[j]);				
			}
		}
	}

}
