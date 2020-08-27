package com.itnycusa.creditCard.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {
	
	public static void main(String[] args) throws InterruptedException {
		//Local directory 
		//Users/mdzaman/Desktop/creditCard
		
		//Globaize the directory
		String baseDir = System.getProperty("user.dir");
		//System.out.println(baseDir);
		
		//Install & Set up Crome browser
		///Users/mdzaman/Desktop/creditCard/browserDriver/chromedriver
		String browserDriver = baseDir + "/browserDriver/chromedriver";
		System.out.println(browserDriver);
		
		//Set up the Selenium
		System.setProperty("webdriver.chrome.driver", browserDriver);
		
		//Set up webdriver with chrome browser
		WebDriver driver = new ChromeDriver();
	
		//Navigate to URL (https://www.chase.com/)
		driver.get("https://www.chase.com/");
		Thread.sleep(5000);
		
		//Close chrome browser
		driver.close();
	
	}  
}
