package redBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pomRedBus.RedBusPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus 
{
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		RedBusPage rPage=new RedBusPage(driver);
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.cssSelector(".dateText")).click();
		String PassMonthYear="Mar 2024";
//		String ele = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][contains(., '"+PassMonthYear+"')]")).getText();
//		System.out.println(ele);
		rPage.redBusBusinessLibrary("Apr 2024");
//		WebElement traversing_Element = driver.findElement(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(2)"));
//		System.out.println(traversing_Element.getText());
//		driver.findElement(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(3)")).click();
//		WebElement traversing_Element2 = driver.findElement(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(2)"));
//		System.out.println(traversing_Element2.getText());
//		driver.findElement(By.cssSelector("div[class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'] div[class='holiday_count']")).getText();
		driver.close();
	}

}
