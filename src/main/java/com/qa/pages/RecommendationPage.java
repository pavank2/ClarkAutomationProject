package com.qa.pages;

import java.util.List;
import java.util.logging.Logger;

import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestUtil;
import org.apache.logging.log4j.*;

/**
 * This class contains elements and methods for the page which covers the entire process where user details are gathered
 * Combination of all the question panes is considered as a single page for ease of maintainability
 * Author: Pavan Kulkarni
 */
public class RecommendationPage extends BasePage {
    static Logger logger = Logger.getLogger(RecommendationPage.class.getName());


    @FindBy(xpath = "//input[@data-picker='date-birthday']/following-sibling::span")
    private WebElement datePicker;

    @FindBy(xpath = "//ul[@data-view='years']/li")
    private List<WebElement> years;

    @FindBy(xpath = "//ul[@data-view='months']/li")
    private List<WebElement> months;

    @FindBy(xpath = "//ul[@data-view='days']//li[20]")
    private WebElement day;

    @FindBy(xpath = "//button[@data-test-button-appearance='primary']")
    private WebElement next;


    @FindBy(xpath = "//li[@data-ember-action-178='178']")
    private WebElement selectGender;

    @FindBy(xpath = "//*[@id='Auto']/parent::div")
    private WebElement autoVehicle;

    @FindBy(xpath = "//*[@id='Motorrad']/parent::div")
    private WebElement motorVehicle;

    @FindBy(css = "input[type='text']")
    private WebElement noOfChildren;

    @FindBy(css = "input[placeholder='z.B. 40000']")
    private WebElement salary;

    @FindBy(css = "button[data-test-button-appearance='primary']")
    private WebElement saveBtn;

    @FindBy(xpath = "//span[contains(text(),'Wo wohnst du?')]")
    private WebElement locationPageHeader;

    @FindBy(xpath = "//span[contains(text(),'finanzieren')]")
    private WebElement refinancePageHeader;

    @FindBy(xpath = "//span[contains(text(),'folgenden Fahrzeuge?')]")
    private WebElement vehiclePageHeader;

    @FindBy(xpath = "//span[contains(text(),'Familiensituation')]")
    private WebElement familyPageHeader;

    @FindBy(xpath = "//span[contains(text(),'Hast du Kinder')]")
    private WebElement childrenPageHeader;

    @FindBy(xpath = "//span[contains(text(),'Was machst du beruflich')]")
    private WebElement professionPageHeader;

    @FindBy(xpath = "//span[contains(text(),'deiner Freizeit')]")
    private WebElement freeTimePageHeader;

    @FindBy(xpath = "//span[contains(text(),'Hast du Tiere?')]")
    private WebElement animalsPageHeader;

    @FindBy(xpath = "//span[contains(text(),'Jahresbruttogehalt')]")
    private WebElement salaryPageHeader;

    @FindBy(xpath = "//span[contains(text(),'Was ist dein Geschlecht?')]")
    private WebElement genderPageHeader;

    /********************************************************************************************/

    public RecommendationPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public void selectBirthDay() {
        logger.info("Selecting birthday");
        TestUtil.sleepNSeconds(3);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", datePicker);
        TestUtil.selectCalendarElement(years, "1985");
        TestUtil.selectCalendarElement(months, "Aug");
        TestUtil.sleepNSeconds(3);
        day.click();  //Iterating through 30 is not efficient, so selecting date directly
    }

    public void selectGender() {
        TestUtil.selectRadioButton("Männlich");
    }

    public void selectLocation() {
        TestUtil.selectRadioButton("In einem gemieteten Haus");
    }

    public void reFinanceOption() {
        TestUtil.selectRadioButton("Nein");
    }

    public void clickNext() {
        next.click();
    }


    public void selectVehicleOwnerShip() {
        String[] vehicles = {"Auto", "Motorrad"};
        TestUtil.selectCheckBoxes(vehicles);
        clickNext();
    }

    public void selectFamilySituation() {

        TestUtil.selectRadioButton("Ich bin verheiratet");
    }

    public void addChildren() {
        TestUtil.selectRadioButton("Ja");
        noOfChildren.sendKeys("23");
        clickNext();
    }

    public void selectProfession() {
        TestUtil.selectRadioButton("Selbstständig");
        TestUtil.selectRadioButton("und bin gesetzlich krankenversichert");
        clickNext();
    }


    public void selectFreeTimeOptions() {
        String[] freeTimeOptions = {"Ich betreibe eine gefährliche Sportart", "Ich arbeite gerne in Haus und Garten"};
        TestUtil.selectCheckBoxes(freeTimeOptions);
        clickNext();
    }


    public void selectAnimals() {
        String[] animals = {"Hund", "Katze"};
        TestUtil.selectCheckBoxes(animals);
        clickNext();
    }

    public RegisterPage enterSalary() {
        salary.sendKeys("50000");
        saveBtn.click();
        return new RegisterPage();
    }

    public WebElement getLocationPageHeader() {
        return locationPageHeader;
    }

    public WebElement getRefinancePageHeader() {
        return refinancePageHeader;
    }

    public WebElement getVehiclePageHeader() {
        return vehiclePageHeader;
    }

    public WebElement getFamilyPageHeader() {
        return familyPageHeader;
    }

    public WebElement getChildrenPageHeader() {
        return childrenPageHeader;
    }

    public WebElement getProfessionPageHeader() {
        return professionPageHeader;
    }

    public WebElement getFreeTimePageHeader() {
        return freeTimePageHeader;
    }

    public WebElement getAnimalsPageHeader() {
        return animalsPageHeader;
    }

    public WebElement getSalaryPageHeader() {
        return salaryPageHeader;
    }

    public WebElement getGenderPageHeader() {
        return genderPageHeader;
    }
}
