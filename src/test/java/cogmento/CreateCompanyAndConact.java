package cogmento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtilityNew.ExcelFileUtility;
import genericUtilityNew.JavaUtility;
import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_cogmento.CreateCompanyPage;
import pom_cogmento.CreateContactPage;
import pom_cogmento.HomePage;
import pom_cogmento.LoginPage;

public class CreateCompanyAndConact 
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
		
		String firstName="soubhagya",lastName="Metri",middleName="S",
		companyName="Manufactureing comapny",personalEmail="xyz@gmail.com",
		giveStatus="Active",givenCategory="Lead",
		description2="This is my contact ineformation",socialMName="Instagram",
		socialChannelUrl="https://instagram.com",address2="Plot no. 105, Aacharya ravishekhar colony",
		stateOrCountry="Karnataka",
		postCOde="586005",
		phoneNum="8855669922",homeNum="85214852145";
		
		String position="Engineer",dept="Software Development",
		identifier2="ABC",dateDob="30",giveMonth="Jan",giveYear="1998";
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		WebDriverUtility wUtil=new WebDriverUtility();
		
		JavaUtility jUtil=new JavaUtility();
		int random = jUtil.getRandomNumber();
		LoginPage lPage=new LoginPage(driver);
		HomePage hPage=new HomePage(driver);
		CreateCompanyPage createCompanyPage=new CreateCompanyPage(driver);
		CreateContactPage cContactPage=new CreateContactPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/?lang=en-GB");
		
		lPage.login(email, password);

		//Move to home element
		WebElement homeEle = hPage.getHomeElement();
		wUtil.mouseHoverAction(driver, homeEle);
		
		//Click on add new companies
		driver.findElement(By.xpath("//a[@href='/companies']/following-sibling::button")).click();
		
		//Move to random element
		
		
		WebElement moveToRandomElement = driver.findElement(By.xpath("//label[text()='Access']"));
		wUtil.mouseHoverAction(driver, moveToRandomElement);
		
		//Fill all the details of company
		String companyNameNew=comapanyName+random;
		createCompanyPage.createCompany(companyNameNew,webSite,country,number,homeNumber
				,socialL,linkedINURL,numOfEmp,revenue,address,city,state,postalCode
				,email,homeEmail,description,industry
				,symbol
				,priority);
		
		wUtil.scrollDownAction(driver);
		
		createCompanyPage.bottomFieldsOfCompany(statusSelect,category,identifier,vatNum);
		
		
		//Create contact
		wUtil.mouseHoverAction(driver,homeEle);
		
		WebElement createConatc = hPage.getCreateContactButton();
		createConatc.click();
		
		WebElement randomEle = cContactPage.getRandomElement();
		wUtil.mouseHoverAction(driver, randomEle);
		
		cContactPage.createContact(firstName+random,lastName,middleName,email
				,companyNameNew,personalEmail,giveStatus,givenCategory,description2
				,socialMName,socialChannelUrl,address2,city,stateOrCountry,postCOde,
				country,phoneNum,homeNum);
		wUtil.scrollDownAction(driver);
		
		cContactPage.createContactPageFillDetails(position,dept,identifier2,dateDob,giveMonth,giveYear,country);
		driver.close();

		
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] getData() throws Exception {
		return eUtil.readMultipleData("CreateCompany");
	}

}
