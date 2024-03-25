package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Mar 21, 2024 – might be down between 2 and 5 PM IST
		Task 1 (Important) 
		1.  Navigate onto http://demo.openemr.io/b/openemr/
		2.  Update username as admin
		3.  Update password as pass
		4.  Select language as English (Indian)
		5.  Click on the login button
		6.  Click on Patient  Click New Search
		7.  Add the first name, last name
		8.  Update DOB as today's date 
		driver.findElement(By.id("form_DOB")).sendKeys("2024-01-12");
		9.  Update the gender
		10. . Click on the create new patient button above the form
		11. . Click on confirm create new patient button.
		12. . Print the text from alert box (if any error before handling alert add 5 sec wait)
		13. . Handle alert
		14. Close the Happy Birthday popup
		15. Get the added patient name and print in the console.
		*/
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("http://demo.openemr.io/b/openemr/");
        
        driver.findElement(By.name("authUser")).sendKeys("admin");
        driver.findElement(By.name("clearPass")).sendKeys("pass");
        
        driver.findElement(By.xpath("//select[@name='languageChoice']")).click();
        
        Select language = new Select(driver.findElement(By.xpath("//select[@name='languageChoice']")));
        language.selectByValue("1");
                              
        driver.findElement(By.id("login-button")).click();
        
        driver.findElement(By.xpath("//div[text()='Patient']")).click();
        driver.findElement(By.xpath("//div[text()='New/Search']")).click();
        

        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
                
        driver.findElement(By.name("form_fname")).sendKeys("PatFname");
        driver.findElement(By.name("form_lname")).sendKeys("Fullname");       
        driver.findElement(By.id("form_DOB")).sendKeys("2024-01-12");
        
        Select sex = new Select(driver.findElement(By.name("form_sex")));
        sex.selectByVisibleText("Male");
        
              
        driver.findElement(By.xpath("//button[@value='Create New Patient']")).click();
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modalframe']")));
        
        driver.findElement(By.xpath("//button[text()='Confirm Create New Patient']")).click();
        
        driver.switchTo().defaultContent();    

        
        
            
        
 //       js.executeScript("arguments[0].scrollIntoView();", Element);
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert Message : "+driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
        System.out.println("New data created : "+driver.findElement(By.xpath("//a[@title='To Dashboard']/span")).getText());
        
        driver.quit();              
                
        
        

	}

}
