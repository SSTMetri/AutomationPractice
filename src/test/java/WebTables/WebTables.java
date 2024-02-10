package WebTables;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables 
{
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		String tname = driver.findElement(By.xpath("//table[@id='customers']/tbody[@style='box-sizing:inherit']/tr[@style='background-color:#ddd;box-sizing:inherit']/td[*]/span[normalize-space()='Maria Anders']")).getText();
		System.out.println(tname);
		
		
		driver.close();
	}

}
