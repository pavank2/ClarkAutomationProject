package stepDefinitions;

import base.BasePage;
import com.qa.factory.DriverFactory;
import com.qa.pages.ConfirmSelectionPage;
import com.qa.pages.SelectPolicyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * This class invokes and validates page elements for the page where user selects
 * the Recommended Insurance Policy card
 * Author: Pavan Kulkarni
 */
public class SelectPolicyPageSteps {

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
