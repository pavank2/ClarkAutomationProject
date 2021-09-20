package stepDefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.LandingPage;
import com.qa.pages.RecommendationPage;

import base.TestBase;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import com.qa.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RecommendationPageSteps extends TestBase {
	RecommendationPage recommendationPage = new RecommendationPage();
	LandingPage landingPage;
	
	@Given("^User is on Recommendations Page$")
	public void user_is_on_Recommendation_Page() throws Throwable {
		if(!driver.getTitle().contains("Clark"))
			throw new IllegalStateException();
		
		//recommendationPage.selectGender();
	}
	
	@When("^Select Birthday$")
	public void select_birthday() {

		recommendationPage.selectBirthDay();
		recommendationPage.clickNext();
	}
	
	@Then("^Select Gender$")
	public void select_gender() {

		recommendationPage.selectGender();
		WebElement locationPage = driver.findElement(By.xpath("//span[contains(text(),'Wo wohnst du?')]"));
		if(!locationPage.isDisplayed())
			throw new IllegalStateException("Not navigated to Location page");
	}
	
	@Then("^Select Location$")
	public void select_location() {

		recommendationPage.selectLocation();
		WebElement refinancePage = driver.findElement(By.xpath("//span[contains(text(),'finanzieren')]"));
		if(!refinancePage.isDisplayed())
			throw new IllegalStateException("Not navigated to RefinancePage page");
	}
	
	@Then("^Select Refinance$")
	public void select_refinance() {

		recommendationPage.reFinanceOption();
		WebElement vehiclePage = driver.findElement(By.xpath("//span[contains(text(),'Besitzt du eines der folgenden Fahrzeuge?')]"));
		if(!vehiclePage.isDisplayed())
			throw new IllegalStateException("Not navigated to Vehicle page");
	}
	
	
	@Then("^Select Vehicle Ownership$")
	public void select_vehicle_ownerShip() {
		recommendationPage.selectVehicleOwnerShip();
	    WebElement familyPage = driver.findElement(By.xpath("//span[contains(text(),'Wie ist deine Familiensituation?')]"));
		if(!familyPage.isDisplayed())
			throw new IllegalStateException("Not navigated to Family Situation page");
	}
	
	@Then("^Select Family Situation$")
	public void select_family_situation() {
		recommendationPage.selectFamilySituation();
		WebElement childrenPage = driver.findElement(By.xpath("//span[contains(text(),'Hast du Kinder')]"));
		if(!childrenPage.isDisplayed())
			throw new IllegalStateException("Not navigated to children page");
	}
	
	@Then("^Enter Number of Children$")
	public void enter_number_of_children() {
		recommendationPage.addChildren();
		WebElement professionPage = driver.findElement(By.xpath("//span[contains(text(),'Was machst du beruflich')]"));
		if(!professionPage.isDisplayed())
			throw new IllegalStateException("Not navigated to Profession page");
		
	}
	
	@Then("^Select Profession$")
	public void select_profession() {
		recommendationPage.selectProfession();
		WebElement freeTimePage = driver.findElement(By.xpath("//span[contains(text(),'deiner Freizeit')]"));
		if(!freeTimePage.isDisplayed())
			throw new IllegalStateException("Not navigated to Free time page");
		
	}
	

	@Then("^Select Free Time Options$")
	public void select_free_time_options() {
		recommendationPage.selectFreeTimeOptions();
		WebElement animalsPage = driver.findElement(By.xpath("//span[contains(text(),'Hast du Tiere?')]"));
		if(!animalsPage.isDisplayed())
			throw new IllegalStateException("Not navigated to Animals page");
		
	}
	
	@Then("^Select Animals$")
	public void select_animals() {
		recommendationPage.selectAnimals();
		WebElement salaryPage = driver.findElement(By.xpath("//span[contains(text(),'Jahresbruttogehalt?')]"));
		if(!salaryPage.isDisplayed())
			throw new IllegalStateException("Not navigated to Salary page");
		
	}
	
	@Then("^Enter Salary$")
	public void enter_salary() {
		if(!(recommendationPage.enterSalary() instanceof RegisterPage))
			throw new IllegalStateException("Not navigated to Register New User Page");
		
	}
}
