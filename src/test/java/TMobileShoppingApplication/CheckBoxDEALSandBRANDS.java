package TMobileShoppingApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.MobileAndBandPage;
import POM.TmobileCheckBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDEALSandBRANDS 
{
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
//		TmobileCheckBoxPage checkBoxManager=new TmobileCheckBoxPage(driver);
		MobileAndBandPage checkBoxManager=new MobileAndBandPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.manage().window().maximize(); 
		driver.get("https://www.t-mobile.com/cell-phones?brand=apple%7Coneplus");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);","");

		
//		wait.until(ExpectedConditions.visibilityOf(checkBoxManager.getGoogle()));
//        checkBoxManager.selectCheckBoxes("all");
		
//		wait.until(ExpectedConditions.visibilityOf(checkBoxManager.getGoogle()));
//        checkBoxManager.selectCheckBoxes("google");
        
		wait.until(ExpectedConditions.visibilityOf(checkBoxManager.getNokia()));
        checkBoxManager.selectCheckBoxes("trade_5G","nokia");
//        checkBoxManager.selectCheckBoxes("free","nokia");
//        checkBoxManager.selectCheckBoxes("newBrand","nokia");
//        checkBoxManager.selectCheckBoxes("special_offer","nokia");
//        checkBoxManager.selectCheckBoxes("zero_down","nokia");
        
		driver.close();

	}

}
