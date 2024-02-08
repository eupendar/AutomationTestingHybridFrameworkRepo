package TestCase1;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseJava.BaseProgram;
import LoginPage.HomePage;
import LoginPage.loginPageClass;

public class LoginTestCase extends BaseProgram {

	WebDriver Driver;

	public loginPageClass loginPage;
	
@BeforeMethod
	public void setup() throws InterruptedException {

		 Driver = launchTheBrowserAndEnterURL();
		 Thread.sleep(3000);}

public LoginTestCase() {
	super();
	
}

@AfterMethod
	public void tearDown() {
		Driver.quit();

	}

	@Test(priority = 1)
	public void loginWithValidUsernameAndVaildPassword() throws InterruptedException {
		loginPageClass loginPage = new loginPageClass(Driver);
		loginPage.enterUserName11(prop.getProperty("username"));
		loginPage.enterPassword(prop.getProperty("password"));
		loginPage.clickOnloginButtern();

		//HomePage Homepage = new HomePage(Driver);
		//HomePage.verifyLoginSuccessfultext();
	}

	// loginWithInvalidUsernameAndValidPassword,

	@Test
	public void loginWithInvalidUsernameAndValidPassword() throws InterruptedException {
		loginPageClass loginPage = new loginPageClass(Driver);
		loginPage.enterUserName11(prop.getProperty("username"));
		loginPage.enterPassword(prop.getProperty("password"));
		
		loginPage.clickOnloginButtern();

	}

	// loginWithValidUsernameAndInvaildPassword

	//@Test
	public void loginWithValidUsernameAndInVadPassword1() throws InterruptedException {
		loginPageClass loginPage = new loginPageClass(Driver);
		loginPage.enterUserName11("8499065310");
		loginPage.enterPassword("Appolo@12345");
		loginPage.clickOnloginButtern();

	}

//loginWithNoUserNameAndNoPassword
	//@Test(priority = 4)
	public void loginWithNoUserNameAndNoPassword() throws Throwable {

	
		loginPage.clickOnloginButtern();
	}

}
