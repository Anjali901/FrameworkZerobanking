package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase04DataDriven {
	
	WebDriver driver;
	
	
	
	@Test(dataProvider = "banking")
	public void verifylogin(String username, String password) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id("signin_button")).click();
	    driver.findElement(By.id("user_login")).sendKeys(username);
	    driver.findElement(By.id("user_password")).sendKeys(password);
	    driver.findElement(By.name("submit")).click();
	    Thread.sleep(5000);
	    Assert.assertTrue(driver.getTitle().contains("Zero - Account Summary"), "User not login Invalid Credentials");
        System.out.println("User login successfully");
}
	@DataProvider(name = "banking")
	public Object[][] passdata(){
		Object[][] data = new Object[3][2];
		
	   data[0][0]="username";
	   data[0][1]="Password1";
		
	   data[1][0]="username";
	   data[1][1]="password";
	   
	   data[2][0]="username";
	   data[2][1]="Password2";
	   return data;
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
}
