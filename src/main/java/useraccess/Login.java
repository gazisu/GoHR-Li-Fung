package useraccess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import setup.BrowserSetup;

public class Login extends BrowserSetup{
	
	
	@BeforeMethod
	public void applink() {
		driver.get("https://celbd.com/lifungtest");
	}

//	@AfterMethod
//	public void Appclose() {
//		this.driver.close();
//	}

	
	@Test
	public void login() throws InterruptedException {
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-main/app-login/html/body/div[2]/form/div[1]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/app-root/app-main/app-login/html/body/div[2]/form/div[2]/input")).sendKeys("x");
		driver.findElement(By.xpath("/html/body/app-root/app-main/app-login/html/body/div[2]/form/button")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
	
	}
		
		
	

}
