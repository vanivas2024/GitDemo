package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Practice1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.name("name")).sendKeys("Vanitha");
        driver.findElement(By.name("email")).sendKeys("rahulshetty@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Learning@123");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Thread.sleep(2000);
        Select option = new Select(dropdown);
        option.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@type = 'date']")).sendKeys("2024-07-06");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        System.out.println(message);
        driver.close();


    }

}
