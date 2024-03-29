package pom_cogmento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//span[text()='Home']")
	private WebElement homeElement;
		
	@FindBy(xpath="(//i[@class='plus inverted icon'])[3]")
	private WebElement addCompanyButton;
		
	@FindBy(xpath="(//i[@class='plus inverted icon'])[2]")
	private WebElement createContactButton;
	
	@FindBy(xpath="(//i[@class='plus inverted icon'])[1]")
	private WebElement addCalenderButton;
	
	@FindBy(xpath="(//i[@aria-hidden='true'])[4]")
	private WebElement createDealButton;
//	
	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[5]")
	private WebElement createTaskElement;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getHomeElement() {
		return homeElement;
	}

	public WebElement getAddCompanyButton() {
		return addCompanyButton;
	}

	public WebElement getCreateContactButton() {
		return createContactButton;
	}

	public WebElement getAddCalenderButton() {
		return addCalenderButton;
	}

	public WebElement getCreateDealButton() {
		return createDealButton;
	}

	public WebElement getCreateTaskElement() {
		return createTaskElement;
	}


}
