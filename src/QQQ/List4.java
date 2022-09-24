package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class List4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		WebElement past=driver.findElement(By.xpath("//span[.='Paste']"));
		act.contextClick(past).perform();
		//Alert is missing
			String pas=past.getText();
			System.out.println("Copy the text"+pas);
		
	}
}
