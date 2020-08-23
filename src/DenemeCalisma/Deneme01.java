package DenemeCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Deneme01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        WebElement search = webDriver.findElement(By.name("q"));
        search.sendKeys("youtube");
        search.submit();
        webDriver.navigate().back();
        WebElement gmail = webDriver.findElement(By.className("gb_g"));
        gmail.click();
        WebElement mail = webDriver.findElement(By.xpath("//a[@class='h-c-button h-c-button--primary hero-carousel__cta hero-carousel__cta--reg']"));
        mail.click();
        webDriver.close();
        webDriver.quit();




    }

}
