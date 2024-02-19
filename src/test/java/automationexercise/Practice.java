package automationexercise;

import genericUtilityNew.JavaUtility;

public class Practice 
{
	public static void main(String[] args) {
		JavaUtility jUtil=new JavaUtility();
		int rNum=jUtil.getRandomNumber();
		String userName="Username"+rNum;
		String email=userName+"@gmail.com";
		
		System.out.println(userName);
		System.out.println(email);
	}

}
