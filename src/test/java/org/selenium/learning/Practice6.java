package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com");
            driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
            driver.switchTo().frame("frame-top");
            driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']/frame[@name ='frame-middle']")));
            System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
        }

}