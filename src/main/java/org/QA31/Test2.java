package org.QA31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // разворачивает браузер на весь экран
        driver.get("https://hippocrates64.ru/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание отображения страницы
        WebElement clickLink = driver.findElements(By.linkText("Видео")).get(0);
        clickLink.click();
        WebElement clickVideo = driver.findElement(By.id("mep_0"));
        clickVideo.click();// запускает воспроизведение видео
        try {
            Thread.sleep(3000); // видео воспроизводится в течение 3 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickVideo.click(); // выключает видео
        driver.close(); // закрытие браузера
        System.out.println("Тест пройден успешно!");
    }
}
