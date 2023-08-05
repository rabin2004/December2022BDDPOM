package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginFunctionalityPages;

public class LoginFunctionalityTest {
	HomePage hp = new HomePage();
	LoginFunctionalityPages lfp = new LoginFunctionalityPages();
	
	@And("user clicks on Account list link")
	public void user_clicks_on_account_list_link() {
	    hp.clickAccountListLink();
	}

	@And("user is in login page")
	public void user_is_in_login_page() {
	  Assert.assertTrue(lfp.validateSignInpageHeader());
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
	    lfp.enterEmailAddress("test@gmail.com");
	}

	@And("clicks continue button")
	public void clicks_continu_button() {
	   lfp.clickContinueBtn();
	}

	@And("enters invalid password")
	public void enters_invalid_password() {
	    lfp.enterPassword("test@12");
	}

	@And("clicks sign in button")
	public void clicks_sign_in_button() {
	   lfp.clickSignInBtn();
	}

	@Then("login should be failed showing error message")
	public void login_should_be_failed_showing_error_message() {
	    Assert.assertTrue(lfp.validateLoginErrorMsg());
	}
	
	@When("user enters invalid username {string}")
	public void user_enters_invalid_username(String username) {
		lfp.enterEmailAddress(username);
	}

	@And("enters invalid password {string}")
	public void enters_invalid_password(String password) {
		lfp.enterPassword(password);
	}
}
