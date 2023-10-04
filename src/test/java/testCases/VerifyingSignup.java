package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.BaseClass;
import salesforceSignUp.SignupPageObjects;

public class VerifyingSignup extends BaseClass
{
	@Test
	public void VerifySignup() throws IOException, InterruptedException 
	{
		driverInitialise();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		SignupPageObjects spo=new SignupPageObjects(driver);
		
		spo.enterFname().sendKeys("sriniwas");
		
		spo.enterLname().sendKeys("naidu");
		
		spo.enterEmail().sendKeys("sri123@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement j=spo.enterJobTitle();
		
		Select s = new Select(j);
		
		s.selectByIndex(2);
		
		spo.enterCompanyName().sendKeys("Amazon");
		
		WebElement E= spo.enterEmployees();
		
		Select s1= new Select(E);
		
		s1.selectByIndex(1);
		
		spo.enterPhone().sendKeys("9988445566");
		
		WebElement C= spo.enterCountry();

		Select s2= new Select(C);
		
		s2.selectByVisibleText("India");
		
		spo.enterCheckbox().click();
		
		Thread.sleep(4000);
		
		driver.close();

		
		
	}

}
