package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tablets 
{
	@FindBy(xpath="//legend[normalize-space()='Deals']")
	private WebElement deals;
	
	@FindBy(xpath="//label[@for='mat-checkbox-1-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement deals_NewCBox;
	
	@FindBy(xpath="//label[@for='mat-checkbox-2-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement deals_SpecialOfferCBox;
	
	@FindBy(xpath="//legend[normalize-space()='Brands']")
	private WebElement brands;
	
	@FindBy(xpath="//label[@for='mat-checkbox-3-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement brands_Alcatel;
	
	@FindBy(xpath="//label[@for='mat-checkbox-4-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement brands_Aplle;
	
	@FindBy(xpath="//label[@for='mat-checkbox-5-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement brands_Samsung;
	
	@FindBy(xpath="//label[@for='mat-checkbox-6-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement brands_TMobile;
	
	@FindBy(xpath="//label[@for='mat-checkbox-7-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement brands_TCL;
	
	@FindBy(xpath="//span[@class='mat-content ng-tns-c113-18']")
	private WebElement operatingSystem;
	
	@FindBy(xpath="//label[@for='mat-checkbox-8-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement OS_Android;
	
	@FindBy(xpath="//label[@for='mat-checkbox-9-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement OS_IPad;
	
	@FindBy(xpath="//label[@for='mat-checkbox-10-input']//span[@class='mat-checkbox-inner-container']")
	private WebElement OS_Other;
	
	public Tablets(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getDeals() {
		return deals;
	}

	public WebElement getDeals_NewCBox() {
		return deals_NewCBox;
	}

	public WebElement getDeals_SpecialOfferCBox() {
		return deals_SpecialOfferCBox;
	}

	public WebElement getBrands() {
		return brands;
	}

	public WebElement getBrands_Alcatel() {
		return brands_Alcatel;
	}

	public WebElement getBrands_Aplle() {
		return brands_Aplle;
	}

	public WebElement getBrands_Samsung() {
		return brands_Samsung;
	}

	public WebElement getBrands_TMobile() {
		return brands_TMobile;
	}

	public WebElement getBrands_TCL() {
		return brands_TCL;
	}

	public WebElement getOperatingSystem() {
		return operatingSystem;
	}

	public WebElement getOS_Android() {
		return OS_Android;
	}

	public WebElement getOS_IPad() {
		return OS_IPad;
	}

	public WebElement getOS_Other() {
		return OS_Other;
	}
	
	
	public void selectFilter(String deals,String deals_New,String deals_SpecialOff) {
		
	}
	
	
	
	
	

}
