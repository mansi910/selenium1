package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchBrowser {
	private WebDriver driver;
	
	@Test
	public void executeTest() {
		
		try {
			
			capability = DesiredCapabilities.chrome();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\c5245770\\Downloads\\chromedriver.exe");
			//driver = new ChromeDriver();
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			driver.get("https://google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 			 		
			driver.quit();


		} catch (Exception e) {
			 e.printStackTrace();
		}
	 	
	 
	}

}
