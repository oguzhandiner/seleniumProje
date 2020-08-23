package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        // .get() methodu ile ayni islevi gormektedir. istedigimiz siteye gitmemizi saglayan kod.
        webDriver.navigate().to("http://amazon.com");

        webDriver.navigate().back(); // gitmis oldugumuz sayfadan geri gelmemizi saglar.
        webDriver.navigate().forward(); // gitmis oldugumuz siteden ileri gitmemizi saglar.
        webDriver.navigate().refresh(); // gitmis oldugumuz sayfayi yeniler.

        webDriver.quit();

    }
}
