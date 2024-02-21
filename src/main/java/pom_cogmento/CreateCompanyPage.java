package pom_cogmento;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityNew.WebDriverUtility;

public class CreateCompanyPage extends WebDriverUtility {
	
	@FindBy(xpath="//label[text()='Access']")
	private WebElement random;
	//Move to random element
	
	@FindBy(xpath="//div[@class='ui right corner labeled input']/input[@name='name']")
	private WebElement companyName;
	
	@FindBy(xpath="//input[@name='url']")
	private WebElement webSiteURL;
	
	@FindBy(xpath="//div[@class='four fields']//input[@class='search']")
	private WebElement country;
	
	@FindBy(xpath="//div[@class='visible menu transition']//div[@style='pointer-events: all;']")
	private List<WebElement> countriesList;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	private WebElement number;
	
	@FindBy(xpath="//input[@placeholder='Home, Work, Mobile...']")
	private WebElement homeNumber;
	
	@FindBy(xpath="//div[@class='ui active visible fluid multiple search selection dropdown']")
	private WebElement tags;
	
	@FindBy(xpath="//div[@name='channel_type']")
	private WebElement socialMediaLink;
	
	@FindBy(xpath="//div[@class='three fields']//div[@class='ui field']//div[3]")
	private WebElement linkedInClick;
	
	@FindBy(xpath="//div[@class='three fields']//div[@class='ui field']//div[1]")
	private WebElement twitterClick;
	
	@FindBy(xpath="//div[@class='three fields']//div[@class='ui field']//div[2]")
	private WebElement facebookClick;
	
	@FindBy(xpath="//div[@class='three fields']//div[@class='ui field']//div[4]")
	private WebElement tictokClick;
	
	@FindBy(xpath="//div[@class='three fields']//div[@class='ui field']//div[5]")
	private WebElement instagramClick;
	
	@FindBy(xpath="//input[@placeholder='LinkedIn profile link']")
	private WebElement linkedinTextField;
	
	@FindBy(xpath="//input[@placeholder='Twitter handle']")
	private WebElement twitterTextField;
	
	@FindBy(xpath="//input[@placeholder='Facebook profile link']")
	private WebElement facebookTextField;
	
	@FindBy(xpath="//input[@placeholder='Tiktok user']")
	private WebElement tictokTextField;
	
	@FindBy(xpath="//input[@placeholder='Instagram user']")
	private WebElement instagramTextField;
	
	@FindBy(xpath="//input[@name='num_employees']")
	private WebElement numOfEmployeesTextField;
	
	@FindBy(xpath="//input[@name='annual_revenue']")
	private WebElement anualRevenueTextField;
	
	@FindBy(xpath="(//div[@name='status'])[1]")
	private WebElement statusDropDown;
	
	@FindBy(xpath="//span[normalize-space()='New']")
	private WebElement newOption;
	
	@FindBy(xpath="//span[normalize-space()='Active']")
	private WebElement activeOption;
	
	@FindBy(xpath="//span[normalize-space()='Inactive']")
	private WebElement inactiveOption;
	
	@FindBy(xpath="//span[normalize-space()='On Hold']")
	private WebElement onHoldOption;
	
	@FindBy(xpath="//span[normalize-space()='Terminated']")
	private WebElement terminatedOption;
	
	@FindBy(xpath="//span[normalize-space()='Hot']")
	private WebElement hotOption;
	
	@FindBy(xpath="(//div[@name='category'])[1]")
	private WebElement categoryDropDown;
	
	@FindBy(xpath="//span[normalize-space()='Client']")
	private WebElement clientCategoryOption;
	
	@FindBy(xpath="//div[@name='category']//span[@class='text'][normalize-space()='Partner']")
	private WebElement patternCategoryOption;
	
	@FindBy(xpath="//span[normalize-space()='Prospect']")
	private WebElement prospectCategoryOption;
	
	@FindBy(xpath="//input[@name='identifier']")
	private WebElement identifier;
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	private WebElement streetAddressTextField;
	
	@FindBy(xpath="//input[@placeholder='City']")
	private WebElement cityTextField;
	
	@FindBy(xpath="//input[@placeholder='State / County']")
	private WebElement stateOrCountryTextField;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	private WebElement postCodeTextField;
	
	@FindBy(xpath="//div[@class='ui field']//div[@name='country']//input[@aria-autocomplete='list']")
	private WebElement addressSendKeysIndia;
	
	@FindBy(xpath="//div[@class='visible menu transition']//div[@role='option']/i/following-sibling::span")
	private List<WebElement> addressListOfCountries;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@placeholder='Personal email, Business, Alt...']")
	private WebElement personalEmailTextField;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionField;
	
	@FindBy(xpath="//input[@name='industry']")
	private WebElement industryTextField;
	
	@FindBy(xpath="//input[@name='symbol']")
	private WebElement staockSymbolTextField;
	
	@FindBy(xpath="(//div[@name='priority'])[1]")
	private WebElement priorityDropDown;
	
	@FindBy(xpath="//span[normalize-space()='Low']")
	private WebElement priorityLowSelect;
	
	@FindBy(xpath="//span[normalize-space()='Medium']")
	private WebElement priorityMediumSelect;
	
	@FindBy(xpath="//span[normalize-space()='High']")
	private WebElement priorityHighSelect;
	
	@FindBy(xpath="//input[@name='vat_number']")
	private WebElement vatNuberTextField;
	
//	@FindBy(xpath="")
//	private WebElement sourceDropDown;
	
	public CreateCompanyPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getRandom() {
		return random;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getWebSiteURL() {
		return webSiteURL;
	}

	public WebElement getCountry() {
		return country;
	}

	public List<WebElement> getCountriesList() {
		return countriesList;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getHomeNumber() {
		return homeNumber;
	}

	public WebElement getTags() {
		return tags;
	}

	public WebElement getSocialMediaLink() {
		return socialMediaLink;
	}

	public WebElement getLinkedInClick() {
		return linkedInClick;
	}

	public WebElement getTwitterClick() {
		return twitterClick;
	}

	public WebElement getFacebookClick() {
		return facebookClick;
	}

	public WebElement getTictokClick() {
		return tictokClick;
	}

	public WebElement getInstagramClick() {
		return instagramClick;
	}

	public WebElement getLinkedinTextField() {
		return linkedinTextField;
	}

	public WebElement getTwitterTextField() {
		return twitterTextField;
	}

	public WebElement getFacebookTextField() {
		return facebookTextField;
	}

	public WebElement getTictokTextField() {
		return tictokTextField;
	}

	public WebElement getInstagramTextField() {
		return instagramTextField;
	}

	public WebElement getNumOfEmployeesTextField() {
		return numOfEmployeesTextField;
	}

	public WebElement getAnualRevenueTextField() {
		return anualRevenueTextField;
	}

	public WebElement getStatusDropDown() {
		return statusDropDown;
	}

	public WebElement getNewOption() {
		return newOption;
	}

	public WebElement getActiveOption() {
		return activeOption;
	}

	public WebElement getInactiveOption() {
		return inactiveOption;
	}

	public WebElement getOnHoldOption() {
		return onHoldOption;
	}

	public WebElement getTerminatedOption() {
		return terminatedOption;
	}

	public WebElement getHotOption() {
		return hotOption;
	}

	public WebElement getCategoryDropDown() {
		return categoryDropDown;
	}

	public WebElement getClientCategoryOption() {
		return clientCategoryOption;
	}

	public WebElement getPatternCategoryOption() {
		return patternCategoryOption;
	}

	public WebElement getProspectCategoryOption() {
		return prospectCategoryOption;
	}

	public WebElement getIdentifier() {
		return identifier;
	}

	public WebElement getStreetAddressTextField() {
		return streetAddressTextField;
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

	public WebElement getAddressSendKeysIndia() {
		return addressSendKeysIndia;
	}

	public List<WebElement> getAddressListOfCountries() {
		return addressListOfCountries;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPersonalEmailTextField() {
		return personalEmailTextField;
	}

	public WebElement getDescriptionField() {
		return descriptionField;
	}

	public WebElement getIndustryTextField() {
		return industryTextField;
	}

	public WebElement getStaockSymbolTextField() {
		return staockSymbolTextField;
	}

	public WebElement getPriorityDropDown() {
		return priorityDropDown;
	}

	public WebElement getPriorityLowSelect() {
		return priorityLowSelect;
	}

	public WebElement getPriorityMediumSelect() {
		return priorityMediumSelect;
	}

	public WebElement getPriorityHighSelect() {
		return priorityHighSelect;
	}

	public WebElement getVatNuberTextField() {
		return vatNuberTextField;
	}
	
	public void createCompany(String comapanyName,String webSite,String countrySendKey,String phoneNumber
			,String homeNum,String social
			,String socialURL
			,String numOfEmp
			,String revenue
			,String address
			,String city
			,String state
			,String postalCode
			,String pEmail
			,String homeEmail
			,String desciption
			,String industry
			,String symbol
			,String givenPriority) {
		companyName.sendKeys(comapanyName);
		webSiteURL.sendKeys(webSite);
		country.sendKeys(countrySendKey);
		
		for(WebElement c:countriesList) {
			String contactCountryName=c.getText();
			System.out.println(contactCountryName);
			if(contactCountryName.equalsIgnoreCase(countrySendKey)) {
				c.click();
			}
		}
		number.sendKeys(phoneNumber);
		homeNumber.sendKeys(homeNum);
		socialMediaLink.click();
		WebElement clickableLink = selectFromDropdown(social);
		clickableLink.click();
		
		WebElement socialTextFirld = sendSocialMediaURL(social);
		socialTextFirld.sendKeys(socialURL);
		numOfEmployeesTextField.sendKeys(numOfEmp);
		anualRevenueTextField.sendKeys(revenue);
		
		//Address, City, State/Country, Postal code
		streetAddressTextField.sendKeys(address);;
		cityTextField.sendKeys(city);
		stateOrCountryTextField.sendKeys(state);
		postCodeTextField.sendKeys(postalCode);
		
		//Address country
		addressSendKeysIndia.sendKeys(countrySendKey);
		for(WebElement ele:addressListOfCountries) {
			String countryName = ele.getText();
			System.out.println(countryName);
			if(countryName.equalsIgnoreCase(countrySendKey)) {
				ele.click();
			}
		}
		emailTextField.sendKeys(pEmail);
		personalEmailTextField.sendKeys(homeEmail);
		descriptionField.sendKeys(desciption);
		industryTextField.sendKeys(industry);
		staockSymbolTextField.sendKeys(symbol);
		priorityDropDown.click();
		
		WebElement prio = selectPriority(givenPriority);
		prio.click();

	}
	
	public void bottomFieldsOfCompany(String sendStatus,String category
			,String identiy,String vatNum) {
		statusDropDown.click();
		WebElement statusLink = statusSelect(sendStatus);
		statusLink.click();
		
		categoryDropDown.click();
		WebElement categ = selectCategory(category);
		categ.click();
		
		identifier.sendKeys(identiy);
		
		vatNuberTextField.sendKeys(vatNum);
		
		
		
		
	}
	
	public WebElement selectCategory(String category) {
		switch (category) {
        case "Client":
       	 return clientCategoryOption;
        case "Partner":
          	 return patternCategoryOption;
        case "Prospect":
          	 return prospectCategoryOption;
        default:
            throw new IllegalArgumentException("Invalid priority :"+category);
		}
	}
	
	public WebElement selectPriority(String priority) {
		switch (priority) {
        case "Low":
       	 return priorityLowSelect;
        case "Medium":
          	 return priorityMediumSelect;
        case "High":
          	 return priorityHighSelect;
        default:
            throw new IllegalArgumentException("Invalid priority :"+priority);
		}
	}
	
	public WebElement statusSelect(String sendStatus) {
		 switch (sendStatus) {
         case "New":
             return newOption;
         case "Active":
             return activeOption;
         case "Inactive":
        	 return inactiveOption;
         case "OnHold":
        	 return onHoldOption;
         case "Hot":
        	 return hotOption;
         default:
             throw new IllegalArgumentException("Invalid status name :"+sendStatus);
		 }
	}
	
	public WebElement selectFromDropdown(String socialMName) {
		 switch (socialMName) {
         case "LinkedIn":
             return linkedInClick;
         case "Facebook":
             return facebookClick;
         case "Tictok":
        	 return tictokClick;
         case "Instagram":
        	 return instagramClick;
         case "Twitter":
        	 return twitterClick;
         default:
             throw new IllegalArgumentException("Invalid social media name: "+socialMName);
		 }
		
	}
	
	public WebElement sendSocialMediaURL(String socialMName) {
		 switch (socialMName) {
         case "LinkedIn":
             return linkedinTextField;
         case "Facebook":
             return facebookTextField;
         case "Tictok":
        	 return tictokTextField;
         case "Instagram":
        	 return instagramTextField;
         case "Twitter":
        	 return twitterTextField;
         default:
             throw new IllegalArgumentException("Invalid social media name: "+socialMName);
		 }
	}
	
	
	
	
	
	
	
	
	
	

}
