package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills {
	WebDriver driver;
	public PayBills(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Locate wenbelemt
	@FindBy(xpath= "//a[text()='Pay Bills']")
	public WebElement payeeBills;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/ul/li[2]/a")
	public WebElement addNewPayee;
	
	@FindBy(id="np_new_payee_name")
	public WebElement payeeName;
	
	@FindBy(id="np_new_payee_address")
	public WebElement payeeAddress;
	
	@FindBy(id="np_new_payee_account")
	public WebElement payeeAccount;
	
	@FindBy(id="np_new_payee_details")
	public WebElement payeeDetails;
	
	@FindBy(id="add_new_payee")
	public WebElement addBtn;

public void AddnewPayee(String myname , String myAddress, String myAccount, String mypayeeDetail){
	payeeBills.click();
	addNewPayee.click();
	payeeName.sendKeys(myname);
	payeeAddress.sendKeys(myAddress);
	payeeAccount.sendKeys(myAccount);
	payeeDetails.sendKeys(mypayeeDetail);
	addBtn.click();
	
	
}
}
	
	

