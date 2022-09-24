package RRR;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot2 {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		takescreenshot("facebook_loginPage");
	}
	
	public static void takescreenshot(String filename) throws IOException {
		
		//To create ref to screenshot:
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//To get the screenshot
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//To create destination to store the screenshot
		File dest=new File("/F:\\Selenium1\\Final\\src\\RRR/"+filename+".png");
		
		//To copy the screenshot to dest
		Files.copy(src, dest);
		
		driver.close();

	}

}
