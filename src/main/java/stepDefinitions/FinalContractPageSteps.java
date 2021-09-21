package stepDefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.ConfirmSelectionPage;
import com.qa.pages.FinalContractsPage;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FinalContractPageSteps {
	FinalContractsPage finalContractsPage = new FinalContractsPage(DriverFactory.getDriver());

	@Given("^User is on Final Contracts Page$")
	public void verify_user_is_on_contracts_page() {

		if(!finalContractsPage.getFinalContractsPageHeader().isDisplayed())
			throw new IllegalStateException("Not on the correct Page");

	}

	@Then("Verify Policy Details {string} and {string}")
	public void verify_contract_details(String policyType,String company) {
		finalContractsPage.verifyContractDetails(policyType,company);
	}

	@Then("Complete the Test")
	public void close_browser(){
		DriverFactory.getDriver().quit();
	}
}
