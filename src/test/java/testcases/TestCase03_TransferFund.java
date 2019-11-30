package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TransferFund;
import pages.WelcomePage;

public class TestCase03_TransferFund {
WebDriver driver;	
LoginPage lp;
     WelcomePage wp;
	TransferFund tf;
	
	@BeforeMethod
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://zero.webappsecurity.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  lp= new LoginPage(driver);
		  wp= new WelcomePage(driver);
		  tf= new TransferFund(driver);
		  }
	@Test
	public void VerifyTf() {
		
		wp.clickSignInBtn();
		lp.DoLogin("username","password");    // driver.findElement(By.xpath("//div[@class='alert alert-success']"))
		tf.TransferFund();
		tf.Frm_Account().selectByValue("2");
		tf.To_Account().selectByValue("3");
		tf.Amount("500");
		tf.Description("Savings");
		tf.DoContinue();
		tf.DoSubmit();
		//String Expected = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		//String Actual = "You successfully submitted your transaction.";
		//Assert.assertEquals();
	System.out.println("Sucessfully Transaction done");
	//System.out.println("Welcome to git");
	}
	
	
	
	
	
	
}
