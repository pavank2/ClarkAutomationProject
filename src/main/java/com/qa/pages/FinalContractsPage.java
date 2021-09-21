package com.qa.pages;

/**
 * This class has elements for the page which lists the final contract details
 * Author: Pavan Kulkarni
 */
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class FinalContractsPage extends BasePage {
    //private WebDriver driver;
    @FindBy(xpath = "//button[@data-test-product-card='standard']//div[@class='_title_niboal']")
    WebElement insuranceType;

    @FindBy(xpath = "//button[@data-test-product-card='standard']//div[@class='_subtitle_niboal']")
    WebElement insuranceCompany;

    @FindBy(xpath = "//*[text()='Deine Verträge']")
    WebElement finalContractsPageHeader;

    /*******************************************************************************/

    public FinalContractsPage() {
        super();
        PageFactory.initElements(driver, this);
        //this.driver = driver;
    }

    public WebElement getFinalContractsPageHeader() {
        return finalContractsPageHeader;
    }

    // Verify contract details
    public void verifyContractDetails(String expectedPolicyType, String expectedCompany) {

        String insuranceName = insuranceType.getText();
        String companyName = insuranceCompany.getText();

        Assert.assertEquals(expectedPolicyType, insuranceName);
        Assert.assertEquals(expectedCompany, companyName);
    }
}


