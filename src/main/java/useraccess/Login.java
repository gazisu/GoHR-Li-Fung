package useraccess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import setup.BrowserSetup;

public class Login extends BrowserSetup{
	
	
	@BeforeMethod
	public void applink() {
		driver.get("https://celbd.com/lifungtest");
	}

	@AfterMethod
	public void browserclose() {
		this.driver.close();
	}
	
	@Test
	
	public void loginid() throws InterruptedException {
		driver.findElement(By.cssSelector("body > div.login-content > form > div:nth-child(1) > input")).sendKeys("Admin");
		driver.findElement(By.cssSelector("body > div.login-content > form > div:nth-child(2) > input")).sendKeys("x");
		driver.findElement(By.cssSelector("body > div.login-content > form > button")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Admin");
		Thread.sleep(2000);
	}

}
