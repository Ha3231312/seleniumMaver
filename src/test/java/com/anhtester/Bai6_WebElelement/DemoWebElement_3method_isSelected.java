package com.anhtester.Bai6_WebElelement;

import com.anhtester.Bai5LocationElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement_3method_isSelected {
    public static void main(String[] args) {
        WebDriver driver; //Khởi tạo driver
        driver = new ChromeDriver(); //Chọn chạy với trình duyệt
        driver.manage().window().maximize(); //Phóng to maxi trình duyệt
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//cấu hình thời gian tối đa tìm element trả về

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).click();

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).isSelected());

        driver.quit();//tắt trình duyệt đi
    }
}
