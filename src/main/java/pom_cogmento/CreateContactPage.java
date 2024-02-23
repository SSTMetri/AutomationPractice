package pom_cogmento;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage 
{
	@FindBy(xpath="//label[normalize-space()='Last Name']")
	private WebElement randomElement;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@name='middle_name']")
	private WebElement middleNameTextField;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//div[@name='company']//input[@type='text']")
	private WebElement companyNameTextField;
	
	@FindBy(xpath="//div[@class='visible menu transition']//div")
	private List<WebElement> companiesAutosuggestDrop;
	
	@FindBy(xpath="//input[@placeholder='Personal email, Business, Alt...']")
	private WebElement personalEmailTextField;
	
	@FindBy(xpath="(//div[@name='status'])[1]")
	private WebElement statusDropElement;
	
	@FindBy(xpath="//span[normalize-space()='New']")
	private WebElement newStatusDrop;
	
	@FindBy(xpath="//span[normalize-space()='Active']")
	private WebElement activeStatusDrop;
	
	@FindBy(xpath="//span[normalize-space()='Inactive']")
	private WebElement inactiveStatusDrop;
	
	@FindBy(xpath="//span[normalize-space()='On Hold']")
	private WebElement onHoldStatusDrop;
	
	@FindBy(xpath="//span[normalize-space()='Terminated']")
	private WebElement terminatedStatusDrop;
	
	@FindBy(xpath="//span[normalize-space()='Hot']")
	private WebElement hotStatusDrop;
	
	@FindBy(xpath="//div[@name='category']//div[@role='alert'][normalize-space()='Select']")
	private WebElement categoryDropButton;
	
	@FindBy(xpath="//span[normalize-space()='Lead']")
	private WebElement leadCategoryDrop;
	
	@FindBy(xpath="//span[normalize-space()='Customer']")
	private WebElement customerCategoryDrop;
	
	@FindBy(xpath="//span[normalize-space()='Contact']")
	private WebElement contactCategoryDrop;
	
	@FindBy(xpath="//span[normalize-space()='Affiliate']")
	private WebElement affiliateCategoryDrop;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionTextField;
	
	@FindBy(xpath="//div[@name='channel_type']")
	private WebElement socialChannelDropButton;
	
	@FindBy(xpath="//span[normalize-space()='Twitter']")
	private WebElement socialChannelTwitter;
	
	@FindBy(xpath="//div[@class='visible menu transition']//span[@class='text'][normalize-space()='Facebook']")
	private WebElement socialChannelFacebook;
	
	@FindBy(xpath="//span[normalize-space()='LinkedIn']")
	private WebElement socialChannelLinkedIn;
	
	@FindBy(xpath="//span[normalize-space()='TikTok']")
	private WebElement socialChannelTiktok;
	
	@FindBy(xpath="//span[normalize-space()='Instagram']")
	private WebElement socialChannelInstagram;
	
	@FindBy(xpath="//input[@placeholder='Twitter handle']")
	private WebElement socialChannelTwitterTextField;
	
	@FindBy(xpath="//input[@placeholder='Facebook profile link']")
	private WebElement socialChannelFacebookTextField;
	
	@FindBy(xpath="//input[@placeholder='LinkedIn profile link']")
	private WebElement socialChannelLinkedInTextField;
	
	@FindBy(xpath="//input[@placeholder='Tiktok user']")
	private WebElement socialChannelTiktokTextField;
	
	@FindBy(xpath="//input[@placeholder='Instagram user']")
	private WebElement socialChannelInstagramTextField;
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	private WebElement addressTextField;
	
	@FindBy(xpath="//input[@placeholder='City']")
	private WebElement cityTextField;
	
	@FindBy(xpath="//input[@placeholder='State / County']")
	private WebElement stateOrCountryTextField;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	private WebElement postCodeTextField;
	
	@FindBy(xpath="//div[@name='country']//input[@type='text']")
	private WebElement sendCountryText;
	
	@FindBy(xpath="//div[@class='visible menu transition']//div//span")
	private List<WebElement> countriesList;
	
	@FindBy(xpath="//div[@role='alert']//i[@class='us flag']")
	private WebElement phoneSendKey;
	
	@FindBy(xpath="//div[@class='visible menu transition']//div")
	private List<WebElement> phoneCountriesList;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath="//input[@placeholder='Home, Work, Mobile...']")
	private WebElement homeNumberTextField;
	
	//Position
	@FindBy(xpath="//input[@name='position']")
	private WebElement positionTextField;
	
	@FindBy(xpath="//input[@name='department']")
	private WebElement deptTextField;
	
	@FindBy(xpath="//input[@name='do_not_call']")
	private WebElement donNotClassButton;
	
	@FindBy(xpath="//input[@name='do_not_email']")
	private WebElement doNotEmailButton;
	
	@FindBy(xpath="//input[@name='do_not_text']")
	private WebElement doNotTextButton;
	
	@FindBy(xpath="//input[@name='identifier']")
	private WebElement identifierTextField;
	
	@FindBy(xpath="//input[@placeholder='Day']")
	private WebElement dateDOB;
	
	@FindBy(xpath="//div[@name='month']")
	private WebElement monthDOB;
	
	@FindBy(xpath="//span[normalize-space()='January']")
	private WebElement jan;
	
	@FindBy(xpath="//span[normalize-space()='February']")
	private WebElement feb;
	
	@FindBy(xpath="//span[normalize-space()='March']")
	private WebElement march;
	
	@FindBy(xpath="//span[normalize-space()='April']")
	private WebElement april;
	
	@FindBy(xpath="//span[normalize-space()='May']")
	private WebElement may;
	
	@FindBy(xpath="//span[normalize-space()='June']")
	private WebElement june;
	
	@FindBy(xpath="//span[normalize-space()='July']")
	private WebElement july;
	
	@FindBy(xpath="//span[normalize-space()='August']")
	private WebElement aug;
	
	@FindBy(xpath="//span[normalize-space()='September']")
	private WebElement sept;
	
	@FindBy(xpath="//span[normalize-space()='October']")
	private WebElement october;
	
	@FindBy(xpath="//span[normalize-space()='November']")
	private WebElement november;
	
	@FindBy(xpath="//span[normalize-space()='December']")
	private WebElement december;
	
	@FindBy(xpath="//input[@placeholder='Year']")
	private WebElement yearDOB;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	private WebElement calcelButton;
	
//	@FindBy(xpath="")
//	private WebElement cityTextField;
	
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getRandomElement() {
		return randomElement;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getMiddleNameTextField() {
		return middleNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCompanyNameTextField() {
		return companyNameTextField;
	}

	public List<WebElement> getCompaniesAutosuggestDrop() {
		return companiesAutosuggestDrop;
	}

	public WebElement getPersonalEmailTextField() {
		return personalEmailTextField;
	}

	public WebElement getStatusDropElement() {
		return statusDropElement;
	}

	public WebElement getNewStatusDrop() {
		return newStatusDrop;
	}

	public WebElement getActiveStatusDrop() {
		return activeStatusDrop;
	}

	public WebElement getInactiveStatusDrop() {
		return inactiveStatusDrop;
	}

	public WebElement getOnHoldStatusDrop() {
		return onHoldStatusDrop;
	}

	public WebElement getTerminatedStatusDrop() {
		return terminatedStatusDrop;
	}

	public WebElement getHotStatusDrop() {
		return hotStatusDrop;
	}

	public WebElement getCategoryDropButton() {
		return categoryDropButton;
	}

	public WebElement getLeadCategoryDrop() {
		return leadCategoryDrop;
	}

	public WebElement getCustomerCategoryDrop() {
		return customerCategoryDrop;
	}

	public WebElement getContactCategoryDrop() {
		return contactCategoryDrop;
	}

	public WebElement getAffiliateCategoryDrop() {
		return affiliateCategoryDrop;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSocialChannelDropButton() {
		return socialChannelDropButton;
	}

	public WebElement getSocialChannelTwitter() {
		return socialChannelTwitter;
	}

	public WebElement getSocialChannelFacebook() {
		return socialChannelFacebook;
	}

	public WebElement getSocialChannelLinkedIn() {
		return socialChannelLinkedIn;
	}

	public WebElement getSocialChannelTiktok() {
		return socialChannelTiktok;
	}

	public WebElement getSocialChannelInstagram() {
		return socialChannelInstagram;
	}

	public WebElement getAddressTextField() {
		return addressTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getStateOrCountryTextField() {
		return stateOrCountryTextField;
	}

	public WebElement getPostCodeTextField() {
		return postCodeTextField;
	}

	public WebElement getSendCountryText() {
		return sendCountryText;
	}

	public List<WebElement> getCountriesList() {
		return countriesList;
	}

	public WebElement getPhoneSendKey() {
		return phoneSendKey;
	}

	public List<WebElement> getPhoneCountriesList() {
		return phoneCountriesList;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getHomeNumberTextField() {
		return homeNumberTextField;
	}

	public WebElement getPositionTextField() {
		return positionTextField;
	}

	public WebElement getDeptTextField() {
		return deptTextField;
	}

	public WebElement getDonNotClassButton() {
		return donNotClassButton;
	}

	public WebElement getDoNotEmailButton() {
		return doNotEmailButton;
	}

	public WebElement getDoNotTextButton() {
		return doNotTextButton;
	}

	public WebElement getIdentifierTextField() {
		return identifierTextField;
	}
	
	public void createContact(String firstName,String lastName,String middleName,String email
			,String companyName
			,String personalEmail
			,String giveStatus
			,String givenCategory
			,String description
			,String socialMName
			,String socialChannelUrl
			,String address
			,String city
			,String stateOrCountry
			,String postCOde
			,String country
			,String phoneNum
			,String homeNum) {
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		middleNameTextField.sendKeys(middleName);
		emailTextField.sendKeys(email);
		personalEmailTextField.sendKeys(personalEmail);
		companyNameTextField.sendKeys(companyName);
		
		for(WebElement ele:companiesAutosuggestDrop) {
			String company=ele.getText();
			if(company.contains(companyName)) {
				ele.click();
			}
		}
		statusDropElement.click();
		
		WebElement statusElement = selectStatus(giveStatus);
		statusElement.click();
		
		categoryDropButton.click();
		
		WebElement categoryElement = selectCategory(givenCategory);
		categoryElement.click();
		
		descriptionTextField.sendKeys(description);
		
		socialChannelDropButton.sendKeys(socialMName);
		WebElement socialChannelElel = selectSocialMedia(socialMName);
		socialChannelElel.click();
		
		WebElement socialChannelTextField = selectSocialMediaToSendURL(socialMName);
		socialChannelTextField.sendKeys(socialChannelUrl);
		
		addressTextField.sendKeys(address);
		cityTextField.sendKeys(city);
		stateOrCountryTextField.sendKeys(stateOrCountry);
		postCodeTextField.sendKeys(postCOde);

		phoneNumberTextField.sendKeys(phoneNum);
		homeNumberTextField.sendKeys(homeNum);
	}
	
	public void createContactPageFillDetails(String position,String dept,String identifier,String dateDob
			,String giveMonth,String giveYear,String country) {
		
		sendCountryText.sendKeys(country);
		for(WebElement ele:countriesList) {
			String countryName=ele.getText();
			if(countryName.equalsIgnoreCase(country)) {
				ele.click();
			}
		}
//
//		phoneSendKey.sendKeys(country);
//		for(WebElement ele:phoneCountriesList) {
//			String countryPhone = ele.getText();
//			if(countryPhone.equalsIgnoreCase(country)) {
//				ele.click();
//			}
//		}
		
		positionTextField.sendKeys(position);
		deptTextField.sendKeys(dept);
//		donNotClassButton.click();
//		doNotEmailButton.click();
//		doNotTextButton.click();
		identifierTextField.sendKeys(identifier);
		dateDOB.sendKeys(dateDob);
		monthDOB.click();
		WebElement monthLink = selectMonthOfDOB(giveMonth);
		monthLink.click();
		yearDOB.sendKeys(giveYear);
		saveButton.click();
		
	}
	
	public WebElement selectMonthOfDOB(String giveMonth) {
		switch(giveMonth) {
		case "Jan":
			return jan;
		case "Feb":
			return feb;
		case "March":
			return march;
		case "April":
			return april;
		case "May":
			return may;
		case "June":
			return june;
		case "July":
			return july;
		case "August":
			return aug;
		case "September":
			return sept;
		case "October":
			return october;
		case "November":
			return november;
		case "December":
			return december;
		default:
             throw new IllegalArgumentException("Invalid month name: "+giveMonth);
		}	
	}
	
	public WebElement selectSocialMediaToSendURL(String giveSocialMName) {
		switch(giveSocialMName) {
		case "Twitter":
			return socialChannelTwitterTextField;
		case "Facebook":
			return socialChannelFacebookTextField;
		case "LinkedIn":
			return socialChannelLinkedInTextField;
		case "Tiktok":
			return socialChannelTiktokTextField;
		case "Instagram":
			return socialChannelInstagramTextField;
		default:
             throw new IllegalArgumentException("Invalid social media name: "+giveSocialMName);
		}	
	}
	
	public WebElement selectSocialMedia(String giveSocialMName) {
		switch(giveSocialMName) {
		case "Twitter":
			return socialChannelTwitter;
		case "Facebook":
			return socialChannelFacebook;
		case "LinkedIn":
			return socialChannelLinkedIn;
		case "Tiktok":
			return socialChannelTiktok;
		case "Instagram":
			return socialChannelInstagram;
		default:
             throw new IllegalArgumentException("Invalid social media name: "+giveSocialMName);
		}	
	}
	
	public WebElement selectCategory(String giveCategory) {
		switch(giveCategory) {
		case "Lead":
			return leadCategoryDrop;
		case "Customer":
			return customerCategoryDrop;
		case "Contact":
			return contactCategoryDrop;
		case "Affiliated":
			return affiliateCategoryDrop;
		default:
             throw new IllegalArgumentException("Invalid category name: "+giveCategory);
		}	
	}
	
	public WebElement selectStatus(String giveStatus) {
		switch(giveStatus) {
		case "New":
			return newStatusDrop;
		case "Active":
			return activeStatusDrop;
		case "Inative":
			return inactiveStatusDrop;
		case "OnHold":
			return onHoldStatusDrop;
		case "Terminated":
			return terminatedStatusDrop;
		case "Hot":
			return hotStatusDrop;
		default:
             throw new IllegalArgumentException("Invalid status name: "+giveStatus);
		}	
	}

}
