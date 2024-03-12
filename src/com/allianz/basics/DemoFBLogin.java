package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println("Title : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Page Source : " + driver.getPageSource());
		
		driver.findElement(By.id("email")).sendKeys("sp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("fb@login");
		driver.findElement(By.name("login")).click();
		
	//	driver.quit();
		

	}

}

