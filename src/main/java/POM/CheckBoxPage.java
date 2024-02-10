package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage 
{
	@FindBy(id="mat-checkbox-10-input")
	private WebElement apple;
	@FindBy(id="mat-checkbox-11-input")
	private WebElement google;
	@FindBy(id="mat-checkbox-12-input")
	private WebElement motorola;
	@FindBy(id="mat-checkbox-13-input")
	private WebElement nokia;
	@FindBy(id="mat-checkbox-14-input")
	private WebElement onePlus;
	@FindBy(id="mat-checkbox-15-input")
	private WebElement smasung;
	@FindBy(id="mat-checkbox-16-input")
	private WebElement sonim;
	@FindBy(id="mat-checkbox-17-input")
	private WebElement tMobile;
	@FindBy(id="mat-checkbox-18-input")
	private WebElement tcl;
	
	public CheckBoxPage(WebDriver driver) {
//		PageFactory.initElements(driver,this);
		PageFactory.initElements(driver,this);

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

	public WebElement getSmasung() {
		return smasung;
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
	
	//Business library
	public void selectCheckBoxes(String... checkBoxNames) {
        if (checkBoxNames.length == 1 && checkBoxNames[0].equals("all")) 
        {
            selectAllCheckBoxes();
        }
        else 
        {
            for (String checkBoxName : checkBoxNames) 
            {
                selectCheckBox(checkBoxName);
            }
        }
    }
	
    public void selectCheckBox(String checkBoxName) {
        // Code to select the checkbox with the given name
        System.out.println("Selected checkbox: " + checkBoxName);
        if(checkBoxName.equals("apple")) {
        	apple.click();
        }
        else if(checkBoxName.equals("google")) {
        	google.click();
        }
        else if(checkBoxName.equals("motorola")) {
        	motorola.click();
        }
        else if(checkBoxName.equals("nokia")) {
        	nokia.click();
        }
        else if(checkBoxName.equals("onePlus")) {
        	onePlus.click();
        }
        else if(checkBoxName.equals("smasung")) {
        	smasung.click();
        }
        else if(checkBoxName.equals("sonim")) {
        	sonim.click();
        }
        else if(checkBoxName.equals("tMobile")) {
        	tMobile.click();
        }
        else if(checkBoxName.equals("tcl")) {
        	tcl.click();
        }
    }

    public void selectAllCheckBoxes() {
        // Code to select all checkboxes
        apple.click();
        google.click();
        motorola.click();
        nokia.click();
        onePlus.click();
        smasung.click();
        sonim.click();
        tMobile.click();
        tcl.click();
        System.out.println("Selected all checkboxes");

    }
	

	
	
}
