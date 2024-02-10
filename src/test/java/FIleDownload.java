import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FIleDownload 
{
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		
		driver.get("https://www.jenkins.io/download/thank-you-downloading-windows-installer-stable/");
		
		String downloadPath="Users\\metri\\Eclips_MyWorkSpace\\GitCodes\\Download";
		String fileName="jenkins.jar";
		
		File file=new File(downloadPath,fileName);
		
		FluentWait<File> wait=new FluentWait<File>(file)
				.withTimeout(Duration.ofMinutes(5))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class)
				.withMessage("File not downloaded");
		
		try {
		boolean isDownloaded=wait.until(new Function<File, Boolean>() {
			@Override
			public Boolean apply(File f) {
				return f.exists() && f.canRead();
			}
		}
		);
		if(isDownloaded) {
			System.out.println("COmplete");
		} 
		} 
		catch (Exception e) {
			System.out.println("InComplete");
		}
		
		
		
	}

}
