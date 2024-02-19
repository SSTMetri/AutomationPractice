package questions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		WebDriverUtility wUtil=new WebDriverUtility();
		
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		List<WebElement> flights = wait.until(ExpectedConditions
		    .visibilityOfAllElementsLocatedBy(By.xpath("//span[normalize-space()='BOOK NOW']")));
		System.out.println(flights.size());
		wUtil.moveAndClick(driver);
		int retry=0;
		int indexToBook=flights.size()-2;
		while(retry<3) {
			try {
				flights.get(indexToBook).click();
				break;
			}
			catch(StaleElementReferenceException e) {
				flights = wait.until(ExpectedConditions
					    .visibilityOfAllElementsLocatedBy(By.xpath("//span[normalize-space()='BOOK NOW']")));
				retry++;
			}
		}
		Thread.sleep(5000);
		
		driver.close();
	}

}
