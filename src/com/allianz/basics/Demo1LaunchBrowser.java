package com.allianz.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;


public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String browser ="chrome";
		
		if(browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			
					
		}
		else {
		
		driver =new ChromeDriver();
		
		
		}
		
		
		driver.get("https://www.facebook.com");
		
		
		System.out.println("Title : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Page Source : " + driver.getPageSource());
		
		
		driver.quit();

	}

}
