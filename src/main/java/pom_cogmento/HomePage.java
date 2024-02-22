package pom_cogmento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//a[@href='/home']")
	private WebElement homeElement;
		
	@FindBy(xpath="(//i[@class='plus inverted icon'])[3]")
	private WebElement addCompanyButton;
		
	@FindBy(xpath="(//i[@class='plus inverted icon'])[2]")
	private WebElement createContactButton;
	
	@FindBy(xpath="(//i[@class='plus inverted icon'])[1]")
	private WebElement addCalenderButton;
	
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	@FindBy(xpath="")
//	private WebElement ;
	
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
	
	

}
