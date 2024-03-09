package practice_windowResizeBrokenLinks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowResize 
{
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Dimension d=new Dimension(800,600);
		driver.manage().window().setSize(d);
//		driver.manage().deleteAllCookies();  //To delete a cookies
		//Xpath to get all images --> //img
		driver.close();
	}

}
