package com.qa.pages;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

/**
 * This class has elements for the Landing Page for Recommendations funnel
 * Author: Pavan Kulkarni
 */
public class LandingPage extends BasePage {

	@FindBy(xpath="//button[contains(@class,'btn-primary')]")
	private WebElement acceptCookies;

	@FindBy(xpath="//a[contains(@href,'recommendations')]")
	private WebElement recommendations;

	@FindBy(xpath="//a[contains(@href,'demandcheck')]//span")
	private WebElement getStarted;

//	@FindBy(name="cs_company_name")
//	private WebElement companyToSearch;

	/*******************************************************************************/

	public LandingPage() {
		super();
		PageFactory.initElements(driver, this);
	}

//	public void navigateToURL(String url) {
//		driver.get(url);
//	}

	public void acceptCookies() {
		TestUtil.sleepNSeconds(2);  //Sleep has been added to slow down execution speed, just for demo purposes
		acceptCookies.click();
	}

	public void clickRecommendations() {
		TestUtil.sleepNSeconds(2);
		recommendations.click();
	}

	public RecommendationPage startRecommendations() {
		TestUtil.sleepNSeconds(2);
		getStarted.click();
		return new RecommendationPage();
	}
}
