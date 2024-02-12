package broken_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Image 
{
	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Broken Images']")).click();
		List<WebElement> links = driver.findElements(By.tagName("img"));
		
		List<String> brokenImages=new ArrayList<>();
		for(WebElement ele:links) {
			String src=ele.getAttribute("src");
			if(src != null && !src.isEmpty()) {
				try {
					URL url=new URL(src);
					HttpURLConnection connection=(HttpURLConnection) url.openConnection();
					connection.setRequestMethod("GET");
					connection.connect();
					
					int statusCode=connection.getResponseCode();
					if(statusCode !=200) {
						brokenImages.add(src);
						System.out.println("Broken link found: "+src+"(Status code: "+statusCode+")");
					}
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
//		if(!brokenImages.isEmpty()) {
//			System.out.println("Broken images found");
//			for(String st:brokenImages) {
//				System.out.println(st);
//			}
//		}
//		else {
//			System.out.println("No broken images");
//		}
		driver.quit();
	}

}
