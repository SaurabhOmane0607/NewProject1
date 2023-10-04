package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SS 

{
	@Test
	public void SS() throws InterruptedException, IOException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://aniwatch.to/");
		
        driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		File Dest= new File("C:\\Users\\Saurabh\\OneDrive\\Desktop\\SS\\ss1.png");
		
		FileUtils.copyFile(source, Dest);
		
		driver.close();
		
		
				
	}

}
