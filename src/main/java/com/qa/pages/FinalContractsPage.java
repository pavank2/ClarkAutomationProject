package com.qa.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
public class FinalContractsPage extends TestBase{
	private WebDriver driver;
	@FindBy(xpath="//button[@data-test-product-card='standard']//div[@class='_title_niboal']")
	WebElement insuranceType;
	
	@FindBy(xpath="//button[@data-test-product-card='standard']//div[@class='_subtitle_niboal']")
	WebElement insuranceCompany;

	@FindBy(xpath="//*[text()='Deine Verträge']")
	WebElement finalContractsPageHeader;



	public FinalContractsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public WebElement getFinalContractsPageHeader(){
		return finalContractsPageHeader;
	}
	public void verifyContractDetails(String expectedPolicyType,String expectedCompany) {
		
		String insuranceName = insuranceType.getText();
		String companyName = insuranceCompany.getText();

		Assert.assertEquals(expectedPolicyType,insuranceName);
		Assert.assertEquals(expectedCompany,companyName);
	}
}


