package com.demoblaze.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory 
{
	public static WebDriver checkBrowser(WebDriver driver,String current_project_dir,String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",current_project_dir+"/Drivers/chromedriver.exe");
			
			
			driver = new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", current_project_dir+"/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
				
		}
		
		return driver;
		
		
	}
	
	
	
}
