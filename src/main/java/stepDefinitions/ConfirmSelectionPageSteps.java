package stepDefinitions;

import com.qa.pages.ConfirmSelectionPage;
import com.qa.pages.FinalContractsPage;
import com.qa.pages.SelectPolicyPage;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ConfirmSelectionPageSteps {

	ConfirmSelectionPage confirmSelection = new ConfirmSelectionPage();

	@Given("^User is on Final Selection Page$")
	public void user_is_confirm_policy_page(){
		//SelectPolicyPage page= new SelectPolicyPage();
		//confirmSelection = page.verifyConfirmSelectionPage("Private Altersvorsorge");
		if(!confirmSelection.getPageHeader().contains("Private Altersvorsorge"))
			throw new IllegalStateException("User not on the Confirm Selection Page");
	}

	@Then("Select Company")
	public void select_company() {
		confirmSelection.selectCompany();
	}

	@Then("Select Nature Of Policy")
	public void select_policy_type() {
		confirmSelection.selectNatureOfPolicy();
	}

	@Then("^Confirm Selection$")
	public void confirm_selection() {
		confirmSelection.confirm();
	}

	@Then("^Verify Confirmation Page$")
	public void verify_confirmation_page() {
		if(!confirmSelection.getConfirmationScreen().isDisplayed())
			throw new IllegalStateException("Confirmation Page not seen");
	}

	@Then("^Navigate to Contracts$")
	public void navigate_to_contracts() {
		if(!(confirmSelection.navigateToContracts() instanceof FinalContractsPage))
			throw new IllegalStateException("Final contract not generated!");
	}
}
