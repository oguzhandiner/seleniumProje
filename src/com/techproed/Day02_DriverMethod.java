package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        String title = webDriver.getTitle(); // gitmis oldugumuz sayfanin basligini alir.
        System.out.println(title);
        String url = webDriver.getCurrentUrl(); // gitmis oldugumuz sayfanin URL adresini alir.
        System.out.println(url);

        webDriver.quit();

    }
}
