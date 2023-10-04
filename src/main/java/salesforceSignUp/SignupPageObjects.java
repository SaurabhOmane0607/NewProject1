package salesforceSignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects 
{
	public static WebDriver driver;

	private By Fname= By.xpath("//input[@name='UserFirstName']");
	
	private By Lname=By.xpath("//input[@name='UserLastName']");

	private By Email=By.xpath("//input[@name='UserEmail']");

	private By JobTitle=By.xpath("//select[@name='UserTitle']");

	private By CompanyName= By.xpath("//input[@name= 'CompanyName']");
	
	private By Employees= By.xpath("//select[@name= 'CompanyEmployees']");

	private By Phone= By.xpath("//input[@name= 'UserPhone']");
	
	private By Country =By.xpath("//select[@name= 'CompanyCountry']");
	
	private By Checkbox =By.xpath("(//div[@class= 'checkbox-ui'])[1]");
	
	public SignupPageObjects(WebDriver driver2) 
	{
		this.driver= driver2;
	}

	public WebElement enterFname()
	{
		return driver.findElement(Fname);
		
		
	}

	public WebElement enterLname()
	{
		return driver.findElement(Lname);
		
	}

	public WebElement enterEmail()
	{
		return driver.findElement(Email);
		
	}
	
	public WebElement enterJobTitle()
	{
		return driver.findElement(JobTitle);
		
	}
	
	public WebElement enterCompanyName()

	{
		return driver.findElement(CompanyName);
		
	}
	
	public WebElement enterPhone()
	{
		return driver.findElement(Phone);
		
	}

	public WebElement enterCountry()
	{
		return driver.findElement(Country);
		
	}

	public WebElement enterCheckbox()
	{
		return driver.findElement(Checkbox);
		
	}
	
	public WebElement enterEmployees()
	{
		return driver.findElement(Employees);
		
	}

	
	

}
