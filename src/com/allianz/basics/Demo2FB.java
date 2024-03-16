package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Demo2FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println("Title : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Page Source : " + driver.getPageSource());
		driver.quit();
		

	}

}
