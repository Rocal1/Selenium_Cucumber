package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefinition  {

	@Given("Inicialize the browser with chrome")
	public void inicialize_the_browser_with_chrome() throws Throwable {
		System.out.println("Inicialize the browser with chrome");
	}

	@And("Navigate to {string} site")
	public void navigate_to_site(String string) {
		System.out.println("Navigate to "+ string +" site");

	}

	@And("Click on Login link in home page to land on Secure sign in Page")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() {
		System.out.println("Click on Login link in home page to land on Secure sign in Page");
	}

	@When("User enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable{
		System.out.println("User enters "+username+" and "+password+" and logs in");
	}

	@Then("Verify that user is succesfully logged in")
	public void verify_that_user_is_succesfully_logged_in() {
		System.out.println("Verify that user is succesfully logged in");
	}

}
