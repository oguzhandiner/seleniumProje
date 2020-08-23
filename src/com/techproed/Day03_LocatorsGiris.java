package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("http://a.testaddressbook.com/");

        // ilk webElementimizi buluyoruz.
        // WebElement'imizi id(); locators kullanrak buluyoruz.
        WebElement signIn = webDriver.findElement(By.id("sign-in"));
        signIn.click(); // WebElement'imize tiklama islemi yapiyoruz.

        WebElement email = webDriver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");

        WebElement password = webDriver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");

        WebElement signInButton = webDriver.findElement(By.name("commit"));
        signInButton.click();

    }
}
