package genericUtilityNew;

import java.util.Random;

public class JavaUtility 
{
	public int getRandomNumber() {
		Random r=new Random();
		int num=r.nextInt(1000000);
		return num;
		
	}

}
