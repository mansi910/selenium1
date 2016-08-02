package tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class LaunchBrowser {
	private static WebDriver driver;
	
	@Test
	public void executeTest() {
		
		try {
			DesiredCapabilities capability;
			capability = DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new RemoteWebDriver(new URL("http://10.64.139.115t:4444/wd/hub"), capability);	
			//driver = new ChromeDriver();
		  	driver.get("https://google.com");
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 			 		
		 	driver.quit();

		 	
		} catch (Exception e) {
			 e.printStackTrace();
		}
	 	
	 
	}

}
