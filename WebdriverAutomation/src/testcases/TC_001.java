package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void tcase1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementByName("pass").sendKeys("Hello");
		driver.findElementByXPath("//input[@type='submit']").click();
		driver.close();
	}
	
}
