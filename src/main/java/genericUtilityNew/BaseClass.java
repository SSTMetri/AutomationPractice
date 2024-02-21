package genericUtilityNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver=null;
	WebDriverUtility wUtil=new WebDriverUtility();
	
	
	public static WebDriver sdriver;
	
	@BeforeMethod
	public void method(String BROWSER,WebDriver driver) {
		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(/*firefoxOptions*/);
//			firefoxOptions.addArguments("--dissable-notifications");
			System.out.println(BROWSER+"----launched----");
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(/*edgeOptions*/);
//			edgeOptions.addArguments("--dissable-notifications");
			System.out.println(BROWSER+"----launched----");		
		}
		else if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(/*chromeOptions*/);
//			chromeOptions.addArguments("--dissable-notifications");
			System.out.println(BROWSER+"----launched----");		
		}
		else
		{
			System.out.println("----Invalid browsername----");
		}
		wUtil.maximizeWindow(driver);
		wUtil.waitForPageLoad(driver);
		
		sdriver=driver;
	}

}
