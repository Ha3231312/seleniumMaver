package com.anhtester.Bai6_WebElelement;

import com.anhtester.Bai5LocationElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementCRM {
    public static void main(String[] args) {
        WebDriver driver; //Khởi tạo driver
        driver = new ChromeDriver(); //Chọn chạy với trình duyệt
        driver.manage().window().maximize(); //Phóng to maxi trình duyệt
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//cấu hình thời gian tối đa tìm element trả về

        //login page
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.InputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.InputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.InputEmail)).sendKeys("admin3333@example.com");
        driver.findElement(By.xpath(LocatorsCRM.InputPassword)).sendKeys("123456");
        //driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        System.out.println("Css background Login: " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("background-color") );
        System.out.println("Css Color Login: " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("color") );
        System.out.println("Css font-size Login: " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-size") );
        System.out.println("Css width Login: " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("width") );
        System.out.println("Css font-family Login: " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-family") );
        System.out.println("Css height Login: " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("height") ); //Hàm này trả về kết quả 33.6 px

        //Hàm làm tròn từ 33.6 thành 34
        //System.out.println("Css height Login: " + (int) Math.ceil(Double.parseDouble(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("height").replace("px", "").trim())) + "px");

        //get attribute
        System.out.println("get attribute");
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.InputEmail)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.InputPassword)).getAttribute("value"));

        //get size
        System.out.println("height Login: " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().height );
        System.out.println("width Login: " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().width );


        System.out.println("Tag Name : " + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getTagName());
        System.out.println("header login : " + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getText());
        System.out.println("alertErrorMassage: " + driver.findElement(By.xpath(LocatorsCRM.alertMassage)).isDisplayed());


        driver.get("https://anhtester.com/");
        System.out.println("isDisplay (login button): " + driver.findElement(By.xpath("//a[@id='btn-login']")).isDisplayed());




        driver.quit();//tắt trình duyệt đi
    }
}
