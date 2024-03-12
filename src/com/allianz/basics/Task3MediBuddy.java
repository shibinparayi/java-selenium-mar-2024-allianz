package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Task3MediBuddy {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        
        /*
        Task 3
        1.  Navigate onto https://www.medibuddy.in/
        2.  Close if any popup and Click on Login
        3.  Click on I have Corporate Account 
        4.  Click on Learn More
        5.  Click on Skip
        6.  Click on Login using Username & Password
        7.  Enter username as john 
        8.  Enter password as john123 
        9.  Click on show password 
        10. Click log in 
        11.  Get the error message shown and print it in terminal  
        */
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.medibuddy.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                
         // Get the current window handle (main window)
   //     String mainWindowHandle = driver.getWindowHandle();
//        System.out.println("mainWindowHandle :" + mainWindowHandle);

        // Click on the element that triggers the pop-up window
        driver.switchTo().frame(driver.findElement(By.id("wiz-iframe")));
        driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.linkText("Login")).click();
        
        

        // Get all window handles
    //    Set<String> allWindowHandles = driver.getWindowHandles();

        // Loop through each window handle
 //       for (String handle : allWindowHandles) {
 //           if (!handle.equals(mainWindowHandle)) {
                
  //            System.out.println("handle :" + handle);
                // Switch to the pop-up window
   //             driver.switchTo().window(handle);

                // Perform actions on the pop-up window
                
        Thread.sleep(2000);
        
                driver.findElement(By.xpath("//div[text()='I have a Corporate Account']")).click();
                Thread.sleep(2000);
                driver.findElement(By.linkText("Learn More")).click();
                Thread.sleep(2000);
                driver.findElement(By.linkText("skip")).click();
                Thread.sleep(2000);
                driver.findElement(By.linkText("Login using Username & Password")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("username")).sendKeys("john");
                driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
                driver.findElement(By.id("password")).sendKeys("john123");
                driver.findElement(By.xpath("//input[@id='password']/../img")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//button[text()='Sign In']")).click();
                Thread.sleep(2000);
                String message = driver.findElement(By.xpath("//div[text()='Sorry, We are not able to connect your corporate account. Please use your phone number to login and use other services.']")).getText();
                System.out.println(message);          
              
                       

                // Close the pop-up window
          //      driver.close();
          //  }
   //     }

        // Switch back to the main window
   //     driver.switchTo().window(mainWindowHandle);
        
     //   driver.quit();

    }

}