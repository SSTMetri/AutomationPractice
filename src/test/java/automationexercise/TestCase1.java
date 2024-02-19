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

public class TestCase1 
{
	@Test
	public void testCase1() {
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
		String userName="Username"+rNum;
		String email=userName+"@gmail.com";
		String password="123456";
		
		String firstName="Username"+rNum;
		String lastName="last"+rNum;
		String company="MyCompany";
		String address="Bengalore";
		String address2="do";
		String country="India";
		String state="Karnataka";
		String city="Bengalore";
		String zipcode="586103";
		String mobileNumber="+918844"+rNum;
		
		
//		3. Verify that home page is visible successfully
		boolean homeIcon=driver.findElement(By.xpath("//i[@class='fa fa-home']")).isDisplayed();
		System.out.println(homeIcon +" is diaplayed");
		
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
//		8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
		WebElement accDetails = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));
		Assert.assertTrue(accDetails.isDisplayed());
//		9. Fill details: Title, Name, Email, Password, Date of birth
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("name")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("days")).sendKeys("30");
		wUtil.scrollDownAction(driver);
		driver.findElement(By.id("months")).click();
		driver.findElement(By.xpath("//option[normalize-space()='January']")).click();
		driver.findElement(By.id("years")).click();
		driver.findElement(By.xpath("//option[@value='1998']")).click();
//		10. Select checkbox 'Sign up for our newsletter!'
		driver.findElement(By.id("newsletter")).click();
//		11. Select checkbox 'Receive special offers from our partners!'
		driver.findElement(By.id("optin")).click();
//		12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys(company);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);
		WebElement countryElement = driver.findElement(By.xpath("//select[@id='country']"));
		wUtil.handleDropDown(countryElement,country);
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys(zipcode);
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys(mobileNumber);
//		13. Click 'Create Account button'
		wUtil.scrollDownAction(driver);
		driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
//		14. Verify that 'ACCOUNT CREATED!' is visible
		WebElement accountCreated = driver.findElement(By.xpath("//b[normalize-space()='Account Created!']"));
		Assert.assertTrue(accountCreated.isDisplayed());
		System.out.println("Account created successfully");
//		15. Click 'Continue' button
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
//		16. Verify that 'Logged in as username' is visible
		wUtil.moveAndClick(driver);
//		driver.findElement(By.xpath(""))
		
		
		WebElement userNameDisplayed = driver.findElement(By.xpath("//b[normalize-space()='"+userName+userName+"']"));
		Assert.assertTrue(userNameDisplayed.isDisplayed());
		System.out.println("Username is diapled");
//		17. Click 'Delete Account' button
		driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
//		18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
		WebElement accDeleted = driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']"));
		Assert.assertTrue(accDeleted.isDisplayed());
		System.out.println("Account deletion successful");
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		
		driver.close();
	}

}
