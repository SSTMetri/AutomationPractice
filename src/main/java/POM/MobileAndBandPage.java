package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileAndBandPage {

    @FindBy(xpath="//label[@for='mat-checkbox-10-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement apple;
    
    @FindBy(xpath="//label[@for='mat-checkbox-11-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement google;
    
    @FindBy(xpath="//label[@for='mat-checkbox-12-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement motorola;
    
    @FindBy(xpath="//label[@for='mat-checkbox-13-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement nokia;
    
    @FindBy(xpath="//label[@for='mat-checkbox-14-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement onePlus;
    
    @FindBy(xpath="//label[@for='mat-checkbox-15-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement samsung; // Corrected name
    
    @FindBy(xpath="//label[@for='mat-checkbox-16-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement sonim;
    
    @FindBy(xpath="//label[@for='mat-checkbox-17-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement tMobile;
    
    @FindBy(xpath="//label[@for='mat-checkbox-18-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement tcl;
    
    @FindBy(xpath="//mat-panel-title[@data-flk-success='atNodeInserted1']//legend[normalize-space()='Deals']")
    private WebElement deals;
    
    @FindBy(xpath="//label[@for='mat-checkbox-19-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement trade_g;
    
    @FindBy(xpath="//label[@for='mat-checkbox-20-input']/span[@class='mat-checkbox-inner-container']")
    private WebElement free;
    
    @FindBy(xpath="//label[@for='mat-checkbox-21-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement newBrand;
    
    @FindBy(xpath="//label[@for='mat-checkbox-22-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement special_offer;
    
    @FindBy(xpath="//label[@for='mat-checkbox-23-input']//span[@class='mat-checkbox-inner-container']")
    private WebElement zero_down;

    public MobileAndBandPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public WebElement getApple() {
		return apple;
	}
    
    public WebElement getGoogle() {
		return google;
	}

	public WebElement getMotorola() {
		return motorola;
	}

	public WebElement getNokia() {
		return nokia;
	}
	
	public WebElement getOnePlus() {
		return onePlus;
	}
	
	public WebElement getSamsung() {
		return samsung;
	}

	public WebElement getSonim() {
		return sonim;
	}

	public WebElement gettMobile() {
		return tMobile;
	}

	public WebElement getTcl() {
		return tcl;
	}
	
	public WebElement getBrand() {
		return deals;
	}

	public WebElement getTrade_g() {
		return trade_g;
	}

	public void setTrade_g(WebElement trade_g) {
		this.trade_g = trade_g;
	}

	public WebElement getFree() {
		return free;
	}

	public void setFree(WebElement free) {
		this.free = free;
	}

	public WebElement getNewBrand() {
		return newBrand;
	}

	public void setNewBrand(WebElement newBrand) {
		this.newBrand = newBrand;
	}

	public WebElement getSpecial_offer() {
		return special_offer;
	}

	public void setSpecial_offer(WebElement special_offer) {
		this.special_offer = special_offer;
	}

	public WebElement getZero_down() {
		return zero_down;
	}

	public void setZero_down(WebElement zero_down) {
		this.zero_down = zero_down;
	}

	public void selectCheckBoxes(String section,String... checkBoxNames) {
        if (checkBoxNames.length == 1 && checkBoxNames[0].equals("all")) {
            selectAllCheckBoxes();
        } else {
            for (String checkBoxName : checkBoxNames) {
                selectCheckBox(checkBoxName);
            }
        }
        
        //Check whether deals is visible or not
        if(trade_g.isDisplayed()) {
        	System.out.println("Deals displayed");
        }
        else {
        	System.out.println("Clicking of deals");
        	deals.click();
        }
        System.out.println("Click on web element");
        WebElement element=dealsCheckBox(section);
        element.click();
        
    }
	
	public WebElement dealsCheckBox(String dealName) {
        switch (dealName) {
        case "trade_5G":
            return trade_g;
        case "free":
        	return free;
        case "newBrand":
        	return newBrand;
        case "special_offer":
        	return special_offer;
        case "zero_down":
        	return zero_down;
        default:
            throw new IllegalArgumentException("Invalid checkbox name: " + dealName);
        }		
	}

    public void selectCheckBox(String checkBoxName) {
        WebElement checkbox = getCheckbox(checkBoxName);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        System.out.println("Selected checkbox: " + checkBoxName);
    }

    public void selectAllCheckBoxes() {
        selectCheckBox("apple");
        selectCheckBox("google");
        selectCheckBox("motorola");
        selectCheckBox("nokia");
        selectCheckBox("onePlus");
        selectCheckBox("samsung");
        selectCheckBox("sonim");
        selectCheckBox("tMobile");
        selectCheckBox("tcl");
        System.out.println("Selected all checkboxes");
    }

    private WebElement getCheckbox(String checkBoxName) {
        switch (checkBoxName) {
            case "apple":
                return apple;
            case "google":
                return google; 
            case "motorola":
                return motorola;
            case "nokia":
                return nokia;
            case "onePlus":
                return onePlus;
            case "samsung":
                return samsung;
            case "sonim":
                return sonim;
            case "tMobile":
                return tMobile;
            case "tcl":
                return tcl;
            default:
                throw new IllegalArgumentException("Invalid checkbox name: " + checkBoxName);
        }
    }
}


