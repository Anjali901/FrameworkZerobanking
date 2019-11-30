package Basepackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseLogin {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
			 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("http://zero.webappsecurity.com/");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	

}