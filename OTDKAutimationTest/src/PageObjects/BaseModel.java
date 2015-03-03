package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseModel {
	
	protected WebDriver driver;
	
	public BaseModel() {
		this.driver = new FirefoxDriver();
	}
	
	public BaseModel(WebDriver driver) {
		//ezt leellenõrizni
		if(driver.equals(ChromeDriver.class))
			System.setProperty("webdriver.chrome.driver", "C:/Users/Tulajdonos/Documents/OTDK_Test/chromedriver.exe");
		this.driver = driver;
	}
	
	
	
}
