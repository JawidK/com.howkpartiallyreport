package stepDefinitions;

import org.junit.Assert;

import PageObject.LoginPageObject;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends Base {
	LoginPageObject loginPageObject = new LoginPageObject();

	@Given("user is on retail website login")
	public void user_is_on_retail_website_login() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		//logger.info("ActualPageTitle is equal to ExpectedPageTitle");

	}

	@When("user click on my account")
	public void user_click_on_my_account() {
		loginPageObject.myAccount();

	}

	@And("user click on login")
	public void user_click_on_login() {
		loginPageObject.loginOption();
	}

	@And("user enter email {string}")
	public void user_enter_email(String emailValue) {
		loginPageObject.email(emailValue);

	}
	@And("user enter password {string}")
	public void user_enter_password(String passValue) {
		loginPageObject.password(passValue);

	
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		loginPageObject.loginButton();
		
	}
	@Then("user confirm the login status")
	public void user_confirm_the_login_status() {
		Assert.assertTrue(loginPageObject.validate());
	}

	
	

}
