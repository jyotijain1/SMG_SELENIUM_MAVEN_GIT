////package pages;
////
////public class SmgLogin {
////
////	public SmgLogin() {
////		// TODO Auto-generated constructor stub
////	}
////
////}
////====
//
///**
// * 
// */
package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import pages.SmgSetup;

/**
 * @author jjain
 *
 */
//@Parameters("browser")
public class SmgLogin{

	//WebDriver driver;

	By userName = By.id("userId");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	
	
	
//	public LoginPage(String string, String string2) {
//		// TODO Auto-generated constructor stub
//	}

	public void loginToSMG(String uid, String pass)  throws Exception {

		//WebDriver driver = setUp();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SmgSetup tcprops = new SmgSetup("C:\\EclipseWorkspaces\\NewPC\\SMG_Selenium_Maven_POC\\src\\test\\java\\pages\\smg_data");
		//System.out.println(tcprops);
		
		WebDriver driver = tcprops.setup("chrome");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		String url = tcprops.getURL();
		//String uid = tcprops.getUID();
		//String pass = tcprops.getPASS();
		System.out.println(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get(url);
		//driver.get("http://nj01smgapp5037-smggui.smg.iconectiv.com:8080/SMGASMS");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			
		System.out.println(userName);
		driver.findElement(userName).isEnabled();
		driver.findElement(userName).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).isEnabled();
		driver.findElement(loginButton).click();
		
	    driver.quit();
	}
}
