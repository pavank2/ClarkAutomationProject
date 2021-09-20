package com.qa.pages;

import java.util.List;

import com.qa.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import com.qa.util.TestUtil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecommendationPage extends TestBase {


	@FindBy (xpath="//input[@data-picker='date-birthday']/following-sibling::span")
	WebElement datePicker;

	@FindBy (xpath = "//ul[@data-view='years']/li")
	List<WebElement> years;

	@FindBy (xpath = "//ul[@data-view='months']/li")
	List<WebElement> months;

	@FindBy (xpath = "//ul[@data-view='days']//li[20]")
	WebElement day;

	@FindBy (xpath = "//button[@data-test-button-appearance='primary']")
	WebElement next;


	@FindBy (xpath = "//li[@data-ember-action-178='178']")
	WebElement selectGender;

	@FindBy (xpath="//*[@id='Auto']/parent::div")
	WebElement autoVehicle;

	@FindBy (xpath="//*[@id='Motorrad']/parent::div")
	WebElement motorVehicle;

	@FindBy(css="input[type='text']")
	WebElement noOfChildren;

	@FindBy(css="input[placeholder='z.B. 40000']")
	WebElement salary;

	@FindBy(css="button[data-test-button-appearance='primary']")
	WebElement saveBtn;

	/********************************************************************************************/

	public RecommendationPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectBirthDay()  {

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", datePicker);
		TestUtil.selectCalendarElement(years,"1985");
		TestUtil.selectCalendarElement(months,"Aug");
		day.click();  //Iterating through days will be time-consuming, so selecting date directly
	}

	public void selectGender() {
		TestUtil.selectRadioButton("Männlich");
	}


	public void selectLocation() {
		TestUtil.selectRadioButton("In einem gemieteten Haus");
	}

	public void reFinanceOption() {

		TestUtil.selectRadioButton("Nein");
	}

	public void clickNext() {
		next.click();
	}


	public void selectVehicleOwnerShip() {
		String[] vehicles = {"Auto","Motorrad"};
		TestUtil.selectCheckBoxes(vehicles);
		clickNext();

	}

	public void selectFamilySituation() {

		TestUtil.selectRadioButton("Ich bin verheiratet");
	}

	public void addChildren() {
		TestUtil.selectRadioButton("Ja");
		noOfChildren.sendKeys("23");
		clickNext();
	}

	public void selectProfession() {
		TestUtil.selectRadioButton("Selbstständig");
		TestUtil.selectRadioButton("und bin gesetzlich krankenversichert");
		clickNext();
	}


	public void selectFreeTimeOptions() {
		String[] freeTimeOptions = {"Ich betreibe eine gefährliche Sportart","Ich arbeite gerne in Haus und Garten"};
		TestUtil.selectCheckBoxes(freeTimeOptions);
		clickNext();
	}


	public void selectAnimals() {
		String[] animals = {"Hund","Katze"};
		TestUtil.selectCheckBoxes(animals);
		clickNext();
	}

	public RegisterPage enterSalary() {
		salary.sendKeys("50000");
		saveBtn.click();
		return new RegisterPage();
	}


}
