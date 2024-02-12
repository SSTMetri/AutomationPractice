package broken_links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewPoint 
{
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		int[][] arr= {{1024,762},{768,1024},{375,667},{414,896}};
		for(int i=0;i<arr.length;i++) {
			Dimension d=new Dimension(arr[i][0],arr[i][1]);
			driver.manage().window().setSize(d);
		}
	}

}
