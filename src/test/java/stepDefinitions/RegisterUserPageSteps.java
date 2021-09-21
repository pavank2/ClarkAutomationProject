package stepDefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.RegisterPage;

import base.BasePage;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import com.qa.pages.SelectPolicyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.qa.util.TestUtil;

public class RegisterUserPageSteps extends BasePage {
  
	RegisterPage registerPage = new RegisterPage();

	@When("^User is on Registration Page$")
	public void verify_user_on_registerPage(){
		//String registerPageheader = driver.findElement(By.xpath("//h1[@data-test-registration-page-header]")).getText();
	    if(!registerPage.getRegisterPageHeader().equals("Sichere deinen Fortschritt"))
           throw new IllegalStateException("Not navigated to Registration Page");
		
	}
	
	@Then("^Enter Credentials and Submit$")
	public void enter_credentials() {
		String user = "user"+TestUtil.generateRandomNum()+"@gmail.com";
		String pass = "Passw0rd5448#";
		registerPage.registerNewUser(user,pass);
	}
	
	@Then("^Verify Recommendations Success Message$")
	public void verify_recommendation_message() {
		if(!registerPage.getSuccessMessage().equals("Deine Empfehlungen sind verfügbar"))
			throw new IllegalStateException("Recommendations not available!");
	}
	
	@Then("^Click View Recommendations$")
	public void click_view_recos() {

		if(!(registerPage.clickViewRecos() instanceof SelectPolicyPage))
			throw new IllegalStateException("Not navigated to Select Policy Page");
	}
	    
}
