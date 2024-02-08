package TestCase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseJava.BaseProgram;
import LoginPage.RigisterPage;

public class RegisterTestCase extends BaseProgram {
   
WebDriver Driver;


	@Test
	public void registerWithAllTheTestCaseFields() throws InterruptedException {
		
Driver = launchTheBrowserAndEnterURL();

RigisterPage rigisterPage = new RigisterPage(Driver); {
	rigisterPage.enterCreatNewAccount();
	rigisterPage.enterTheFirstName();
	rigisterPage.enterTheLastName();
	rigisterPage.enterTheEmai();
	rigisterPage.enterTheConfirmationEmail();
	rigisterPage.enterThePassword();
		
}	
	}}		
		//Driver.findElement(By.id("day")).sendKeys("10");
		//Driver.findElement(By.id("month")).sendKeys("june");
		///Driver.findElement(By.id("year")).sendKeys("1998");
		//Driver.findElement(By.xpath("//input[@value='2']")).click();
		//Driver.findElement(By.name("websubmit")).click();
		//driver.findElement(By.xpath("//*[text()='Continue']")).click();
		//Driver.findElement(By.xpath("//input[@type='submit']")).click();
	


	

