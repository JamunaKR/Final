package RRR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {
							//Handling inner iFrames
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement f1=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		f1.click();	
		
		//since no id and name attributes are present we hav to go for webelement
		WebElement outer=driver.findElement(By.xpath("//*[@id='Multiple']/iframe")); //Outer frame
		driver.switchTo().frame(outer);
		
		WebElement inner=driver.findElement(By.xpath("/html/body/section/div/div/iframe")); //Inner frame
		driver.switchTo().frame(inner);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Java-Sel");
	}
}
