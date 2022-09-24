package RRR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//here we should use explicit wait to run this
		
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement inp1=driver.findElement(By.name("inputText1"));
		WebElement inp2=driver.findElement(By.name("inputText2"));
		
		inp1.sendKeys("Welcome to Selenium123");
		
		Actions act = new Actions(driver);
		
		// ctrl + a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//ctrl + c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB shift to input box 2
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//ctrl + v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Compare text
		if(inp1.getAttribute("value").equals(inp2.getAttribute("value"))) {
			System.out.println("text copied");
		}
		
		else {
			System.out.println("text not copied");
		}
	}

}
