package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Basepackages.BasePage;

public class TransferFund extends BasePage {
	WebDriver driver;
	public TransferFund(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//li[@id='transfer_funds_tab']")
	public WebElement Transferfund_Tab;
	
	@FindBy(name="fromAccountId")
	public WebElement From_Account;
	
	@FindBy(name="toAccountId")
	public WebElement To_Account;
	
	
	@FindBy(name="amount")
	public WebElement Account_Amount;
	
	@FindBy(name="description")
	public WebElement Description;
	
	@FindBy(id="btn_submit")
	public WebElement Continue_btn;
	
	@FindBy(id="btn_submit")
	public WebElement Submit_btn;

public void TransferFund() {
	Transferfund_Tab.click();
}
	
	
public Select Frm_Account() {
	return new Select(From_Account);
}
 
public Select To_Account() {
	return new Select(To_Account);
}

public void Amount(String amount) {
	Account_Amount.sendKeys(amount);
}

public void Description(String description) {
	Description.sendKeys(description);
}
public void DoContinue() {
	Continue_btn.click();
}
public void DoSubmit() {
	Submit_btn.click();
	
}










}