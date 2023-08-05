package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.BaseClass;

public class LoginFunctionalityPages extends BaseClass{
	
	@FindBy(css="div[class='a-box-inner a-padding-extra-large']>.a-spacing-small")
	WebElement signInpageHeader;
	@FindBy(name="email")
	WebElement emailAddressTxtBox;
	@FindBy(className="a-button-input")
	WebElement continueBtn;
	@FindBy(name="password")
	WebElement passwordTxtBox;
	@FindBy(id="signInSubmit")
	WebElement signInBtn;
	@FindBy(id="auth-error-message-box")
	WebElement loginErrorMsg;
	
	public LoginFunctionalityPages() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateSignInpageHeader() {
		return signInpageHeader.isDisplayed();
	}
	
	public void enterEmailAddress(String emailAddress) {
		emailAddressTxtBox.sendKeys(emailAddress);
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
	}
	
	public void enterPassword(String password) {
		passwordTxtBox.sendKeys(password);
	}
	
	public void clickSignInBtn() {
		signInBtn.click();
	}
	
	public boolean validateLoginErrorMsg() {
		return loginErrorMsg.isDisplayed();
	}
	

}
