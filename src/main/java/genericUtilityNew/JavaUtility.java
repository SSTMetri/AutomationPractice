package genericUtilityNew;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility 
{
	public int getRandomNumber() {
		Random r=new Random();
		int num=r.nextInt(1000000);
		return num;
		
	}
	
	public String getDateMMYYYY() {
		Date d=new Date();
		SimpleDateFormat formater2=new SimpleDateFormat("MM-yyyy");
		String monthYear = formater2.format(d);
		return monthYear;
	}
	
	public String getTodaysDate() {
		Date d=new Date();
		SimpleDateFormat formater=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String completeDate = formater.format(d);

		return completeDate;
	}

}
