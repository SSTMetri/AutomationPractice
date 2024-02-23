package cogmento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_cogmento.CreateContactPage;
import pom_cogmento.CreateDealPage;
import pom_cogmento.HomePage;
import pom_cogmento.LoginPage;

public class CreateDeal 
{
	@Test
	public void createDealText() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		WebDriverUtility wUtil=new WebDriverUtility();
		
		LoginPage lPage=new LoginPage(driver);
		HomePage hPage=new HomePage(driver);
		CreateContactPage cContactPage=new CreateContactPage(driver);
		CreateDealPage cDealPage=new CreateDealPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/?lang=en-GB");
		
		String email="soubhagyasm7073@gmail.com";
		String password="Soubhagya";
		String date="Feb 2024";
		String giveTitle="New deal";
		String companyName="Manufactureing company";
		String giveContact="soubhagya";
		String desciption="This is description od deal creation";
		
		lPage.login(email, password);
		
		WebElement homePageRandomElement = hPage.getCreateDealButton();
		homePageRandomElement.click();
		
		WebElement ranomEle = cDealPage.getRandomElementDealPage();
		wUtil.mouseHoverAction(driver, ranomEle);
		
		cDealPage.createDealPageFillDetails(giveTitle,companyName,giveContact,desciption);
		driver.close();
	}

}
