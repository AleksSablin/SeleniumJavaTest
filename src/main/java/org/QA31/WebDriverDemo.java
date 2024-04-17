package org.QA31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.urn.su/ui/basic_test/");
        WebElement searchFiled = driver.findElement(By.id("name1"));
        searchFiled.sendKeys("topbicycle.ru");
        searchFiled.submit(); // открывает сайт по id
    }
}