package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageClass {

	WebDriver Driver;

	public loginPageClass(WebDriver Driver) {
		this.Driver = Driver;
	}

	public void enterUserName11(String email) {

		Driver.findElement(By.id("email")).sendKeys(email);
	}

	public void enterPassword(String Password) {
		Driver.findElement(By.id("pass")).sendKeys(Password);
	}

	public void clickOnloginButtern() {
		Driver.findElement(By.xpath("//button[@type ='submit']")).click();

	}

}
