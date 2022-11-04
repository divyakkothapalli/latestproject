package assignments;

public class Assignment_1_Age {

	public static void main(String[] args) {
		int age = 65;
		// 0<=2 infant
		// 2<=12 Child
		// 12<=25 youth
		// 25<=59 adult
		// 59<=100 senior citizen

		if (age > 0 && age <= 2) {
			System.out.println(" Age comes under infant");
		} else if (age > 2 && age <= 12) {
			System.out.println(" Age comes under Child");
		}else if (age > 12 && age <= 24) {
			System.out.println(" Age comes under youth");
		}else if (age > 24 && age <= 59) {
			System.out.println(" Age comes under adult");
		}else if (age > 59 && age <= 100) {
			System.out.println(" Age comes senior citizen");
		}else {
			System.out.println("Please enter Age in b/w 1-100 only");
		}

	}

}
