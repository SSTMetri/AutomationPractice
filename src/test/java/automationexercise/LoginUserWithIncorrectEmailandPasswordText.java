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

public class LoginUserWithIncorrectEmailandPasswordText
{
	@Test
	public void testCase3() {
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
		String incorrectUserName="XYZ";
		String incorrectEmail="xyzyzx@gamil.com";
		String incorrectPassword="xyzzzz";
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
		
//		6. Enter incorrect email address and password
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(incorrectEmail);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(incorrectPassword);
		
//		7. Click 'login' button
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

//		8. Verify error 'Your email or password is incorrect!' is visible
		WebElement errorMessage = driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
		Assert.assertTrue(errorMessage.isDisplayed());
		System.out.println(errorMessage.getText()+" Error message is displayed");
		
		driver.close();
	}

}
