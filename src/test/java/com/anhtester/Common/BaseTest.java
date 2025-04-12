package com.anhtester.Common;

import com.anhtester.Bai5LocationElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public static void createDriver(){


        driver = new ChromeDriver(); //Chọn chạy với trình duyệt
        driver.manage().window().maximize(); //Phóng to maxi trình duyệt
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//cấu hình thời gian tối đa tìm element trả về

    }

    public static void loginCRM(){
        //login page

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.InputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.InputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.InputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.InputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

    }

    public static void closeDriver(){
        //login page

        driver.quit();//tắt trình duyệt đi
    }
}
