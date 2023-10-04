package com.Preeti_JenkinsAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JenkinsSampleProject {
	
static WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void lauchBrowser(String browser)
	{
		//WebDriver driver=null;
		
		
		if(browser.contains("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver","./Driver/chrome.exe");

		driver = new ChromeDriver();
		}
		
		else if(browser.contains("Edge"))
		{System.setProperty("webdriver.edge.driver","./Driver/msedgedriver.exe");

		driver = new EdgeDriver();
		System.out.println("Launch browser is : " + browser);
			
		}
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Google"),"Title match");
		
		driver.quit();
	}

}
