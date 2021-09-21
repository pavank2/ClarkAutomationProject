package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LandingPage {

    private WebDriver driver;
	@FindBy(name="cs_company_name")
	private WebElement companyToSearch;

	@FindBy(xpath="//button[contains(@class,'btn-primary')]")
	private WebElement acceptCookies;

	@FindBy(xpath="//a[contains(@href,'recommendations')]")
	private WebElement recommendations;

	@FindBy(xpath="//a[contains(@href,'demandcheck')]//span")
	private WebElement getStarted;

	/**************************************************************/
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void navigateToURL(String url) {
		driver.get(url);
	}

	public void acceptCookies() {
		acceptCookies.click();
	}

	public void clickRecommendations() {
		recommendations.click();
	}

	public RecommendationPage startRecommendations() {
		getStarted.click();
		return new RecommendationPage(driver);
	}
}
