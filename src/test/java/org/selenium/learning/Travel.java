package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Travel {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.diver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flightcentre.ca/flights?gad_source=1&gclid=EAIaIQobChMI5ffglvu7hwMV-hGtBh3MrAz8EAAYAiAAEgI6ZfD_BwE&gclsrc=aw.ds");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-testid ='trip-type']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@data-testid ='MenuList']/li[3]")).click();

        Set<String> w = driver.getWindowHandles();
        Iterator<String> it = w.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(parent);
        driver.findElement(By.xpath("//button[@data-testid ='traveller-count']")).click();
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//div[@data-testid='pax-selector-adult']//button[@data-testid='incrementor-plus']")).click();
        }
        driver.findElement(By.xpath("//button[@data-testid ='barAction']")).click();
        driver.findElement(By.xpath("//button[@data-testid ='fare-type']")).click();
        driver.findElement(By.xpath("//div[text() = 'Business Class']")).click();
        String type = driver.findElement(By.xpath("//button[@data-testid ='fare-type']")).getText();
        Assert.assertEquals(type, "Business Class");
        driver.findElement(By.id("origin")).sendKeys("ot");
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class ,'MuiBox-root')]/ul/li"));
        for (WebElement l : list) {
            if (l.getText().contains("Ottawa")){
                l.click();
                break;
            }

        }
    }
}
