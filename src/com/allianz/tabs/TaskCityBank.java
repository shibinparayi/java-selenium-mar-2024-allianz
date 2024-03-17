package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskCityBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		1.  Navigate onto https://www.online.citibank.co.in/
			2.  Close if any pop up comes 
			3.  Click on Login
			4.  Click on Forgot User ID?
			5.  Choose Credit Card
			6.  Enter credit card number as 4545 5656 8887 9998 
			7.  Enter cvv number 
			8.  Enter date as “14/04/2022”
			9.  Click on Proceed 
			10.  Get the text and print it “Please accept Terms and Conditions”
*/
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://www.online.citibank.co.in/");
        
        driver.findElement(By.xpath("//a[@class='newclose']")).click();
        driver.findElement(By.xpath("//a[@class='newclose2']")).click();
        driver.findElement(By.xpath("//a[@title='Login']")).click();
        
        ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(window.get(1));
        
      
        driver.findElement(By.xpath("//div[contains(text(),'Forgot User ID')]")).click();
        
        
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
      
        
        Thread.sleep(2000);
        
        driver.quit();
		
		
		
	}

}
