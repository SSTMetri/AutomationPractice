package pom_cogmento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	//Generic Library
	public void login(String mail,String pwd) {
		email.sendKeys(mail);
		password.sendKeys(pwd);
		login.click();
	}
		
	
}
