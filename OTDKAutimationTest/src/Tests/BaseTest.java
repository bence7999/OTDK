package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	
	public BaseTest() {
		this.driver = new FirefoxDriver();
	}
	
	public BaseTest(WebDriver driver) {
		//ezt leellenõrizni
		if(driver.equals(ChromeDriver.class))
			System.setProperty("webdriver.chrome.driver", "C:/Users/Tulajdonos/Documents/OTDK_Test/chromedriver.exe");
		this.driver = driver;
	}
	
	@BeforeMethod
	public void setup()
	{
		
		try {
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://test.otdk.hu");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	@AfterMethod
	public void teardown()
	{
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

	public void changeDriverToFirefox() {
		this.driver = new FirefoxDriver();
	}
	
	public void changeDriverToChrome() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Tulajdonos/Documents/OTDK_Test/chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	/*
	@Test(enabled = true)
	public void Test01()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Tulajdonos/Documents/OTDK_Test/chromedriver.exe");
//		bObj = new BaseObject(new FirefoxDriver());
		bObj = new BaseObject(new ChromeDriver());
		
	}
	*/
	
	
}
