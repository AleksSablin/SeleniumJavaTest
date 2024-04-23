package org.QA31;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Test3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // разворачивает браузер на весь экран
        driver.get("https://hippocrates64.ru/"); // открывает сайт
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // ожидание отображения страницы
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1900)"); // скроллинг страницы до нужного места
        try {
            Thread.sleep(3000); // задержка 3 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://vk.com/dc_gippokrat_blk"); // открывает ссылку "Вконтакте" в новом окне
        WebElement clickLink = driver.findElements(By.className("FlatButton__content")).get(0); // нажать кнопку "Подписаться"
        clickLink.click();
        try {
            Thread.sleep(5000); // задержка 5 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close(); // закрытие вкладки "Вконтакте"
        driver.quit(); // закрытие браузера
        System.out.println("Тест пройден успешно!");
    }
}
