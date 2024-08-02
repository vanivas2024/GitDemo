package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practice9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.diver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[1]"));

        List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
        originalList.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
    List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

        Assert.assertTrue(originalList.equals(sortedList));


        }


    }


