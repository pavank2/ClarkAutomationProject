package stepDefinitions;

import base.TestBase;
import com.qa.pages.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;

public class LandingPageSteps extends TestBase {
	TestBase base = new TestBase();

	LandingPage landingPage;
	@Given("^User is on landing Page$")
	public void user_is_on_landingPage() throws Throwable {
		base.initialize();
		landingPage = new LandingPage();
		landingPage.navigateToURL("https://staging.clark.de/de/app/contracts?cv=2");
	}

	@When("^Accept the Cookies$")
	public void accept_cookies() throws Throwable {
		 landingPage.acceptCookies();
	}

	@Then("^Navigate to Bedarf$")
	public void navigate_to_Bedarf() throws Throwable {
		  landingPage.clickRecommendations();
		  landingPage.startRecommendations();
	}

}
