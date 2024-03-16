package pomRedBus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.jdbc.Driver;

public class RedBusPage 
{
	WebDriver driver;
	@FindBy(css="div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(2)")
	private WebElement monthYear;
	
	@FindBy(css="div[class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'] div:nth-child(3)")
	private WebElement nextButton;
	
	public RedBusPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getMonthYear() {
		return monthYear;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	
	public void redBusBusinessLibrary(String PassMonthYear) {
	    boolean present = false;
	    String textMonthY = "";
	    for (;;) {
	        try {
	            textMonthY = monthYear.getText();
	            System.out.println(textMonthY);

	            // Check if the current month and year match the desired month and year
	            if (textMonthY.equals(PassMonthYear)) {
	                present = true;
	                System.out.println("Inside the loop");
	                break; // Break the loop if the desired month and year are found
	            }

	            WebElement element = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][contains(., '"+PassMonthYear+"')]"));
//	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][contains(., '"+PassMonthYear+"')]")));

	            if (element.isDisplayed()) {
	                present = true;
	                System.out.println("Inside the loop");
	                break; // Break the loop if element is present
	            }
	        } catch (Exception e) {
	            nextButton.click();
	        }
	    }
	    if (present) {
	        // Print textMonthY after loop completion
	        System.out.println("Text month and year: " + textMonthY);

	        // Get all holiday dates
	        System.out.println("Get all holiday dates");
	    }
	}

	
	/*
	public void redBusBusinessLibrary(String PassMonthYear) {
		boolean present=false;
		String textMonthY="";
		for(;;) {
			
			try {
				textMonthY=monthYear.getText();
				System.out.println(textMonthY);
				
				WebElement element = driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][contains(., '"+PassMonthYear+"')]"));
				if (element.isDisplayed()) {
					present = true;
					System.out.println("Inside the loop");
					break; // Break the loop if element is present
					}
			}
			catch(Exception e) {
				nextButton.click();
			}
	        if (present) {
	            // Print textMonthY after loop completion
	            System.out.println("Text month and year: " + textMonthY);

	            // Get all holiday dates
	            System.out.println("Get all holiday dates");
	        }
		}
		}*/

}
