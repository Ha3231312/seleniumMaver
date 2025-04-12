package com.anhtester.Bai6_WebElelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement_3method_isEnable {
    public static void main(String[] args) {

        WebDriver driver; //Khởi tạo driver
        driver = new ChromeDriver(); //Chọn chạy với trình duyệt
        driver.manage().window().maximize(); //Phóng to maxi trình duyệt
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//cấu hình thời gian tối đa tìm element trả về
        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).getText());

        driver.quit();//tắt trình duyệt đi

    }
}
