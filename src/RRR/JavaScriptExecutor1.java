package RRR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
										//********Not executed properly**********//
public class JavaScriptExecutor1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//If in the this direct link text is not working the if we need to scroll to that particular word
		//Then we should use JavascriptExecutor
	//driver.findElement(By.linkText("MVNRepository")).click();
		
		WebElement ele=driver.findElement(By.xpath("//a[.='Ecosystem page']"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		//je.executeScript("window.scrollBy(x,y)");
		//je.executeScript("arguments[0].click();",ele);
		//je.executeScript("document.getElementById('un')='jam'");
		ele.click();
		
	}

}
