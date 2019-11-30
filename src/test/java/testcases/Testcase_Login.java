package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountSummaryPage;
import pages.LoginPage;
import pages.WelcomePage;

public class Testcase_Login {
	WebDriver driver;
	LoginPage lp;
	WelcomePage wp;
	AccountSummaryPage asp;
@BeforeMethod
public void setup() {
		 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://zero.webappsecurity.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  lp = new LoginPage(driver);
		  wp =  new WelcomePage(driver);
		  asp = new AccountSummaryPage(driver);
		}
	
	
	
	
@Test
public void login() {
		wp.clickSignInBtn();
		lp.DoLogin("username","password");
		String expected = driver.getTitle();
		String actual = "Zero - Account Summary";
		Assert.assertEquals(actual , expected);
		
		
		
		
	}
	
@AfterMethod
public void teardown() {
driver.quit();
		
	}

}
