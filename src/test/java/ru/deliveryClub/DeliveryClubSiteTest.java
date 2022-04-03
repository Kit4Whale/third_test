package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeliveryClubSiteTest extends WebDriverSettings {

    @Test
    public void checkTheSite() {
        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
    }
}
