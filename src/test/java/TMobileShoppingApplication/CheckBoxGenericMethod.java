package TMobileShoppingApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.CheckBoxPage;
import POM.TmobileCheckBoxPage;
import genericUtilityNew.MyBaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxGenericMethod
{
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		TmobileCheckBoxPage checkBoxManager=new TmobileCheckBoxPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.manage().window().maximize(); 
		driver.get("https://www.t-mobile.com/cell-phones?brand=apple%7Coneplus");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);","");

//		String[] arg= {"all"};
//		checkBoxManager.selectCheckBoxes(arg);
		
//		wait.until(ExpectedConditions.visibilityOf(checkBoxManager.getGoogle()));
//        checkBoxManager.selectCheckBoxes("all");
		
//		wait.until(ExpectedConditions.visibilityOf(checkBoxManager.getGoogle()));
//        checkBoxManager.selectCheckBoxes("google");
        
//		wait.until(ExpectedConditions.visibilityOf(checkBoxManager.getNokia()));
//        checkBoxManager.selectCheckBoxes("nokia");
        
		driver.close();
	}

}
