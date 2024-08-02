package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Practice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanit\\DriverExeFile\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		/*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement selectdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(selectdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@text,'Chennai (MAA)')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[contains(@text,'Thiruvananthapuram (TRV)')])[2]")).click();
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(@text,'Thiruvananthapuram (TRV)')]")).click();
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option : options) {
        if(option.getText().equalsIgnoreCase("Indonesia")) {
        option.click();
        break;
        }

	}*/
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());



    }
}

