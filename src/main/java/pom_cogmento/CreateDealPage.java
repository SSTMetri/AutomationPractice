package pom_cogmento;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericUtilityNew.JavaUtility;

public class CreateDealPage 
{
	JavaUtility rNum=new JavaUtility();
	int random=rNum.getRandomNumber();
	
	@FindBy(xpath="//label[normalize-space()='Access']")
	private WebElement randomElement;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement titelTextField;
	
	@FindBy(xpath="//div[@class='ui fluid selection dropdown']")
	private WebElement assignDrop;
	
	@FindBy(xpath="//div[@class='visible menu transition']//div[@role='option']")
	private WebElement selectAssignclickElement;
	
	@FindBy(xpath="//div[@name='company']")
	private WebElement companyDrop;
	
	@FindBy(xpath="//div[@class='visible menu transition']//div")
	private List<WebElement> listCompany;
	
	@FindBy(xpath="//div[@name='contacts']")
	private WebElement contactTextField;
	
	@FindBy(xpath="//div[@class='visible menu transition']")
	private List<WebElement> contactsList;
	
	@FindBy(xpath="//input[@class='calendarField react-datepicker-ignore-onclickoutside']")
	private WebElement dateTextField;
	
	@FindBy(xpath="(//div[@aria-label='Choose Friday, 23 February 2024'])[1]")
	private WebElement selectDate;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionTextField;
	
	@FindBy(xpath="//i[@class='save icon']")
	private WebElement saveButton;
	
	public CreateDealPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public JavaUtility getrNum() {
		return rNum;
	}

	public int getRandom() {
		return random;
	}

	public WebElement getRandomElementDealPage() {
		return randomElement;
	}

	public WebElement getTitelTextField() {
		return titelTextField;
	}

	public WebElement getAssignDrop() {
		return assignDrop;
	}

	public WebElement getSelectAssignclickElement() {
		return selectAssignclickElement;
	}

	public WebElement getCompanyDrop() {
		return companyDrop;
	}

	public List<WebElement> getListCompany() {
		return listCompany;
	}

	public WebElement getContactTextField() {
		return contactTextField;
	}

	public List<WebElement> getContactsList() {
		return contactsList;
	}

	public WebElement getDateTextField() {
		return dateTextField;
	}

	public WebElement getSelectDate() {
		return selectDate;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createDealPageFillDetails(String giveTitle,String companyName
			,String giveContact,String desciption) {
		titelTextField.sendKeys(giveTitle);
		assignDrop.click();
		selectAssignclickElement.click();
//		System.out.println(selectAssignclickElement.getText());
//		companyDrop.sendKeys(companyName);
//		System.out.println(companyDrop.getText());
//		for(WebElement ele:listCompany) {
//			String comp = ele.getText();
//			if(comp.contains(companyName)) {
//				System.out.println(comp);
//				ele.click();
//				break;
//			}
//		}
//		contactTextField.sendKeys(giveContact);
//		for(WebElement ele:contactsList) {
//			String comp = ele.getText();
//			if(comp.contains(giveContact)) {
//				ele.click();
//				break;
//			}
//		}
//		dateTextField.click();
//		selectDate.click();
		descriptionTextField.sendKeys(desciption);
		saveButton.click();
	}
}
