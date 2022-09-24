/**
 * 
 */
package TTT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author RiChi
 *
 *	This class will store all the locators and methods of Login Page
 */
public class EncaPom2_LoginPage {
	By username=By.id("usernameOrEmail");
	By login=By.xpath("//button[@type='submit']");
	
	WebDriver driver;//4
	
	//Constructor	//Whatever we receive the driver from the page factory will assign to the webdriver
	//Using this constructor, all the methods below gets initialsed, so we use this in order to initialse all the methods
	public EncaPom2_LoginPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
		//Here "this" in the bracket is used to refer Class Object.
		
		//this.driver=driver;//3
	}
	//Works when we have 2 or more locator values...Check VerifyLogin Page
	/*public void login(String uid, String pwd) {
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pwd);
	}*/
	
	public void typeUsername(String usname) {
		driver.findElement(username).sendKeys(usname);
	}
	
	public void clickContinueBut() {
		driver.findElement(login).click();
	}

}
