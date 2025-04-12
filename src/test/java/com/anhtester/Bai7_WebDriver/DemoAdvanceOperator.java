package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAdvanceOperator {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));


        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        System.out.println(driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.google.com/");
        System.out.println(driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getWindowHandle());
        Thread.sleep(1000);
    }
}
