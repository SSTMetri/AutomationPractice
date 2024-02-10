package genericUtilityNew;

import org.openqa.selenium.WebDriver;

import POM.TmobileCheckBoxPage;

public class MyBaseClass {
	static WebDriver driver=null;
	public static TmobileCheckBoxPage checkBoxManager=new TmobileCheckBoxPage(driver);


}
