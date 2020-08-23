package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("http://a.testaddressbook.com/sign_in");
        WebElement email = webDriver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("testtechproed@gmail.com");
        WebElement password = webDriver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Test1234!");
        WebElement submit = webDriver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

    }
}
