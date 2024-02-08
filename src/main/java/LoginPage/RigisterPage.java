package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RigisterPage {
	WebDriver driver;

	public RigisterPage(WebDriver Driver) {
		this.driver = driver;
	}

	public void enterCreatNewAccount() {
		driver.findElement(By.partialLinkText("Create new account")).click();

	}
     public void enterTheFirstName() {
		driver.findElement(By.name("firstname")).sendKeys("Upendar");
	}

	public void enterTheLastName() {
		driver.findElement(By.name("lastname")).sendKeys("egurla");
	}

	public void enterTheEmail1(String email) {
		driver.findElement(By.name("reg_email__")).sendKeys("egurlaupendar123@gmial.com");
	}

	public void enterTheConfirmationEmail() {
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("egurlaupendar123@gmailcom");
	}

	public void enterThePassword() {

		driver.findElement(By.name("reg_passwd__")).sendKeys("mrf@12345");

	}

	public void enterTheEmai() {
		// TODO Auto-generated method stub
		
	}

	

	
	

	}


