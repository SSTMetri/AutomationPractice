package cogmento;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import genericUtilityNew.BaseClass;
import genericUtilityNew.ExcelFileUtility;
import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_cogmento.CreateCompanyPage;
import pom_cogmento.LoginPage;


/*file:///C:/Users/metri/Eclips_MyWorkSpace/GitCodes/test-output/emailable-report.html*/
public class CreateCompany 
{
	
	ExcelFileUtility eUtil=new ExcelFileUtility();

	@Test(dataProvider="getData")
	public void test(String email,String password,String comapanyName,String webSite,String country,String number
			,String homeNumber,String tag,String linkedINURL,String facebookURL,String tritterURL,String tictokURL
			,String instagramURL,String socialTwi,String socialInst,String socialL
			,String socialTic,String socialF,String numOfEmp,String revenue,String statusSelect
			,String address,String city,String state,String postalCode
			,String homeEmail,String description,String industry,String symbol
			,String priority,String category,String identifier,String vatNum
			) {
		/*
		String email="soubhagyasm7073@gmail.com";
		String password="Soubhagya";
		String comapanyName="Manufactureing comapny";
		String webSite="www.dummyProject";
		String country="india";
		String number="9988556622";
		String homeNumber="7418529636";
		String tag="give Tag";
		String linkedINURL="https://www.linkedin.com/in/soubhagya";
		String facebookURL="https//facebook";
		String tritterURL="https//";
		String tictokURL="https//";
		String instagramURL="https//";
		String socialTwi="Twitter";
		
		String socialInst="Instagram";
		String socialL="LinkedIn";
		String socialTic="Tictok";
		String socialF="Facebook";
		String numOfEmp="5";
		String revenue="6545";
		String statusSelect="Active";
		String address="my home",city="Vijayapura",state="Karnataka",postalCode="586103";
		String homeEmail="Home@gmail.com";
		String description="This is companies description";
		String industry="IT",symbol="XYZ";
		String priority="Low";
		String category="Client";
		String identifier="abc";
		String vatNum="45d1g5u3i2n5";
		*/
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		WebDriverUtility wUtil=new WebDriverUtility();
		
		LoginPage lPage=new LoginPage(driver);
		CreateCompanyPage createCompanyPage=new CreateCompanyPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/?lang=en-GB");
		
		lPage.login(email, password);

		//Move to home element
		WebElement homeEle = driver.findElement(By.xpath("//a[@href='/home']"));
		wUtil.mouseHoverAction(driver, homeEle);
		
		//Click on add new companies
		driver.findElement(By.xpath("//a[@href='/companies']/following-sibling::button")).click();
		
		//Move to random element
		
		
		WebElement moveToRandomElement = driver.findElement(By.xpath("//label[text()='Access']"));
		wUtil.mouseHoverAction(driver, moveToRandomElement);
		
		//Fill all the details of company
		
		createCompanyPage.createCompany(comapanyName,webSite,country,number,homeNumber
				,socialL,linkedINURL,numOfEmp,revenue,address,city,state,postalCode
				,email,homeEmail,description,industry
				,symbol
				,priority);
		
		wUtil.scrollDownAction(driver);
		
		createCompanyPage.bottomFieldsOfCompany(statusSelect,category,identifier,vatNum);
		

		
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] getData() throws Exception {
		return eUtil.readMultipleData("CreateCompany");
	}
	

}
