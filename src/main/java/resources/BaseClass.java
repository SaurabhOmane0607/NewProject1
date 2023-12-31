package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver driver;
	
	public void driverInitialise() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Saurabh\\eclipse-workspace\\SaurabhMavenProject\\src\\main\\java\\resources\\data.properties");
		
		Properties p= new Properties();
		
		p.load(fis);
		
		String browserName= p.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		
		else
		{
			System.out.println("Incorrect Browser");
		}
	}

}
