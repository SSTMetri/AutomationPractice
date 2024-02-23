package cogmento;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericUtilityNew.ExcelFileUtility;
import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_cogmento.CreateCompanyPage;
import pom_cogmento.CreateContactPage;
import pom_cogmento.HomePage;
import pom_cogmento.LoginPage;

public class CreateContact 
{
	ExcelFileUtility eUtil=new ExcelFileUtility();
	@Test
	public void contactCreation() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		WebDriverUtility wUtil=new WebDriverUtility();
		
		LoginPage lPage=new LoginPage(driver);
		HomePage hPage=new HomePage(driver);
		CreateContactPage cContactPage=new CreateContactPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/?lang=en-GB");
		
		String email="soubhagyasm7073@gmail.com";
		String password="Soubhagya";
		
		String firstName="soubhagya",lastName="Metri",middleName="S",
		companyName="Manufactureing comapny",personalEmail="xyz@gmail.com",
		giveStatus="Active",givenCategory="Lead",
		description="This is my contact ineformation",socialMName="Instagram",
		socialChannelUrl="https://instagram.com",address="Plot no. 105, Aacharya ravishekhar colony",
		city="Vijayapura",stateOrCountry="Karnataka",
		postCOde="586005",country="India",
		phoneNum="8855669922",homeNum="85214852145";
		
		String position="Engineer",dept="Software Development",
		identifier="ABC",dateDob="30",giveMonth="Jan",giveYear="1998";
		
		lPage.login(email, password);
		
		WebElement homeEle = hPage.getHomeElement();
		wUtil.mouseHoverAction(driver,homeEle);
		
		WebElement createConatc = hPage.getCreateContactButton();
		createConatc.click();
		
		WebElement randomEle = cContactPage.getRandomElement();
		wUtil.mouseHoverAction(driver, randomEle);
		
		cContactPage.createContact(firstName,lastName,middleName,email
				,companyName,personalEmail,giveStatus,givenCategory,description
				,socialMName,socialChannelUrl,address,city,stateOrCountry,postCOde,
				country,phoneNum,homeNum);
		wUtil.scrollDownAction(driver);
		
		cContactPage.createContactPageFillDetails(position,dept,identifier,dateDob,giveMonth,giveYear,country);
		driver.close();
		
	}
}