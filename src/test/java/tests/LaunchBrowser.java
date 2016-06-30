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
			 		
			driver = new ChromeDriver();
		  	driver.get("https://google.com");
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 			 		
		 	driver.quit();

		 	
		} catch (Exception e) {
			 e.printStackTrace();
		}
	 	
	 
	}

}
