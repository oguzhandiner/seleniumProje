package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("http://facebook.com");

        // 1.Adim: email kutusuna techproed@gmail.com yazdiralim
        WebElement email = webDriver.findElement(By.id("email"));
        email.sendKeys("techproed@gmail.com");

        // 2 Adim: Sifre kutusuna Test1234 yazidralim
        WebElement password = webDriver.findElement(By.id("pass"));
        password.sendKeys("Test1234");

        // 3. Adim: Login butonunu bulma.
        WebElement loginButton = webDriver.findElement(By.xpath("//button[@name='login']"));
        loginButton.click();

        // Burada Java 3sn boyunca bekleyecek.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // https://www.facebook.com/login/
        String url = webDriver.getCurrentUrl();
        System.out.println(url);

        if(url.contains("login/")){
            System.out.println("Giris Basarisiz !");
        }else{
            System.out.println("Giris Basarili !");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webDriver.quit();


    }
}
