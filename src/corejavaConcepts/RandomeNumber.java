package corejavaConcepts;

import java.util.Random;

public class RandomeNumber {

	public static void main(String[] args) {
		Random r = new Random();
		//Minimum int number is default 0, max user has given in a parameter
		int abc = r.nextInt(19);
		System.out.println(abc);
		
		
	//	"//*[@id='car_models']/div/ul/li["+abc+"]/div/img"
		
		//*[@id="car_models"]/div/ul/li[5]/div/img
		//*[@id="car_models"]/div/ul/li[19]/div/img

	}

}
