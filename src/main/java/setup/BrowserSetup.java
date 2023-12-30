package setup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {
	protected ChromeDriver driver;
	
	
	@BeforeSuite
	public void chromesetup(){
		System.setProperty("webdriver.chromem.driver", "C:\\Program Files\\Java\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	
	
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
	
	

}
