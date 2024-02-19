package broken_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks 
{
	@Test
	public void test() {
		
	}
	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = 0;
		for(WebElement ele:links) {
			System.out.println(ele.getAttribute("href"));
			count++;
		}
		System.out.println(count);
		
		for(WebElement ele:links) {
			String href=ele.getAttribute("href");
			if(href != null && !href.isEmpty()) {
				try {
					URL url=new URL(href);
					HttpURLConnection connection=(HttpURLConnection) url.openConnection();
					connection.setRequestMethod("GET");
					connection.connect();
					
					int statusCode=connection.getResponseCode();
					if(statusCode>=400) {
						System.out.println("Broken link: "+href+"(Status code: "+statusCode+")");
					}

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error vonnection to: "+href);
					e.printStackTrace();
				}
			}
		}
		driver.quit();
	}

}











