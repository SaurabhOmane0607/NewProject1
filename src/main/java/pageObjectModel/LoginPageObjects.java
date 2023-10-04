package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects 
{
	
	public static WebDriver driver;
	
	
	private By Username = By.xpath("//input[@name='username']");
	
	private By Password= By.xpath("//input[@name='password']");
	
	private By Login = By.xpath("//button[@type='submit']");
	
	
	
	public LoginPageObjects(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	public WebElement enterUsername()
	{
		return driver.findElement(Username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement LoginButton()
	{
		return driver.findElement(Login);
	}

}
