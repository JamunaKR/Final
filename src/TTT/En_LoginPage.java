/**
 * 
 */
package TTT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author RiChi
 *
 */
public class En_LoginPage {

	WebDriver driver;
	
	//constructor
	public En_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
	
	//1
	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement username;	//1st decalaration here only
	
	/*for multiple elements to handle
	@FindBy(how=How.xpath,using="//a")
	@CacheLookup
	private List<WebElement> allLinks;*/
	
	//2				Or
	@FindBy(how=How.ID,using="txtPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	@CacheLookup
	WebElement login;
	
	public void login_Orange(String usn,String pwd) {
		username.sendKeys(usn);
		password.sendKeys(pwd);
		login.click();
		
	}
}
