package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class SelectPolicyPage extends TestBase {
//WebDriver driver;
	 
  @FindBy(css="h3[data-cucumber-recommendation-card-title='Private Altersvorsorge']")
  WebElement privateRetirement;
  
  @FindBy(xpath="//*[text()='Bestehenden Vertrag hinzufügen']")
  WebElement existingContract;
/********************************************************************************************/    

 public SelectPolicyPage() {
	 //   this.driver = driver;
		PageFactory.initElements(driver, this);
	}
public void selectInsurancePolicy() {
	
	privateRetirement.click();
	
}
public ConfirmSelectionPage selectExistingContract() {
	existingContract.click();
	return new ConfirmSelectionPage();
	
}
//Not in use. To be removed later
public ConfirmSelectionPage verifyConfirmSelectionPage(String expectedConfirmSelectionPageHeader) {
	
	 String confirmSelectionPageHeader = driver.findElement(By.xpath("//h1[contains(@class,'_search-title_')]")).getText();
	    
		if(confirmSelectionPageHeader.contains(expectedConfirmSelectionPageHeader))
				return new ConfirmSelectionPage();
		else 
			throw new IllegalStateException("User not on the Right Page");
}


 

}
