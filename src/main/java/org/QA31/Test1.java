package org.QA31;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // разворачивает браузер на весь экран
        driver.get("https://hippocrates64.ru/"); // открывает сайт
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ожидание отображения страницы
        WebElement renovationLink = driver.findElements(By.linkText("Медицинские работники")).get(0); // открыть страницу "Медицинские работники"
        renovationLink.click();
        WebElement searchFiled = driver.findElement(By.xpath("//*[@id=\"profile_45\"]/ul/li/a"));
        searchFiled.sendKeys("card.php?idd=45"); // выбрать любого врача
        searchFiled.click();
        System.out.println("Заголовок страницы - " + driver.getTitle());
        try {
            Thread.sleep(3000); // задержка 3 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit(); // закрытие браузера
        System.out.println("Баг - страница не доступна!");

    }
}