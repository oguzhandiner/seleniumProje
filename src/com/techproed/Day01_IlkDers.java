package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        // Selenium ile ilk projemiz.
        // webDriver nesnesi(objesi) olusturarak webDriver'mizi kullanir hale getirdik.

        // .get() methodu ile istedigimiz siteye gidebiliriz.
        webDriver.get("http://google.com");

        // Driver'mizde acik olan pencereyi kapatir.
        webDriver.close();

        // Driver;mizde acik olan tum pencereleri kapatir.
        webDriver.quit();

        

    }
}
