package com.qa.pages;

import com.qa.util.TestUtil;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BasePage;

/**
 * This class has elements for the page which lists the final contract details
 * Author: Pavan Kulkarni
 */

public class FinalContractsPage extends BasePage {
    @FindBy(xpath = "//button[@data-test-product-card='standard']//div[@class='_title_niboal']")
    private WebElement insuranceType;

    @FindBy(xpath = "//button[@data-test-product-card='standard']//div[@class='_subtitle_niboal']")
    private WebElement insuranceCompany;

    @FindBy(xpath = "//*[text()='Deine Verträge']")
    private WebElement finalContractsPageHeader;

    /*******************************************************************************/

    public FinalContractsPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public WebElement getFinalContractsPageHeader() {
        return finalContractsPageHeader;
    }

    // Verify contract details
    public void verifyContractDetails(String expectedPolicyType, String expectedCompany) {
        TestUtil.sleepNSeconds(6);
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        TestUtil.sleepNSeconds(3);
        String insuranceName = insuranceType.getText();
        String companyName = insuranceCompany.getText();

        Assert.assertEquals(expectedPolicyType, insuranceName);
        Assert.assertEquals(expectedCompany, companyName);
    }
}


