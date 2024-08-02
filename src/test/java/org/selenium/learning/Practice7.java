package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice7 {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]/input")).click();
        String opt = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
        System.out.println(opt);
        WebElement options = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(options);
        dropdown.selectByVisibleText(opt);
        driver.findElement(By.id("name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();
        String message = driver.switchTo().alert().getText();
        if(message.contains(opt)){
            System.out.println("Alert success");
        }
        else{
            System.out.println("Alert Failed");
        }

        driver.switchTo().alert().accept();


        }




        }



