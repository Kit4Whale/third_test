package ru.deliveryClub;

import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeliveryClubSiteTest {

    @Test
    public void checkTheSite() {
        System.setProperty("webdriver.chrome.driver", "/Users/nikitastrahov/Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));

        driver.quit();
    }
}
