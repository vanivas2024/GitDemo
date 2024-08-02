package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;


public class Pagination {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.diver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        List<String> price;
        do {
            List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
            price = elementsList.stream().filter(s -> s.getText().contains("Mango")).map(s -> getProductPrice(s)).collect(Collectors.toList());
            price.forEach(a -> System.out.println(a));

            if (price.size() < 1) {
                driver.findElement(By.cssSelector("a[aria-label ='Next']")).click();
            }


        }
        while (price.size() < 1);
    }

    private static String getProductPrice(WebElement s) {
        String pricevalue = s.findElement(By.xpath("//following-sibling::td[1]")).getText();
        return pricevalue;
    }
}
