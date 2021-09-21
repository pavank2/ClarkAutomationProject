package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class SelectPolicyPage {
private WebDriver driver;

	@FindBy(css="h3[data-cucumber-recommendation-card-title='Private Altersvorsorge']")
	WebElement privateRetirement;

	@FindBy(xpath="//*[text()='Bestehenden Vertrag hinzufügen']")
	WebElement existingContract;
	/********************************************************************************************/

	public SelectPolicyPage(WebDriver driver) {
		//
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void selectInsurancePolicy() {

		privateRetirement.click();

	}
	public ConfirmSelectionPage selectExistingContract() {
		existingContract.click();
		return new ConfirmSelectionPage(driver);

	}

}
