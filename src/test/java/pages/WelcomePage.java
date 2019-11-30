package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
WebDriver driver;

//locate web element
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id = "signin_button")
public WebElement signinbtn;


//create a method

public void clickSignInBtn() {
	signinbtn.click();
}








}
