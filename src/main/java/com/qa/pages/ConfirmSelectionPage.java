package com.qa.pages;

import com.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

/**
 * This class has elements for the page where user does a final selection of the insurance company and type of policy
 * Author: Pavan Kulkarni
 */
public class ConfirmSelectionPage extends BasePage {

   // private WebDriver driver;
    @FindBy(css = "[data-cucumber-selection-search='input']")
    WebElement searchBar;

    @FindBy(css = "div[data-cucumber-category-selection-quick-option='Privathaftpflicht']")
    WebElement natureOfPolicy;

    @FindBy(css = "div[data-cucumber-company-selection-quick-option='Axa']")
    WebElement selectedCompany;

    @FindBy(xpath = "//div[contains(@class,'continue')]//button")
    WebElement confirmSelection;

    @FindBy(xpath = "//a[contains(@href,'contracts')]")
    WebElement toContracts;

    @FindBy(xpath = "//h1[contains(@class,'_search-title_')]")
    WebElement pageHeader;

    @FindBy(xpath = "//div[contains(@class,'reward-screen')]")
    WebElement confirmationScreen;

    /*******************************************************************************/

    public ConfirmSelectionPage() {
        super();
        PageFactory.initElements(driver, this);
       // this.driver = driver;
    }

    public void selectNatureOfPolicy() {
        TestUtil.sleepNSeconds(2);
        WebElement natureOfPolicy = driver.findElement(By.xpath("//div[@data-cucumber-category-selection-quick-option='Privathaftpflicht']"));
        driver.findElement(By.xpath("//div[@data-cucumber-category-selection-quick-option='Privathaftpflicht']")).click();
        TestUtil.clickStaleElement(selectedCompany);
    }

    public void selectCompany() {
        //This is a bug, this selection is a workaround to get category types
        WebElement dummyClick = driver.findElement(By.xpath("//*[text()='ACE']"));
        TestUtil.clickStaleElement(dummyClick);
    }

    public void confirm() {
        TestUtil.sleepNSeconds(2);
        confirmSelection.click();
    }

    public WebElement getConfirmationScreen() {
        return confirmationScreen;
    }

    public FinalContractsPage navigateToContracts() {
        TestUtil.sleepNSeconds(2);
        toContracts.click();
        return new FinalContractsPage();
    }

    public String getPageHeader() {
        return pageHeader.getText();
    }

}