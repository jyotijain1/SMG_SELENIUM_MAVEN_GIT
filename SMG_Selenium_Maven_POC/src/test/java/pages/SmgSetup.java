//package pages;
//
//public class SmgSetup {
//
//	public SmgSetup() {
//		// TODO Auto-generated constructor stub
//	}
//
//}
//=====
package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
@Parameters("browser")
public class SmgSetup  {

	private String url;
	//private String uid;
	//private String pass;
	private String browser;
	private String propsFile;	
	private Properties props;
	private WebDriver driver;

	
//	public WebDriver setUp() throws Exception {
//		
////		driver = new FirefoxDriver();
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////		return driver;
//		
//		driver = new ChromeDriver();
//		return driver;
//	}

	public WebDriver setup(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.firefox.marionette","C:\\webdrivertools\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\webdrivertools\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		return driver;
		
	}
	public SmgSetup(String file) {
		propsFile = file;
		setAtts();
	}
	
	private void setAtts() {
		props = new Properties();
		InputStream input = null;	 
		try {	 
			input = new FileInputStream(propsFile);	 
			// load a properties file
			 props.load(input);				
			url = props.getProperty("url");
			browser = props.getProperty("browser");
			System.out.println(url);
			//uid = props.getProperty("uid");
			//pass = props.getProperty("pass");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	public String getURL() {
		return url;
	}
//	public String getUID() {
//		return uid;
//	}
//	public String getPASS() {
//		return pass;
//	}
	public String getBrowser() {
		return browser;
	}

}

