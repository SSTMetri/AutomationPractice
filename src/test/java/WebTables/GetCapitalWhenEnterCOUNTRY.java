package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCapitalWhenEnterCOUNTRY 
{
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://cosmocode.io/automation-practice-webtable/");
//		String country="Afghanistan";
		String country="India";

		
		String tname = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[*]/td[*]/strong[normalize-space()='"+country+"']/following::td[1]")).getText();
		System.out.println(tname);
		
		
		driver.close();
	}

}
