package com.anhtester.Bai5LocationElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ThuocTinhHTML {
    public static void main(String[] args) throws InterruptedException {

        //Setup mở trinh duyet chrome
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //code auto thao tac
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        //driver.findElement(By.className("btn")).click();
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);
        //driver.findElement(By.className("search_input")).sendKeys("Selenium");
        //driver.findElement(By.linkText("Forgot Password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);


        driver.quit();// Tắt trình duyệt
    }
}
