package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.findElement(By.name("UserFirstName")).sendKeys("Shibin");
        driver.findElement(By.xpath("//input[contains(@id, 'UserLast')]")).sendKeys("P");
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
        
        
        
        
        

	}

}
