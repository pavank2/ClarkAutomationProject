package com.qa.pages;
/**
 * This class has elements for the page which allows for a new user registration
 * Author : Pavan Kulkarni
 */

import base.BasePage;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage extends BasePage {

  // private WebDriver driver;
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

public RegisterPage() {
    super();
    PageFactory.initElements(driver, this);
   // this.driver = driver;
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
    TestUtil.sleepNSeconds(2);
    viewRecos.click();
    return new SelectPolicyPage();
}


}