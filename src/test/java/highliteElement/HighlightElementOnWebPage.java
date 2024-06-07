package highliteElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import genericUtilityNew.JavaUtility;
import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightElementOnWebPage 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverUtility wUtil=new WebDriverUtility();
		JavaUtility javUtil=new JavaUtility();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		/* 1
		 * Highlight boder red colour
		 */
//		js.executeScript("document.getElementById('email').setAttribute('style','border:2px solid red');","");
		
		
		/*  USIG WEBELEMENT */
		
		WebElement textEle=driver.findElement(By.id("email"));
		
		/*2
		 * Highlight background yellow
		 */
//		js.executeScript("document.getElementById('email').setAttribute('style','background:yellow');","");
		
//		js.executeScript("arguments[0].setAttribute('style','background:yellow');",textEle);

		/*3
		 * highlight border(red) and and background(yellow)
		 */
//		js.executeScript("document.getElementById('email').setAttribute('style','border:2px solid red;background:yellow');","");
//		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow');",textEle);

		/*
		 * highlight border(red) and background(yellow) and remove immeiately
		 */
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow');",textEle);
//		wUtil.captureScreenShot(driver, "HighlightElementPage");
		String datePresent=javUtil.getDateMMYYYY();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(".\\Screenshots\\Highlight"+datePresent+".png");
										     //Scenario1.png
		Files.copy(src,dst);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style','border:;background:');",textEle);

		
	}

}
