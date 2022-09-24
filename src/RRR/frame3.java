package RRR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame3 {
						//Handling Parent and Child frames
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");
		
		driver.switchTo().frame(0);
		//1) driver.findElement(By.xpath("/html/body/iframe")).getText(); 
		//Didn't work if i consider the frame, should only consider the text path for the text to display.
		//2)
		String child=driver.findElement(By.xpath("//h1[contains(.,'This page is displayed in an iframe')]")).getText();
		System.out.println("the Child frame text is: "+child);
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent(); if we use this method, the below statements will not be executed
		String parent=driver.findElement(By.xpath(
		"//p[contains(.,'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
		System.out.println("The parent frame text is:" +parent);
	}

}
