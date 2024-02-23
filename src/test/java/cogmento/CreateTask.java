package cogmento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericUtilityNew.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_cogmento.CreateContactPage;
import pom_cogmento.CreateTaskPage;
import pom_cogmento.HomePage;
import pom_cogmento.LoginPage;

public class CreateTask 
{
	@Test
	public void createTaskTest() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		WebDriverUtility wUtil=new WebDriverUtility();
		
		LoginPage lPage=new LoginPage(driver);
		HomePage hPage=new HomePage(driver);
		CreateContactPage cContactPage=new CreateContactPage(driver);
		CreateTaskPage cTaskPage=new CreateTaskPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/?lang=en-GB");
		
		String email="soubhagyasm7073@gmail.com";
		String password="Soubhagya";
		String titleOfTask="Give title of task";
		
		lPage.login(email, password);
		
		WebElement homeEle = hPage.getHomeElement();
		wUtil.mouseHoverAction(driver, homeEle);
		WebElement createTaskButtonClick = hPage.getCreateTaskElement();
		createTaskButtonClick.click();
		
		WebElement randomElement = cTaskPage.getRandomElement();
		wUtil.mouseHoverAction(driver, randomElement);
		cTaskPage.createTaskFillDetails(titleOfTask);
		driver.close();
		
		
		
	}

}
