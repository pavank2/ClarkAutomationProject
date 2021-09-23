package base;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.util.TestUtil;

public class BasePage {
	DriverFactory driverFactory;
	public WebDriver driver;
	Properties prop;
	private ConfigReader configReader;

	public BasePage(){
		driver= DriverFactory.getDriver();
	}
	public void initialize() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

}
