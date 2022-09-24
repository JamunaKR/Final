/**
 * 
 */
package TTT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author RiChi
 *
 */
public class En_Verifypage {
	@Test
	public void validateLogin() {
		//call the browserFactory to launch the browser and url
WebDriver browser=En_BrowserFactory.startBrowser("firefox", "https://opensource-demo.orangehrmlive.com/"); //Observe carefully
		
		//create Page Object using Page Factory
		En_LoginPage login=PageFactory.initElements(browser, En_LoginPage.class); //Observe carefully
		
		//call the method
		login.login_Orange("Admin","admin123");
	}
	
}
