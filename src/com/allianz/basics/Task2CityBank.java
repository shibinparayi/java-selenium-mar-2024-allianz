package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Task2CityBank {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
        Task 2 
        1.  Navigate onto https://www.citibank.co.in/ssjsps/forgetuserid.jsp
        2.  Choose Credit Card
        3.  Enter credit card number as 4545 5656 8887 9998 
        4.  Enter cvv number 
        5.  Enter date as “14/04/2022”
        6.  Click on Proceed 
        7.   Get the text and print it “Please accept Terms and Conditions”
        */
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        
        //link text
        
        driver.findElement(By.linkText("select your product type")).click();
        driver.findElement(By.linkText("Credit Card")).click();
        
        driver.findElement(By.name("citiCard1")).sendKeys("4545");
        driver.findElement(By.name("citiCard2")).sendKeys("5656");
        driver.findElement(By.name("citiCard3")).sendKeys("8887");
        driver.findElement(By.name("citiCard4")).sendKeys("9998");
        
        driver.findElement(By.name("CCVNO")).sendKeys("123");
        
        driver.findElement(By.id("bill-date-long")).click();
        
        WebElement year = driver.findElement(By.xpath("//select[@data-handler=\"selectYear\"]"));
        Select selYear = new Select(year);
        selYear.selectByVisibleText("2022");
        
        
        WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
        Select selMonth = new Select(month);
        selMonth.selectByIndex(4);
        
        driver.findElement(By.linkText("15")).click();
        
        
        driver.findElement(By.className("colCTA")).click();
        
        System.out.println("Error MEssage :" + driver.findElement(By.xpath("//li[text()='• Please accept Terms and Conditions ']")).getText());
        
      
        
      //  driver.quit();
        
        
    }

}

