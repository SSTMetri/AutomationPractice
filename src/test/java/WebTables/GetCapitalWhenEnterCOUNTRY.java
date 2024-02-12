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

		
		String capital = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[*]/td[*]/strong[normalize-space()='"+country+"']/following::td[1]")).getText();
		String currency = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[*]/td[*]//strong[text()='"+country+"']/following::td[2]")).getText();
		String language = driver.findElement(By.xpath("//table/tbody/tr[*]/td[2]/strong[text()='"+country+"']/following::td[3]")).getText();
		
		System.out.println("Capital : "+capital +"\nCurrency : "+currency
				+"\nLanguage"+language);
		
		
		driver.close();
	}

}
