package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import base.TestBase;

public class TestUtil extends TestBase{
	//static WebDriver driver;

//	TestUtil(WebDriver driver){
//		this.driver = driver;
//	}
	 public static long PAGE_LOAD_TIMEOUT = 20;
	   public static long IMPLICIT_WAIT = 20;

	
	   
	public static void takeScreenshotAtEndOfTest() {
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String currDir = System.getProperty("user.dir");
	 try {
		FileUtils.copyFile(scrFile, new File(currDir+"\\screenshots\\"+System.currentTimeMillis()+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	public static void selectRadioButton(String text) {
		
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='_radiobutton_1ybksg']//li"));
	
	    for(WebElement option: options) {
		  if(option.getText().equals(text)) {
			  option.click();
			  break;
		  }
	    }		  
		
	}
	
	public static void selectCheckBoxes(String[] checkBoxOptions) {
		
		for(String text: checkBoxOptions) {
			driver.findElement(By.xpath("//*[@id='"+text+"']/parent::div")).click();
		}
	}
	
	public static int generateRandomNum() {
		return 1000+new Random().nextInt(100000);
	}
	

	public static void clickStaleElement(WebElement element){
		boolean	 staleElement = true;
		while(staleElement){

			try{

				element.click();
				staleElement = false;

			} catch(StaleElementReferenceException e){

				staleElement = true;
			}

		}
	}
}
