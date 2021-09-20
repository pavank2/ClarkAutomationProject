package com.qa.pages;

import java.util.List;

import com.qa.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import com.qa.util.TestUtil;

public class RecommendationPage extends TestBase {


	   @FindBy(xpath="//span[contains(@class,'datepicker')]")
			 WebElement datePicker;
		    
		    @FindBy (xpath = "//ul[@data-view='years']/li")
		      List<WebElement> years;
		    
		    @FindBy (xpath = "//ul[@data-view='months']/li")
		      List<WebElement> months;
		    
		    @FindBy (xpath = "//ul[@data-view='days']//li[20]")
		      WebElement day;
			 
		    @FindBy (xpath = "//button[@data-test-button-appearance='primary']")
		      WebElement next;
		  
	 
    @FindBy (xpath = "//li[@data-ember-action-178='178']")
      WebElement selectGender;
  
    @FindBy (xpath="//*[@id='Auto']/parent::div")
      WebElement autoVehicle;
    
    @FindBy (xpath="//*[@id='Motorrad']/parent::div")
      WebElement motorVehicle;
    
    @FindBy(css="input[type='text']")
       WebElement noOfChildren;
    
    @FindBy(css="input[placeholder='z.B. 40000']")
       WebElement salary; 
    
    @FindBy(css="button[data-test-button-appearance='primary']")
    WebElement saveBtn; 
  //
/********************************************************************************************/    

public RecommendationPage() {
		PageFactory.initElements(driver, this);

	}



public void selectBirthDay() {
	//driver.findElement(By.xpath("//span[contains(@class,'datepicker')]")).click();
	driver.findElement(By.xpath("//input[@data-picker='date-birthday']")).sendKeys("21.05.1986");
	//return new RecommendationPage();
}

public void selectGender() {

		//***************Need to change it*********************

		//driver.findElement(By.xpath("//ul[@class='_radiobutton_1ybksg']//li[2]")).click();

		TestUtil.selectRadioButton("Männlich");
	}

	public void selectLocation() {

	//	WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Wo wohnst du')]"));
		TestUtil.selectRadioButton("In einem gemieteten Haus");

	}


	public void reFinanceOption() {

	    TestUtil.selectRadioButton("Nein");
	}

	public void clickNext() {
		next.click();
	}


	public void selectVehicleOwnerShip() {
	
//WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Besitzt du eines der folgenden')]"));
	
	String[] vehicles = {"Auto","Motorrad"};
	TestUtil.selectCheckBoxes(vehicles);
	clickNext();
	
}

public void selectFamilySituation() {
	
//WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Familiensituation')]"));
	

		TestUtil.selectRadioButton("Ich bin verheiratet");

	
	//return driver.findElement(By.xpath("//span[contains(text(),'Hast du Kinder')]")).isDisplayed();
}

public void addChildren() {
	

	TestUtil.selectRadioButton("Ja");
	noOfChildren.sendKeys("23");
	clickNext();
	
//	return driver.findElement(By.xpath("//span[contains(text(),'Was machst du beruflich')]")).isDisplayed();
}

public void selectProfession() {
	
		
	TestUtil.selectRadioButton("Selbstständig");
	
//	List<WebElement> employeeTypes = driver.findElements(By.xpath("//ul[@class='_radiobutton_1ybksg']//li"));
//
//    for(WebElement type: employeeTypes) {
//	  if(type.getText().equals("und bin gesetzlich krankenversichert")) {
//		  type.click();
//		  break;
//	  }
//    }
	TestUtil.selectRadioButton("und bin gesetzlich krankenversichert");
    clickNext();
//	return driver.findElement(By.xpath("//span[contains(text(),'deiner Freizeit')]")).isDisplayed();
}


public void selectFreeTimeOptions() {
	
	String[] freeTimeOptions = {"Ich betreibe eine gefährliche Sportart","Ich arbeite gerne in Haus und Garten"};
	TestUtil.selectCheckBoxes(freeTimeOptions);
	clickNext();
	
	//return driver.findElement(By.xpath("//span[contains(text(),'Hast du Tiere?')]")).isDisplayed();
}


public void selectAnimals() {
	String[] animals = {"Hund","Katze"};
	TestUtil.selectCheckBoxes(animals);
	clickNext();
	
	//return driver.findElement(By.xpath("//span[contains(text(),'Jahresbruttogehalt?')]")).isDisplayed();
}

public RegisterPage enterSalary() {
	
	salary.sendKeys("50000");
	saveBtn.click();
	//return driver.findElement(By.xpath("//h1[@data-test-registration-page-header]")).isDisplayed();
    return new RegisterPage();
}


}

//
//WebDriverWait wait = new WebDriverWait(driver,30);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("button[contains(@class,'ember-view _button_dsfphm')][1]")));
//driver.switchTo().frame(0);

// Actions actions = new Actions(driver);
//   actions.moveToElement(datePicker).click().build().perform();
// datePicker.click();




//driver.findElement(By.xpath("//input[@data-picker='date-birthday']")).click();
//try {
//	Thread.sleep(5);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//
//WebElement element =  driver.findElement(By.xpath("//input[@data-picker='date-birthday']/following-sibling::span"));
//if (element.isEnabled()) {
//	 element.click();
//	 System.out.println("Clicked");
//}
		 
//WebElement element = driver.findElement(By.xpath("//input[@data-picker='date-birthday']/following-sibling::span"));
//WebDriverWait wait = new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.elementToBeClickable(element));
//
//JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("arguments[0].click();", element);

//Actions actions = new Actions(driver);
//actions.moveToElement(element).click().build().perform();
//
//
//int i=elements.size();
//
//while (i!=0) {
//	driver.findElement(By.xpath("//input[@data-picker='date-birthday']/following-sibling::span")).click();
//	i--;
//}



//while(i >=0) {
//   driver.findElement(By.xpath("//input[@data-picker='date-birthday']/following-sibling::span")).click();
//   i--;
//   
//
//
//   
//}
  

	 
// Actions actions = new Actions(driver);
//  actions.moveToElement(element).click().build().perform();
//JavascriptExecutor executor = (JavascriptExecutor) driver;
//executor.executeScript("arguments[0].click();", element);
//	WebElement year=null;
//	for (int j=0;j<years.size();j++) {
//		year = years.get(j);
//		if (year.getText().equals("1985")) {
//			year.click();
//			break;
//			}
//	}
//	
//	WebElement month=null;
//	for (int j=0;j<months.size();j++) {
//		month = months.get(j);
//		if (month.getText().equalsIgnoreCase("Aug")) {
//			month.click();
//			break;
//			}
//	}
//	
//	day.click();
 	
