package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1SalesForce {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        /*
        Task 1 (Important) 
        1.  Navigate onto https://www.salesforce.com/in/form/signup/freetrial-sales/
        2.  Enter first name as “John”
        3.  Enter last name as “wick”
        4.  Enter work email as “john@gmail.com”
        5.  Select Job title as “IT Manager”
        6.  Select Employees as “101-500 employees”
        7.  Select country as “United Kingdom”
        8.  Do not fill the phone number
        9.  Click on check box 
        10. Click on start my free trial 
        11. Get the error message displayed “Enter a valid phone number”
        */
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        
        
        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        driver.findElement(By.name("UserLastName")).sendKeys("Wick");
        driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
        driver.findElement(By.name("CompanyName")).sendKeys("Allianz");
        
        driver.findElement(By.xpath("//a[text()='Main Services Agreement']/../../div[@class='checkbox-ui']")).click();
        
        WebElement usrTitle = driver.findElement(By.name("UserTitle"));
        WebElement cmpEmp = driver.findElement(By.name("CompanyEmployees"));
        WebElement cmpCountry = driver.findElement(By.name("CompanyCountry"));
        
        
        Select selectUsrTitle = new Select(usrTitle);
        Select selectCmpEmp = new Select(cmpEmp);
        Select selectCmpCountry = new Select(cmpCountry);
        
        
        selectUsrTitle.selectByVisibleText("IT Manager");
        selectCmpEmp.selectByVisibleText("26 - 100 employees");
        selectCmpCountry.selectByVisibleText("United Kingdom");
        
       
        
        
        driver.findElement(By.name("start my free trial")).click();
        
        
     //   driver.quit();
        
        System.out.println("Run Completed");
        
        

    }

}