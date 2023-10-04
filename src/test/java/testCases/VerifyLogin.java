package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;

public class VerifyLogin extends BaseClass
{
	
	@Test
	public void LoginButton() throws IOException, InterruptedException
	{
		driverInitialise();
		
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys("Admin");
		
		Thread.sleep(3000);
		
		lpo.enterPassword().sendKeys("admin123");
		
		lpo.LoginButton().click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
	}

}
