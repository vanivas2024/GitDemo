package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class practice5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//div[@class ='example']/a")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        String childInfo = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
        System.out.println(childInfo);
        driver.switchTo().window(parentId);
        String parentInfo = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
        System.out.println(parentInfo);




    }
}
