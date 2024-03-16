package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://db4free.net");
        
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();
        
        ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
        
        driver.switchTo().window(window.get(1));
        
        driver.findElement(By.id("input_username")).sendKeys("Shibin");
        driver.findElement(By.id("input_password")).sendKeys("Shibin@123");
        driver.findElement(By.id("input_go")).click();
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(driver.getTitle());
        driver.close(); //close the current tab (window) only
        driver.switchTo().window(window.get(0));
        //driver.quit(); //close the driver (browser) itself
        System.out.println(driver.getTitle());
        driver.quit();
        
        

	}

}
