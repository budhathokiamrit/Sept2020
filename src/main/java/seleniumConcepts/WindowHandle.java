package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	WebDriver driver;
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='ybar-sbp']")).sendKeys("xpath");
		
	}

}
