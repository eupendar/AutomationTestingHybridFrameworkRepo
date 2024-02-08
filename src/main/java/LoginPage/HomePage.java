package LoginPage;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class HomePage {

	 private static By driver;
	WebDriver Driver;

    public HomePage(WebDriver driver) {
		this.Driver = Driver;
    }
	public static void verifyLoginSuccessfultext() {
		String expectedText = "click on home page";
		
	 String actualText=driver.findElement((SearchContext) By.xpath("//a[@aria-label='Home']")).getText();
	 
	
	}
}
	
