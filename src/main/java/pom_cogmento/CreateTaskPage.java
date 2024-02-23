package pom_cogmento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTaskPage 
{
	@FindBy(xpath="(//label[normalize-space()='Access'])[1]")
	private WebElement randomElement;
	
	@FindBy(xpath="(//input[@name='title'])[1]")
	private WebElement titleTextField;
	
	@FindBy(xpath="(//div[@class='ui active visible fluid selection dropdown'])[1]")
	private WebElement assignTextField;
	
	@FindBy(xpath="(//span[@class='text'][normalize-space()='soubhagya Metri'])[2]")
	private WebElement assignNameDrop;
	
	@FindBy(xpath="//i[@class='save icon']")
	private WebElement saveButton;
	
	public CreateTaskPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getRandomElement() {
		return randomElement;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getAssignTextField() {
		return assignTextField;
	}

	public WebElement getAssignNameDrop() {
		return assignNameDrop;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createTaskFillDetails(String titleOfTask) {
		titleTextField.sendKeys(titleOfTask);
//		assignTextField.click();
//		assignNameDrop.click();
		saveButton.click();
	}

}
