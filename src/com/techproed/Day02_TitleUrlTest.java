package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        // Acilan sayfamizi buyutur.
        webDriver.manage().window().maximize();

        webDriver.get("http://youtube.com");
        String title = webDriver.getTitle(); // gitmis oldugumuz sayfanin basligini alir.
        System.out.println("Sayfa Basligi: " + title);

        String url = webDriver.getCurrentUrl(); // gitmis oldugumuz sayfanin URL'sini alir.
        System.out.println("Sayfa Url: " + url);

        if(title.contains("video")){
            System.out.println("video kelimesini ICERIYOR");
        } else{
            System.out.println("video kelimesini ICERMIYOR");
        }
        webDriver.close();

    }
}
