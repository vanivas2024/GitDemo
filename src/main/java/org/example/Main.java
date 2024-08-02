package org.example;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) {
        //Chrome
        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/
        //Firefox
        /*System.setProperty("webdriver.gecko.driver", "C:\\Users\\vanit\\DriverExeFile\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/
        //Edge
        System.setProperty("webdriver.edge.driver", "C:\\Users\\vanit\\DriverExeFile\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.myntra.com/login");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close();
    }
}
