package corejavaConcepts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
		//Print the current date & time
		Date d = new Date();
		System.out.println(d);//Tue Nov 01 20:39:32 CDT 2022
		//ddMMMyyyyHHmmss  MM/dd/yyyy_HHmmss
		DateFormat abc = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		//Convert system default date and time to my own format
		//System.out.println(abc.format(d));
		
		String timeStamp = abc.format(d);
		System.out.println(timeStamp);
		
//		Tue Nov 01 20:43:42 CDT 2022
//		01Nov2022_204342
	}
	
	

}
