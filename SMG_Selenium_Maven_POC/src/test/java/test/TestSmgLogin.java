//package test;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//
//public class TestSmgLogin.java {
//  @Test
//  public void f() {
//  }
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//}
//
//======
//
//**
//* 
//*/
package test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
//import org.testng.annotations.Test;



import pages.*;

/**
* @author jjain
*
*/
public class TestSmgLogin {
	
	
	@Test
	public void verifyValidLogin() throws Exception	{
		String userid = "Jyoti";
		String passwd = "asms123";
		
		//WebDriver driver = null;
		//WebDriver driver;
		//WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("http://nj01smgapp5037-smggui.smg.iconectiv.com:8080/SMGASMS");
		//Thread.sleep(2000);
		SmgLogin login = new SmgLogin();		
		login.loginToSMG(userid, passwd);
		//driver.quit();
		//driver.close();
		//System.exit(0);
	}

}
