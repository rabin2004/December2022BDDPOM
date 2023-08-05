package stepDefinations;

import org.testng.Assert;

import basePkg.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactory.CommonFunctionalities;
import pageFactory.HomePage;
import pageFactory.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class SearchFunctionalityTest extends BaseClass{
	CommonFunctionalities cf = new CommonFunctionalities();
	HomePage hp = new HomePage();
	SearchResultPage srp = new SearchResultPage();
	
//	@Before // pre-requisite block
//	public void loadApp() {
//		initialization();
//		cf = new CommonFunctionalities();
//		hp = new HomePage();
//		srp = new SearchResultPage();
//	}
//	
//	@After // post-requisite block
//	public void closeApp() {
//		tearDown();
//	}
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
	    Assert.assertTrue(hp.homePageUrlValidation());
	}

	@When("customer enter valid product in search textbox")
	public void customer_enter_valid_product_in_search_textbox() {
	   hp.enterProductInSearchTxtBox(prop.getProperty("validProduct"));
	}

	@And("clicks search button")
	public void clicks_search_button() {
	   hp.clickSearchButton();
	}

	@Then("user should be in search result page")
	public void user_should_be_in_search_result_page() {
	    Assert.assertEquals(srp.returnActualSearchResultPageTitle(), 
	    		srp.returnExpectedSearchResultPageTitle(prop.getProperty("validProduct")));
	}

	@And("user should be able to see available products")
	public void user_should_be_able_to_see_available_products() {
	    Assert.assertTrue(srp.validatePositiveSearchResultHeader());
	}
	
	@When("customer enter invalid product in search textbox")
	public void customer_enter_invalid_product_in_search_textbox() {
		hp.enterProductInSearchTxtBox(prop.getProperty("invalidProduct"));
	}

	@Then("user should see no available product error message")
	public void user_should_see_no_available_product_error_message() {
	    Assert.assertTrue(srp.valdiateNoResultErrorMsgDisplay());
	}
	
	@And("hits enter key")
	public void hits_enter_key() {
		cf.hittingEnterKey();
	}
	
	@When("customer enter valid product {string} in search textbox")
	public void customer_enter_valid_product_string_in_search_textbox(String validProduct) {
		hp.enterProductInSearchTxtBox(validProduct);
	}
	
	@Then("user should be in search result page {string}")
	public void user_should_be_in_search_result_page_string(String validProduct) {
	    Assert.assertEquals(srp.returnActualSearchResultPageTitle(), 
	    		srp.returnExpectedSearchResultPageTitle(validProduct));
	}
	
	@When("customer enter invalid product {string} in search textbox")
	public void customer_enter_invalid_product_string_in_search_textbox(String invalidProduct) {
		hp.enterProductInSearchTxtBox(invalidProduct);
	}


}
