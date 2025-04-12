package com.anhtester.Bai7_WebDriver;

import com.anhtester.Bai5LocationElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DemoElements {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //login page
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.InputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.InputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.InputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.InputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@id ='side-menu']/li[contains(@class,'menu-item')]"));
        System.out.println("Menu Total: " + listMenu.size());

        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i).getText());
        }


        driver.quit();//tắt trình duyệt đi
        }
    }

