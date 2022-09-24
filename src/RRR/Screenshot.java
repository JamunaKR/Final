package RRR;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
	//System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/FileDownload.html");
	takescreenshot("demo_page");
	}
	
	public static void takescreenshot(String fileName) throws IOException {
		
	//create reference of screenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	//to get the screenshot //store it in a file format
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	//To create destination
	File dest=new File("F:\\Selenium1\\Final\\src\\RRR"+ fileName +".png");
	//File dest=new File("/F:\\Selenium1\\Final\\src\\RRR/"+ fileName +".jpg"); we get blank page to this jpg format
	
	// now copy the screenshot to the desired location using copyfile method
	Files.copy(src, dest);
	
	driver.close();
	}

}
