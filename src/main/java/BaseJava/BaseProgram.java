package BaseJava;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class BaseProgram {

	WebDriver Driver;
	 public Properties prop;

	public BaseProgram() {
		
	}
   File path = new File(System.getProperty("user.dir") + "\\TestData\\Config.properties");{

		 prop = new Properties();
		try {

			FileInputStream Fis = new FileInputStream(path);
			prop.load(Fis);
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
		} catch (Exception e) {

			e.printStackTrace();{}
			}
	
		} 
	// we will launch the browser enter URL

	public WebDriver launchTheBrowserAndEnterURL() {
		String Browsername = "Chrome";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Upendar Egurla\\Desktop\\Selenium Class\\chromedriver-win64\\chromedriver.exe");

		if (Browsername.equals("Chrome")) {
			Driver = new ChromeDriver();
		}
		// else if (Browsername.equals("Firefox")) {
		// Driver = new FirefoxDriver();}
		// else if(Browsername.equals("Microsoft Edge")) {
		// Driver = new EdgeDriver();}

		// else {
		// System.out.println("the browser not Find!!1`");}

		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// return Driver;
		return Driver;
	}

}
