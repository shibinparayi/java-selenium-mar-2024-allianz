package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click on create new account
		
		//driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.findElement(By.linkText("Create new account")).click();
		
		
		//enter first name
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("Shibin");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.id("password_step_input")).sendKeys("fbpass@123");
		
		
		
		
		
		

	}

}
