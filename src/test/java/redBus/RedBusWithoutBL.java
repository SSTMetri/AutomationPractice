package redBus;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pomRedBus.RedBusPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusWithoutBL 
{
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		RedBusPage rPage=new RedBusPage(driver);
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.cssSelector(".dateText")).click();
		String PassMonthYear="Jun 2024";
		
		boolean present = false;
	    String textMonthY = "";
	    for (;;) {
	        try {
	        	textMonthY=driver.findElement(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(2)")).getText();
	            System.out.println(textMonthY);

	            // Check if the current month and year match the desired month and year
	            if (textMonthY.contains(PassMonthYear)) {
	                present = true;
	                System.out.println("Inside the loop");
	                break; // Break the loop if the desired month and year are found
	            }

	            WebElement element = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][contains(., '"+PassMonthYear+"')]"));
//	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][contains(., '"+PassMonthYear+"')]")));

	            if (element.isDisplayed()) {
	                present = true;
	                System.out.println("Inside the loop");
	                break; // Break the loop if element is present
	            }
	        } catch (Exception e) {
	        	driver.findElement(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(3)")).click();
	        }
	    }
	    if (present) {
	        // Print textMonthY after loop completion
	        System.out.println("Text month and year: " + textMonthY);

	        // Get all holiday dates
	        System.out.println("Get all holiday dates");
	    }
		
//		String ele = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][contains(., '"+PassMonthYear+"')]")).getText();
//		System.out.println(ele);
			
//		WebElement traversing_Element = driver.findElement(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(2)"));
//		System.out.println(traversing_Element.getText());
//		driver.findElement(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(3)")).click();
//		WebElement traversing_Element2 = driver.findElement(By.cssSelector("div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(2)"));
//		System.out.println(traversing_Element2.getText());
//		driver.findElement(By.cssSelector("div[class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'] div[class='holiday_count']")).getText();
		driver.close();
	}

}
