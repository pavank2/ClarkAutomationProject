package stepDefinitions;

import base.BasePage;
import com.qa.factory.DriverFactory;
import com.qa.pages.ConfirmSelectionPage;
import com.qa.pages.SelectPolicyPage;

//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import com.qa.util.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPolicyPageSteps {

	//WebDriver driver = DriverFactory.getDriver();
	SelectPolicyPage selectPolicyPage = new SelectPolicyPage();
	
	@Given("^User is on Select Policy Type Page$")
	public void user_is_on_select_recommendations_page(){
		selectPolicyPage.clickInlineAd();
		String selectPolicyHeader = selectPolicyPage.getSelectPolicyHeader();

		if(!selectPolicyHeader.equals("Unsere Empfehlungen für dich"))
			throw new IllegalStateException("Not on Select Policy Types Page");
	}

	@Then("^Select Policy Type$")
	public void select_policy() {
			selectPolicyPage.selectInsurancePolicy();
	}
	
	@Then("^Select Existing Contract$")
	public void select_existing_contract() {

		if(!(selectPolicyPage.selectExistingContract() instanceof ConfirmSelectionPage))
			throw new IllegalStateException("Not novigated to Confirm Selections Page");
	}
	
}
