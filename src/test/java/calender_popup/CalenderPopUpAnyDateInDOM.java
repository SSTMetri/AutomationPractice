package calender_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUpAnyDateInDOM
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Actions a=new Actions(driver);
		a.moveByOffset(15,15).click().perform();
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//p[normalize-space()='Mumbai, India']")).click();
		driver.findElement(By.xpath("(//label[@for='toCity'])[1]")).click();
		driver.findElement(By.xpath("//p[normalize-space()='New Delhi, India']")).click();
		
		driver.findElement(By.xpath("(//p[contains(text(),'4')])[4]")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
