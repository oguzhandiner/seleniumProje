package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        webDriver.navigate().to("http://amazon.com");

        String sayfaTitle = webDriver.getTitle();
        System.out.println("ilk sayfanin Basligi: " + sayfaTitle);
        String sayfaUrl = webDriver.getCurrentUrl();
        System.out.println("ilk sayfanin URL'si: " + sayfaUrl);

        webDriver.navigate().back();

        String title = webDriver.getTitle();
        System.out.println("ikinci sayfanin basligi: " + title);

        webDriver.quit();



    }
}
