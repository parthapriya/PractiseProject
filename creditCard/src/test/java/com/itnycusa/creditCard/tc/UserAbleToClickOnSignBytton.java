package com.itnycusa.creditCard.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToClickOnSignBytton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseDir = System.getProperty("user.dir");
		String browserDriver = baseDir + "/browserDriver/chromedriver";
		System.out.println(browserDriver);
		System.setProperty("webdriver.chrome.driver", browserDriver);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chase.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-pt-name='unknwnlogin']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
