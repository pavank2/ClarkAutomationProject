package stepDefinitions;

import base.TestBase;
import com.qa.factory.DriverFactory;
import com.qa.pages.LandingPage;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LandingPageSteps{
	//TestBase base = new TestBase();
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	LandingPage landingPage;

	@Given("^Browser is launched$")
	public void launch_browser(){
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		landingPage = new LandingPage(DriverFactory.getDriver());
	}

	@When("^User is on landing Page$")
	public void user_is_on_landingPage() throws Throwable {
		//base.initialize();
		//landingPage = new LandingPage();
	//	landingPage.navigateToURL("https://staging.clark.de/de/app/contracts?cv=2");
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
