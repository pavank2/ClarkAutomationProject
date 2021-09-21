package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;


public class RegisterPage {

   private WebDriver driver;
    @FindBy(xpath="//h1[@data-test-registration-page-header]")
    WebElement registerPageHeader;

    @FindBy(css="input[type='email']")
       WebElement email;
    
    @FindBy(css="input[type='password']")
    WebElement password; 
    
    @FindBy(css="button")
    WebElement submit;  
    
    @FindBy(xpath="//h1[contains(@class,'cucumber-reward-screen-header')]")
    WebElement successMsg;
  
    @FindBy(xpath="//a[contains(@href,'recommendations')]")
    WebElement viewRecos;
  
/********************************************************************************************/    

public RegisterPage(WebDriver driver) {

    PageFactory.initElements(driver, this);
    this.driver = driver;
}

public String getRegisterPageHeader(){
    return registerPageHeader.getText();
}
public void registerNewUser(String user,String pass) {
	
	email.sendKeys(user);
	password.sendKeys(pass);
	submit.click();
}

public String getSuccessMessage() {
    return successMsg.getText();
}

public SelectPolicyPage clickViewRecos() {
    viewRecos.click();
    return new SelectPolicyPage(driver);
}


}