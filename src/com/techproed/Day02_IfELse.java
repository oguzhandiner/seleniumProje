package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfELse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://amazon.com");
        String title = webDriver.getTitle();

        // .contains() methodu ile herhangi bir kelime var mi yok mu sorgulamamizisaglayan kod.
        if(title.contains("books")){
            System.out.println("Sayfa Basliginda books kelimesi vardir.");
        } else {
            System.out.println("Sayfa Basliginda books kelimesi yoktur.");
        }
        webDriver.quit();


    }
}
