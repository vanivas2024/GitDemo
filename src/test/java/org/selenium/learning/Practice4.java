package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Practice4 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        int j = 0;
        driver.get("https://rahulshettyacademy.com/loginpagePractise");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//input[@value ='user']")).click();
        Thread.sleep(5000);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        WebElement dropdown = driver.findElement(By.cssSelector("select[data-style ='btn-info']"));
        Select options = new Select(dropdown);
        options.selectByVisibleText("Student");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
Thread.sleep(5000);

        String[] mobiles = {"iphone X", "Samsung Note 8", "Nokia Edge"};
        List<String> mobileProducts = Arrays.asList(mobiles);
        List<WebElement> items = driver.findElements(By.className("card-title"));
        w.until(ExpectedConditions.visibilityOfAllElements(items));
        for (int i = 0; i < items.size(); i++) {
            String mobileItems = items.get(i).getText();

            if (mobileProducts.contains(mobileItems)) {
                driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
            }


        }
        driver.findElement(By.xpath("//a[@class ='nav-link btn btn-primary']")).click();

    }
}