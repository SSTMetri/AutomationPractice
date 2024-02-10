import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class NewExample {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/log-in/s?k=log+in");
		WebElement tags = driver.findElement(By.tagName("a"));
		System.out.println(tags);
		
	}

}
