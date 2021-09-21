package com.qa.pages;

/**
 * This class has elements of page which allows the user to select her "policy type" and "existing contract"
 * Author: Pavan Kulkarni
 */

import base.BasePage;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPolicyPage extends BasePage {
//private WebDriver driver;

	@FindBy(css="h3[data-cucumber-recommendation-card-title='Private Altersvorsorge']")
	private WebElement privateRetirement;

	@FindBy(xpath="//*[text()='Bestehenden Vertrag hinzufügen']")
	private WebElement existingContract;

	/*******************************************************************************/

	public SelectPolicyPage() {
		super();
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}
	public void selectInsurancePolicy() {
		TestUtil.sleepNSeconds(2);
		privateRetirement.click();

	}
	public ConfirmSelectionPage selectExistingContract() {
		TestUtil.sleepNSeconds(2);
		existingContract.click();
		return new ConfirmSelectionPage();

	}

}
