import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

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
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		for(WebElement ele:tags) {
			System.out.println(ele.getText());
		}
		driver.close();
	}

}
