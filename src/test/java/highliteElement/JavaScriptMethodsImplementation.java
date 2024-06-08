package highliteElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericUtilityNew.JavaUtility;
import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptMethodsImplementation 
{
	public static void main(String[] args) {
		WebDriverUtility wUtil=new WebDriverUtility();
		JavaUtility javUtil=new JavaUtility();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement textEle=driver.findElement(By.id("email"));
		
		String name="Username";
		String pass="password";
		
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')", textEle);
		
//		js.executeScript("document.getElementById('email').value='xyz';",""); 
		js.executeScript("arguments[0].value = arguments[1];",textEle,name);
		
		WebElement passEle=driver.findElement(By.id("pass"));
//		js.executeScript("document.getElementById('pass').value='xyz';","");
		js.executeScript("arguments[0].value=arguments[1];",passEle,pass);
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
//		js.executeScript("document.getElementByXPATH('//button[@name='login']').click();", "");
		js.executeScript("document.evaluate(\"//button[@name='login']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");

//		js.executeScript("arguments[0].click();",loginButton);
		
		
		/* Note
		 * JavascriptExecutor in Selenium to interact with checkbox
		 * js.executeScript(“document.getElementByID(‘element id ’).checked=false;”);
		 */
		
		js.executeScript("location.reload()","");
		driver.close();
		
	}

}
