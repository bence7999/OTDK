package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{

	public SampleTest() {
		driver = new ChromeDriver();
	}
	
	
	@Test(enabled = true)
	public void test01()
	{
		

	}
	
}
