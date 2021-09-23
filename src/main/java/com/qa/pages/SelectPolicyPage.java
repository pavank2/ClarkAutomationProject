package com.qa.pages;
import base.BasePage;
import com.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class has elements of page which allows the user to select her "policy type" and "existing contract"
 * Author: Pavan Kulkarni
 */
public class SelectPolicyPage extends BasePage {

	@FindBy(css="h3[data-cucumber-recommendation-card-title='Private Altersvorsorge']")
	private WebElement privateRetirement;

	@FindBy(xpath="//*[text()='Bestehenden Vertrag hinzufügen']")
	private WebElement existingContract;

	@FindBy(xpath="//h1[contains(@class,'_hero-header_')]")
	private WebElement selectRecommendationsHeader;

	/*******************************************************************************/

	public SelectPolicyPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	public void selectInsurancePolicy() {
		TestUtil.sleepNSeconds(2);
		privateRetirement.click();
	}

	public void clickInlineAd(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'cucumber-modal-close')]")));
		TestUtil.sleepNSeconds(3);
		driver.findElement(By.xpath("//button[contains(@class,'cucumber-modal-close')]")).click();
	}

	public String getSelectPolicyHeader(){
	//	WebElement selectRecosHeader = driver.findElement(By.xpath("//h1[contains(@class,'_hero-header_')]"));
		return selectRecommendationsHeader.getText();
	}
	public ConfirmSelectionPage selectExistingContract() {
		TestUtil.sleepNSeconds(2);
		existingContract.click();
		return new ConfirmSelectionPage();
	}

}
