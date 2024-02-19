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

public class RegisterUserWithExistingEmail 
{
	@Test
	public void registerUserWithExistingEmail() {
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
//		5. Verify 'New User Signup!' is visible
		WebElement newUser=driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
		boolean newUserIsDisplayed=newUser.isDisplayed();
		Assert.assertTrue(newUserIsDisplayed);
//		6. Enter name and email address
		driver.findElement(By.name("name")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
//		7. Click 'Signup' button
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();

//		8. Verify error 'Email Address already exist!' is visible
		WebElement errorText = driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']"));
		Assert.assertTrue(errorText.isDisplayed());
		System.out.println(errorText.getText()+" Is displayed");
		
		driver.close();
	}

}
