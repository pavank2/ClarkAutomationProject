package stepDefinitions;
import com.qa.factory.DriverFactory;
import com.qa.pages.ConfirmSelectionPage;
import com.qa.pages.FinalContractsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * This class invokes and validates the page elements for the Confirm Selection Page
 * Author: Pavan Kulkarni
 */
public class ConfirmSelectionPageSteps {

	ConfirmSelectionPage confirmSelection = new ConfirmSelectionPage();

	@Given("^User is on Final Selection Page$")
	public void user_is_confirm_policy_page(){
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
