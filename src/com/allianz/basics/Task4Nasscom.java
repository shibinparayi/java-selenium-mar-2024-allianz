package com.allianz.basics;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4Nasscom {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        /*
        Task 4
        1.   Navigate onto https://nasscom.in/
        2.  Click on Login and then click on register 
        3.  Enter First name as admin
        4.  Enter Last name as pass
        5.  Enter email address as admin@gmail.com
        6.  Enter company name as Google
        7.  Select IT Consulting from dropdown
        8.  No need to automate CAPTCHA
        9.  Click on Register
*/
        
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://nasscom.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
          driver.findElement(By.linkText("Login")).click();
          driver.findElement(By.xpath("//li[text()='register']")).click();
          
          driver.findElement(By.xpath("//label[text()='First Name']/../input")).sendKeys("Shibin");
          driver.findElement(By.xpath("//label[text()='Last name']/../input")).sendKeys("P");
          driver.findElement(By.xpath("//label[text()='Email address']/../input")).sendKeys("sp@gmail.com");
          driver.findElement(By.xpath("//label[text()='Company Name']/../input")).sendKeys("Allianz");
          
          
          WebElement business = driver.findElement(By.id("edit-field-business-focus-reg"));
            Select selBusiness = new Select(business);
            selBusiness.selectByVisibleText("IT Consulting");
        
        
            driver.findElement(By.xpath("//input[@value='Register']")).click();
        
          
            
        
        
        
        
    }

}
