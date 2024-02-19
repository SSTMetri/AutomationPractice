package automationexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilityNew.JavaUtility;
import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoutUserTest
{
	@Test
	public void testCase4() {
//		1. Launch browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
//		2. Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverUtility wUtil=new WebDriverUtility();
		JavaUtility jUtil=new JavaUtility();
		int rNum=jUtil.getRandomNumber();
		String userName="soubhagya";
		String email="soubhagya@gmail.com";
		String password="soubhagya";
//		3. Verify that home page is visible successfully
		WebElement homeIcon=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		Assert.assertTrue(homeIcon.isDisplayed());
		System.out.println(homeIcon.getText() +" is diaplayed");
		
//		4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
//		5. Verify 'Login to your account' is visible
		WebElement loginText = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
		Assert.assertTrue(loginText.isDisplayed());
		System.out.println(loginText.getText()+" Is displayed");
//		6. Enter correct email address and password
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
//		7. Click 'login' button
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
//		8. Verify that 'Logged in as username' is visible
		WebElement userNameDisplaed = driver.findElement(By.xpath("//b[normalize-space()='"+userName+"']"));
		Assert.assertTrue(userNameDisplaed.isDisplayed());
		System.out.println(userNameDisplaed.getText()+" Is displaed");
//		9. Click 'Logout' button
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
//		10. Verify that user is navigated to login page
		WebElement logInPage = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
		Assert.assertTrue(logInPage.isDisplayed());
		System.out.println(logInPage.getText()+" Is displayed");
		driver.close();
	}

}
