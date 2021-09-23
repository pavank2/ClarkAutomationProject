package stepDefinitions;

import base.BasePage;
import com.qa.factory.DriverFactory;
import com.qa.pages.LandingPage;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * This class invokes and tests page elements of the Clark Recommendation funnel Landing Page
 * Author: Pavan Kulkarni
 *
 */

public class LandingPageSteps{
	BasePage base = new BasePage();
	LandingPage landingPage;

	@Given("^Browser is launched$")
	public void launch_browser(){
		base.initialize();
		landingPage = new LandingPage();
	}

	@When("^User is on landing Page$")
	public void user_is_on_landingPage() throws Throwable {
		DriverFactory.getDriver().get("https://staging.clark.de/de/app/contracts?cv=2");
	}

	@When("^Accept the Cookies$")
	public void accept_cookies() throws Throwable {
		 landingPage.acceptCookies();
	}

	@Then("^Navigate to Recommendations")
	public void navigate_to_recommendations() throws Throwable {
		  landingPage.clickRecommendations();
		  landingPage.startRecommendations();
	}

}
