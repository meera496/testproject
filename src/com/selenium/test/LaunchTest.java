package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTest {

	
	@Test
	public static void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtest\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
	}
}
