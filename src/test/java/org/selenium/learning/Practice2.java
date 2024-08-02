package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        Thread.sleep(2000);
        String[] veggies = {"Carrot", "Brocolli", "Beans"};
        List<String> listOfVeggies = Arrays.asList(veggies);
        int j = 0;

        List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < items.size(); i++) {

            String[] products = items.get(i).getText().split("-");
            String changedProductsName = products[0].trim();
            if (listOfVeggies.contains(changedProductsName)) {
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                j++;
                if (j == veggies.length)
                    break;

            }

        }
    }
}
