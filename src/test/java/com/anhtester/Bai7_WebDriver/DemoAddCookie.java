package com.anhtester.Bai7_WebDriver;

import com.anhtester.Bai5LocationElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAddCookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //login page
        driver.get("https://crm.anhtester.com/admin/authentication");
        //driver.findElement(By.xpath(LocatorsCRM.InputEmail)).clear();
        //driver.findElement(By.xpath(LocatorsCRM.InputPassword)).clear();
        //driver.findElement(By.xpath(LocatorsCRM.InputEmail)).sendKeys("admin@example.com");
        //driver.findElement(By.xpath(LocatorsCRM.InputPassword)).sendKeys("123456");
        //driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        Cookie newcookie = new Cookie("sp_session","8rc82f2cmjau1qqn79mj7et1ohtmbil3");
        driver.manage().addCookie(newcookie);
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();
    }
}
