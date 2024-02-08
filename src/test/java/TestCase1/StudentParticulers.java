package TestCase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StudentParticulers {
	 WebDriver Driver;
	@Test

	public void fillTheStudentAllTestCaseFelds() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Upendar Egurla\\Desktop\\Selenium Class\\chromedriver-win64\\chromedriver.exe");
    Driver = new ChromeDriver();
    Driver.get("https://telanganaepass.cgg.gov.in/");
    Driver.manage().window().maximize();
    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Thread.sleep(3000);
    Driver.findElement(By.xpath("//i[@class='fa fa-graduation-cap']")).click();
		
			
	}
		
		
	}
	
	
	
	
	

